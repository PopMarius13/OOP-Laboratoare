package MultipleInterfaces;

public interface Interface1 {
    default void print(){
        System.out.println("Interface 1 print 1");
    }
    default void print1() {
        System.out.println("Interface 1 print 2");
    }
}
