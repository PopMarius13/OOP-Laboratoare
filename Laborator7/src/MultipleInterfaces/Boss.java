package MultipleInterfaces;

import Person.Person;

public class Boss extends Person implements Interface4  {
    public Boss(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void method1 (Interface1 i){
        i.print();
    }

    public void method2 (Interface2 i){
        i.print1();
    }

    public void method3 (Interface3 i){
        i.print();
    }

    public void method4 (Interface4 i){
        i.print3();
    }

    @Override
    public void print3() {
        Interface4.super.print3();
    }

    @Override
    public void print() {
        Interface4.super.print();
    }

    @Override
    public void print1() {
        Interface4.super.print1();
    }
}
