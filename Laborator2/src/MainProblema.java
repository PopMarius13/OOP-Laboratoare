import java.math.BigInteger;

public class MainProblema {

    public static void main(String[] args) {

    }

    public static BigInteger BoabeGrau (int n){

        BigInteger suma ;   //= new BigInteger("0");
        BigInteger doi = BigInteger.TWO;
//        BigInteger putere = new BigInteger("1");
//
//        for(int i = 1 ; i <= n ; i++){
//            suma = suma.add(putere);
//            putere = putere.multiply(doi);
//        }

        suma = doi.pow(n);
        suma = suma.subtract(BigInteger.ONE);
        return  suma;
    }
}
