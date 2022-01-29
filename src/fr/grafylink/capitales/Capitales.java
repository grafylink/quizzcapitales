package fr.grafylink.capitales;

import java.util.Scanner;

public class Capitales {
    static Scanner clavier = new Scanner(System.in);

    public static void main(String[] args) {
        String[] question = {"France", "Maroc", "Espagne"};
        String[] answer = {"Paris", "Rabat", "Madrid"};
        String[] reponse = new String[3];
        int score = 0;

      for(int i = 0; i< question.length; i++){
          System.out.println("Quel est la capitale du pays suivant : " + question[i]);
          reponse[i] = clavier.nextLine();
            if(answer[i].equalsIgnoreCase(reponse[i])){
            System.out.println("bravo c'est une bonne réponse");
            score++;
            }else{
                System.out.println("Désolé c'est une mauvaise réponse!");
            }
      }
        System.out.println("votre score final : " + score);
   }
}

