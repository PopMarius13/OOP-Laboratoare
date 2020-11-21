package MultipleInterfaces;

public interface Interface4 extends Interface1 , Interface2, Interface3 {
    default void print3(){
        System.out.println("Interface 4 print 3");
    }

    @Override
    default void print() {
        Interface3.super.print();
    }

    @Override
    default void print1() {
        Interface2.super.print1();
    }
}
