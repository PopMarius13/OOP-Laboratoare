package MultipleInterfaces;

public interface Interface3 {
    default void print(){
        System.out.println("Interface 3 print 1");
    }
    default void print1() {
        System.out.println("Interface 3 print 2");
    }
}
