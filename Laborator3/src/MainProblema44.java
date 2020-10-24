import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class MainProblema44 {
    public static void main(String[] args) {
        sanseDeCastigLoterie();
    }


    static void sanseDeCastigLoterie (){
        /// combinari de 49 luate cate 6
        /// 49! / (43! * 6!) = (44*45*46*47*48*49) / 2 * 3 * 4 * 5 * 6
        /// 22*9*46*47*8*49 / (3 * 4)
        /// 11*3*23*47*8*49
        /// sanse loterie =>  1 / 11*3*23*47*8*49

        BigInteger trei = new BigInteger("3");
        BigInteger opt = new BigInteger("8");
        BigInteger unsprezece = new BigInteger("11");
        BigInteger douzaZeciTrei = new BigInteger("23");
        BigInteger patruZeciNoua = new BigInteger("49");
        BigInteger patruZeciSapte = new BigInteger("47");

        BigInteger produs = trei.multiply(opt.multiply(unsprezece.multiply(douzaZeciTrei.multiply(patruZeciNoua.multiply(patruZeciSapte)))));

        BigDecimal produs1 = new BigDecimal(produs);
        BigDecimal sanse = BigDecimal.ONE.divide(produs1 , 50 , RoundingMode.HALF_DOWN);

        System.out.println("Sansele de castig la loterie sunt: 1 / " + produs + " = " + sanse);

    }
}
