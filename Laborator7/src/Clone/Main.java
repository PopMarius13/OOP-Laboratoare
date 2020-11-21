package Clone;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("BMW" , "blue");
        Student student = new Student("Pop" , "Marius" , car);

        try {
            Student student1 = (Student)student.clone();

            System.out.println(student);
            System.out.println(student1);
            System.out.println();

            student.getCar().setColor("black");

            System.out.println(student);
            System.out.println(student1);
            System.out.println();

        } catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }

    }
}
