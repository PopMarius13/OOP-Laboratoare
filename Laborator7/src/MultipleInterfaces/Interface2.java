package MultipleInterfaces;

public interface Interface2 {
    default void print(){
        System.out.println("Interface 2 print 1");
    }
    default void print1() {
        System.out.println("Interface 2 print 2");
    }
}
