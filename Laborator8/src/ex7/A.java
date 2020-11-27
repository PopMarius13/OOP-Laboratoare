package ex7;

public class A {

    public void throwException1(int val ) throws Exception1{
        if(val < 0)
            throw  new Exception1("This val is negative" );
    }
}
