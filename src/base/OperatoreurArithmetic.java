package base;

public class OperatoreurArithmetic {
    public static void main(String[] args) {
        /**
         * La somme       : + ;
         * La difference  : - ;
         * Le produit     : * ;
         * Le quotien     : / ;
         * Le Modulo      : % ;
         */
        //*Soit deux nombre a et b
        int a  = 10;
        int b = 7;
        int somme = a + b;
        int difference = a - b;
        int produit = a * b;
        int quotien = a / b;
        int modulo = a % b;

        System.out.print("\n");
        System.out.println("a = "+ a +" et b = "+ b);
        System.out.println("Somme : "+ somme);
        System.out.println("Difference : "+ difference);
        System.out.println("Produit : "+ produit);
        System.out.println("Quotien : "+ quotien);
        System.out.println("Modulo : "+ modulo);

        // Operateur d'incrementaion et de Decrementation
        // Post Incrementation/Decrementation
        a++; // a = a + 1;
        b--; // b = b - 1;

        System.out.println("\nPost Incrementation/Decrementation : a = "+a+" et b = "+b);

        // Post Incrementation/Decrementation avec pas
        a += 1; // a = a + 1
        a += 3; // a = a + 3
        b -= 1; // b = b - 1

        System.out.println("Post Incrementation/Decrementation avec pas : a = "+a+" et b = "+b);

        // Pre Incrementation / Decrementation
        ++a; // a = a + 1;
        --b; // b = b - 1;

        System.out.println("Pré Incrementation/Decrementation : a = "+a+" et b = "+b);

        //Operateur de comparaison
        boolean estEgala = (a == a);
        boolean estEgalb = (a == b);
        boolean estSuperieur = (a > b);
        boolean estInferieur = (a < b);

        System.out.println("\na est egale à a : "+estEgala);
        System.out.println("a est egale à b : "+estEgalb);
        System.out.println("a est supérieur à b : "+estSuperieur);
        System.out.println("a est inférieur à b : "+estInferieur);
    }
}
