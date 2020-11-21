package Person;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        //return this.getFirstName().compareTo(o.getFirstName());
        if(o.getAge() == this.getAge())
            return 0;
        return (o.getAge() > this.getAge()) ? -1 : 1 ;
    }
    @Override
    public String toString() {
        return  firstName + ' ' +
                lastName + ' ' +
                ", age=" + age +
                '}';
    }
}
