package ex7;

public class B extends A{
    @Override
    public void throwException1(int val) throws Exception2 {
        if(val < 0){
            throw new Exception2("This val is negative 2");
        }
    }
}
