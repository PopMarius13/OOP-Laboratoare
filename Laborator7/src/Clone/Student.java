package Clone;

public class Student implements Cloneable{
    private String firstName;
    private String lastName;
    private Car car;

    public Student(String firstName, String lastName, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone();

        Student student = (Student) super.clone();
        student.car = (Car) student.getCar().clone();
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", car=" + car +
                '}';
    }
}
