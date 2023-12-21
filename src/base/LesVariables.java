package base;

public class LesVariables
{
    public static void main(String[] args)
    {
        /**
         * la déclaration d'une variable en Java se fait selon la syntaxe suivante :
         * il faut préciser le type de la variable
         * suivi de son identificateur,de son nom,
         * et ne pas oublier le fameux petit point-virgule qui clôt l'instruction de déclaration.
         * Variables :
         *          * 1 - Primitive
         *          *      a - boolean : true, false
         *          *      b - char    : 'A', '9', '&' etc..
         *          *      c - int     : 10, -20, 15 etc
         *          *      d - float    : 17.45, 0.25 etc
         *          *      e - double  : 1000000000000000000099999.99999999999222232323
         *          *      f - byte(nombre entier de petite taille), short(nombre entier court), long (entier de grande taille)
         *          *
         *          * 2 - Reference / Objets
         *          *      - String,
         *          *      - Arrays,
         *          *      - Classe,
         */
        /*Les deux types élémentaires à disposition pour manipuler des données numériques*/
        int a;     /*Type entier  32 Bits  Autre :  long-> 64 Bits  byte-> 16 Bits*/
        double b; /*Type Decimaux 64  Bits Autre :  foat-> 32 Bits*/

       /* Le type élémentaires à disposition pour manipuler des caractere*/
        char c;

        /* Le type à disposition pour manipuler des chaine de caractere*/
        String str;

        /* Le type élémentaires à disposition pour manipuler des booleen*/
        boolean d;

        /**
         * Declaration de variable avec son identificateur puis initialisation
         * il est toujours souhaitable qu'une variable ait une valeur connue.
         * car Java ne permet pas dans un programme l'utilisation d'une variable non initialisée.
         */
        int nombre = 4;
        int nombreDePoint = 10;

        /**
         * Il est licite en Java de déclarer plusieurs variables sur une même ligne.
         *  donc on va déclarer sur une même ligne des variables du même type
         *
         */
        int p, q=4;

        /**
         * Il existe un certain nombre de règles à respecter lorsque l'on choisit un identificateur pour une variable :
         *  identificateur soit constitué uniquement de lettres, de chiffres ou de l'un des symboles spéciaux, _ ou $.
         *  le premier caractère doit nécessairement être une lettre ou de l'un des symboles spéciaux, _ ou $.
         *  l'identificateur ne doit pas être un mot clé réservé du langage Java
         *
         ******   le nommage des variables sous cette forme CavmelCase : ******
         *
         *   l'identificateur est constitué de plusieurs mots,
         *   on va séparer les mots en commençant chacun des mots par une majuscule
         *   avec la convention que tout identificateur de variable commence plutôt par une minuscule.
         */
         int nombreEtudiantPresent;

        /**
         * une affectation "=" n'est pas une égalité mathématique,
         * son rôle est de changer la valeur d'une variable en cours d'exécution d'un programme.
         * affectation c'est nom de la variable suivi du symbole = et suivi d'une expression
         */
         nombreEtudiantPresent=10;

    }
}
