package ex7;

public class C extends B{
    @Override
    public void throwException1(int val) throws Exception3 {
        if(val < 0)
            throw new Exception3("This val is negative 3");
    }
}
