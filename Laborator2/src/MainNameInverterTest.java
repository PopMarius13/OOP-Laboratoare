import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainNameInverterTest {

    @Test
    public void Test() throws Exception{
        Assert.assertEquals(MainNameInverter.NameInverter("") , "");
        Assert.assertEquals(MainNameInverter.NameInverter(null) , null);
        Assert.assertEquals(MainNameInverter.NameInverter("Marius") , "Marius");
        Assert.assertEquals(MainNameInverter.NameInverter("Pop Marius") , "Marius, Pop");
        Assert.assertEquals(MainNameInverter.NameInverter("Mr. Pop Marius") , "Marius, Pop Mr.");
        Assert.assertEquals(MainNameInverter.NameInverter("Mr. Stu. Pop Marius"), "Marius, Pop Mr. Stu.");
        Assert.assertEquals(MainNameInverter.NameInverter("Marius  "), "Marius");
        Assert.assertEquals(MainNameInverter.NameInverter("Mr. Phd. FirstName LastName"), "LastName, FirstName Mr. Phd.");
    }
}