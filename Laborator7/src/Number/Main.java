package Number;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        Fractie z1 = new Fractie(rand.nextInt()%20 , rand.nextInt()%20);
        Fractie z2 = new Fractie(rand.nextInt()%20 , rand.nextInt()%20);
        System.out.println(z1);
        System.out.println(z2);
        z1.addition(z2.getA() , z2.getB());
        System.out.println("Adunarea lui z1 la z2 = " + z1);
        System.out.println();

        Fractie[][] matZ1 = new  Fractie[3][3];
        Fractie[][] matZ2 = new Fractie[3][3];

        for(int i = 0 ; i < 3; i++)
            for(int j = 0; j < 3 ; j++ ){
                z1 = new Fractie(rand.nextInt()%5, rand.nextInt()%5);
                matZ1[i][j] = z1;

                z2 = new Fractie(rand.nextInt()%5, rand.nextInt()%5);
                matZ2[i][j] = z2;
            }

        Matrix matrice1 = new Matrix(matZ1, 3, 3);
        Matrix matrice2 = new Matrix(matZ2, 3, 3);
        System.out.println("Prima matrice este: \n " + matrice1);
        System.out.println("\nA doua matrice este: \n" + matrice2);
        System.out.println();

        matrice1.adunare(matrice2);
        System.out.println("Matrice1 + matrice2 = \n" + matrice1);
        System.out.println();

        matrice1.scadere(matrice2);
        System.out.println("Matrice1 - matrice2 = vechea valoare a matricei1 \n" + matrice1);
        System.out.println();


        matrice1.inmultireScalar(new Fractie(2,1));
        System.out.println("Matricea inmultita cu z = 2 : \n" + matrice1);
        System.out.println();



        Complex z11 = new Complex(rand.nextInt()%20 , rand.nextInt()%20);
        Complex z22 = new Complex(rand.nextInt()%20 , rand.nextInt()%20);
        System.out.println(z11);
        System.out.println(z22);
        z11.addition(z22.getA() , z22.getB());
        System.out.println("Adunarea lui z1 la z2 = " + z11);
        System.out.println();

        Complex[][] matZ11 = new  Complex[3][3];
        Complex[][] matZ22 = new Complex[3][3];

        for(int i = 0 ; i < 3; i++)
            for(int j = 0; j < 3 ; j++ ){
                z11 = new Complex(rand.nextInt()%5, rand.nextInt()%5);
                matZ11[i][j] = z11;

                z22 = new Complex(rand.nextInt()%5, rand.nextInt()%5);
                matZ22[i][j] = z22;
            }

        Matrix matrice11 = new Matrix(matZ11, 3, 3);
        Matrix matrice22 = new Matrix(matZ22, 3, 3);
        System.out.println("Prima matrice este: \n " + matrice11);
        System.out.println("\nA doua matrice este: \n" + matrice22);
        System.out.println();

        matrice11.adunare(matrice22);
        System.out.println("Matrice1 + matrice2 = \n" + matrice11);
        System.out.println();

        matrice11.scadere(matrice22);
        System.out.println("Matrice1 - matrice2 = vechea valoare a matricei1 \n" + matrice11);
        System.out.println();


        matrice11.inmultireScalar(new Complex(2,1));
        System.out.println("Matricea inmultita cu z = 2 : \n" + matrice11);
        System.out.println();


    }
}
