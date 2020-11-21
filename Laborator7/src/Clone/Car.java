package Clone;

public class Car implements Cloneable{
    private final String mark;
    private String color;

    public Car(String mark, String color) {
        this.mark = mark;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
