package ex6;

public class MyMethods {

    private String g (int height) throws Exceptions {
        if(height < 130){
            throw new Exceptions("This height = " + height + "cm is too low");
        }
        return "Height is " + height + " cm";
    }

    public String f (int val) throws Exceptions1{
        try{
            return g(val + 10);
        }catch (Exceptions e){
            System.out.println(e);
            throw new Exceptions1("too low");
        }
    }
}
