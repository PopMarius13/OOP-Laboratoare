package ex7;

public class Main {
    public static void main(String[] args) {
        A myC = new C();

        try{
        myC.throwException1(-5);
        }catch (Exception1 e){
            System.out.println(e);
        }
    }
}
