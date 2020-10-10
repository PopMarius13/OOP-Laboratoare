
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;


public class MainProblemaTest {
    @Test
    public void Test() throws Exception{
        Assert.assertEquals(MainProblema.BoabeGrau(1),new BigInteger("1"));
        Assert.assertEquals(MainProblema.BoabeGrau(2),new BigInteger("3") );
        Assert.assertEquals(MainProblema.BoabeGrau(3),new BigInteger("7") );
        Assert.assertEquals(MainProblema.BoabeGrau(4),new BigInteger("15") );
        Assert.assertEquals(MainProblema.BoabeGrau(10),new BigInteger("1023") );

    }
}