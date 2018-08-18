package fr.nicolasgodefroy.facts;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import fr.nicolasgodefroy.facts.handlers.*;

public class JokeGeekFactsStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new JokeIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                // Add your skill id below
                .withSkillId("amzn1.ask.skill.0124ef52-d9fe-4f22-8602-9276e60ffe69")
                .build();
    }

    public JokeGeekFactsStreamHandler() {
        super(getSkill());
    }

}
