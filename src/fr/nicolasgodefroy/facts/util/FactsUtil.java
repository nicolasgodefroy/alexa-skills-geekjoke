package fr.nicolasgodefroy.facts.util;

import java.util.ArrayList;
import java.util.List;

public class FactsUtil {


    public static List getAllJoke() {
        List<String> keys = new ArrayList<>();
        keys.add("Comment appelle-t-on une personne réparant des tablettes Microsoft ?" + breakTime(1) + "Un technicien de surface");
        keys.add("Batman et  <phoneme alphabet=\"ipa\" ph=\"ˈɹob.ɪn\"/> ont un problème avec la Batmobile" +
                "<phoneme alphabet=\"ipa\" ph=\"ˈɹob.ɪn\"/> dit a Batman : On a un problème ! La Batmobile ne démarre pas..." +
                "Batman lui répond : Tu as vérifié la batterie ? <phoneme alphabet=\"ipa\" ph=\"ˈɹob.ɪn\"/> répond : C'est quoi une Terie ?");
        keys.add("Toc Toc qui est là ?" + breakTime(10) +"C'est Internet Explorer");
        keys.add("Les filles c'est comme les noms de domaine. Celles que j'aime sont déjà prises");
        keys.add("Que dit une mère à son fils geek quand le dîner est servi ? Alt Tab ");
        keys.add("T'as pris quoi comme résolution pour cette nouvelle année ? 2160p");
        keys.add("Quelle est la meilleure heure pour écouter de la musique ? Deezer");
        keys.add("De nos jours, le zip ça devient rar");
        keys.add("Comment appelle-t-on le sexe de la Schtroumpfette ? La Bluetouffe.");
        keys.add("Où partent les geeks en vacances ? Au C-Shell.");
        keys.add("Combien de développeurs pour changer une ampoule? Aucun, c’est un problème de hardware.");
        keys.add("Un geek ne descend pas du métro. Il libère la RAM.");
        keys.add("La vie d’un Geek ne tient qu’à un fil : le câble Ethernet.");
        keys.add("Dans Linux, il y a un noyau. Dans Windows, des pépins.");
        keys.add("Combien faut-il de développeurs C pour changer une ampoule ? 6. Un pour la changer et 5 autres six mois plus tard pour comprendre comment il a fait.");
        keys.add("Qu’est-ce qu’un geek déteste plus que Windows ? Les coupures de courant.");
        keys.add("Quel est le comble pour un geek ? Etre privé de sortie.");
        keys.add("Quelle est la différence entre un geek et Dracula ? Dracula ne sort que la nuit. Le geek ne sort pas du tout.");
        keys.add("Internet. On ne sait pas ce qu’on y cherche mais on trouve tout ce qu’on ne cherche pas.");
        return keys;
    }

    public static String breakTime(int sec) {
        return "<break time=\"" + sec + "s\"/>";
    }

}