package base;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class LectureEcriture {
    public static void main(String[] args) {
        /**
         * Cette ligne est composée de deux parties :
         *  la sortie standard, ou encore terminal : "System.out.println"
         *      println, qui veut dire, print line et renvoie le curseur à la ligne,
         *      print, Sans retour à la ligne,
         *  Et la deuxième partie, ici, est le message composé de plusieurs morceaux
         *      une chaîne littérale, qui va s'écrire, telle quelle, sur la sortie
         *      une expression Java, c'est-à-dire quelque chose qui va être évalué
         *      composées à l'aide du signe, + "operateur de concatenation"
         *
         */
        int expression = 10;
        System.out.println("une chaîne littérale et expression évalué -> "+expression+" .");

        /**
         * Lecture D'une variable au clavier
         * importer ce que l'on appelle techniquement la classe Scanner. une seule fois dans le programme
         * import java.util.Scanner avec toujours le point-virgule.
         * Une fois que vous avez mis cette ligne, vous pouvez donc déclarer une variable,
         * je l'ai appelée ici keyb / sc / clav, une variable keyb donc de type Scanner.
         * Et la liant au clavier,l'entrée standard in comme input,
         * Le clavier ici, représenté par System.in. Cette ligne doit être écrite une fois et une seule pour tout le programme main
         */

        Scanner keyb = new Scanner(in);

        /**
         * Lire la valeur entrée au clavier selon son type
         *      int n = keyb.nextInt(); Lecture des entiers
         *      double b = keyb.nextDouble(); Lecture des decimaux
         *      String line = keyb.nextLine(); Lecture de la ligne
         */

        System.out.print("Entree une valeur : ");
        int valeur = keyb.nextInt();
        keyb.nextLine();
        System.out.print("Entree votre nom : ");
        String line = keyb.nextLine();
        System.out.println("La valeur est : "+valeur+" "+line);
    }
}
