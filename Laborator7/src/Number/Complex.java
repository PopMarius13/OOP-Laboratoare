package Number;

public class Complex  implements Numeric{
    private int re;
    private int im;

    public Complex() {
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public void setA(int a) {
        this.re = a;
    }

    @Override
    public int getA() {
        return this.re;
    }

    @Override
    public void setB(int b) {
        this.im = b;
    }

    @Override
    public int getB() {
        return this.im;
    }


    @Override
    public void addition(int a, int b) {
        this.re += a;
        this.im += b;
    }

    @Override
    public void subtraction(int a, int b) {
        this.addition(-a , -b);
    }

    @Override
    public void multiplication(int a, int b) {
        int real , imaginary;

        real = this.re * a - this.im * b;
        imaginary = this.re * b + this.im * a;

        this.re = real;
        this.im = imaginary;
    }

    @Override
    public String toString() {
        return   re +
                " + i * " + ((im > 0) ? im : "( " +  im  + " )") ;
    }
}
