package fr.nicolasgodefroy.facts.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import fr.nicolasgodefroy.facts.util.FactsUtil;

import java.util.*;

import static com.amazon.ask.request.Predicates.intentName;

public class JokeIntentHandler implements RequestHandler {

    private final String BLAGUE = "blague";

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("JokeIntent").or(intentName("AMAZON.YesIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        List<String> blagues;

        String speechText;
        String reprompt;
        Map<String, Object> attributes = input.getAttributesManager().getSessionAttributes();
        if (!attributes.containsKey(BLAGUE)) {
            attributes.put(BLAGUE, FactsUtil.getAllJoke());
            input.getAttributesManager().setSessionAttributes(attributes);
        }
        blagues = (List<String>) attributes.get(BLAGUE);
        if (blagues.size() <= 0 || attributes.containsKey("end")) {
            speechText = "Je n'ai <phoneme alphabet=\"ipa\" ph=\"ˈ[ply]\">plus</phoneme> de blague en réserve.";
            // Headless device
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withReprompt(speechText)
                    .withShouldEndSession(true)
                    .build();
        }
        else if (blagues.size() == 1) {
            attributes.put("end", true);
            input.getAttributesManager().setSessionAttributes(attributes);
            String key = blagues.get(0);
            speechText = "<speak> " + key + " </speak>";
            reprompt = "Voulez-vous une autre blague ?";
        } else {
            int index = new Random().nextInt(blagues.size());
            String key = blagues.get(index);
            blagues.remove(index);
            speechText = "<speak> " + key + " </speak>";
            reprompt = "Voulez-vous une autre blague ?";
        }
        // Headless device
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(reprompt)
                .withShouldEndSession(false)
                .build();
    }

}

