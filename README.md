# Alexa Skills - Blague de geek
An Alexa Skill to demonstrate how to write skills for Echo Show and Echo Spot in Java using the Alexa Skills Kit (ASK) SDK v2.

## Build

mvn assembly:assembly -DdescriptorId=jar-with-dependencies package'. This will generate a zip file named "airplanefacts-1.0-jar-with-dependencies.jar" in the target directory.

## Deploy
upload the package with dependencies to the AWS lambda

## Examples
### One-shot model:
    User: "Alexa, ouvre blague de geek."
    Alexa: "Bienvenu dans l'univers des geeks. Voulez-vous une blague de geek?"