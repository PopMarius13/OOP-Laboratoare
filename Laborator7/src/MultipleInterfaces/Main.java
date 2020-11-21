package MultipleInterfaces;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss("Pop" , "Marius" , 20);

        boss.method1(new Interface1() {});
        boss.method2(new Interface2() {});
        boss.method3(new Interface3() {});
        boss.method4(new Interface4() {});

        boss.print();
        boss.print1();
        boss.print3();
    }
}
