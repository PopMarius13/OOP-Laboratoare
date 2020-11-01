import java.util.Random;

public class MainComplex {
    public static void main(String[] args) {
        Random rand = new Random();

        NumarComplex z1 = new NumarComplex(rand.nextInt()%20 , rand.nextInt()%20);
        NumarComplex z2 = new NumarComplex(rand.nextInt()%20 , rand.nextInt()%20);
        System.out.println(z1);
        System.out.println(z2);
        z1.impartire(z2);
        System.out.println("Impartirea lui z1 la z2 = " + z1);
        System.out.println();

        NumarComplex[][] matZ1 = new  NumarComplex[3][3];
        NumarComplex[][] matZ2 = new NumarComplex[3][3];

        for(int i = 0 ; i < 3; i++)
            for(int j = 0; j < 3 ; j++ ){
                z1 = new NumarComplex(rand.nextInt()%5, rand.nextInt()%5);
                matZ1[i][j] = z1;

                z2 = new NumarComplex(rand.nextInt()%5, rand.nextInt()%5);
                matZ2[i][j] = z2;
            }

        MatriceComplexa matrice1 = new MatriceComplexa(matZ1, 3, 3);
        MatriceComplexa matrice2 = new MatriceComplexa(matZ2, 3, 3);
        System.out.println("Prima matrice este: \n " + matrice1);
        System.out.println("\nA doua matrice este: \n" + matrice2);
        System.out.println();

        matrice1.adunare(matrice2);
        System.out.println("Matrice1 + matrice2 = \n" + matrice1);
        System.out.println();

        matrice1.scadere(matrice2);
        System.out.println("Matrice1 - matrice2 = vechea valoare a matricei1 \n" + matrice1);
        System.out.println();

        matrice1.inmultire(matrice2);
        System.out.println("Matrice1 * matrice2 =  \n" + matrice1);
        System.out.println();


        matrice1.inmultireScalar(new NumarComplex(2,0));
        System.out.println("Matricea inmultita cu z = 2 : \n" + matrice1);
        System.out.println();


    }
}
