package ex6;

public class Main {

    public static void main(String[] args){
        try{
            MyMethods myMethods = new MyMethods();
            System.out.println(myMethods.f(100));
        }catch (Exceptions1 e){
            System.out.println(e);
        }
    }
}
