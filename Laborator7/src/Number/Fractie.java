package Number;

public class Fractie implements Numeric {
    private int numerator;
    private int denominator;

    public Fractie() {
        this.denominator = 1;
    }

    public Fractie(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = ((denominator == 0) ? 1 : denominator);
    }

    @Override
    public void addition(int a, int b) {
        int n , d;

        n  = a * this.denominator + b * this.numerator;
        d = this.denominator * b;

       // simplification();

        this.denominator = d;
        this.numerator = n;
    }


    @Override
    public void setA(int a) {
        this.numerator = a;
    }

    @Override
    public int getA() {
        return this.numerator;
    }

    @Override
    public void setB(int b) {
        this.denominator = b;
    }

    @Override
    public int getB() {
        return this.denominator;
    }

    @Override
    public void subtraction(int a, int b) {
        this.addition( -a , b);
    }

    @Override
    public void multiplication(int a, int b) {
        this.numerator *= a;
        if(b != 0) {
            this.denominator *= b;
        }
       // simplification(); for double
    }

    /// greater common divisor
    private int gcd(int a , int b){
        if(b != 0)
            return a;
        return gcd(b , a%b);
    }

    public void simplification(){
        int d = gcd(this.numerator , this.denominator);
        if(d != 0) {
            this.denominator /= d;
            this.numerator /= d;
        }
    }

    @Override
    public String toString() {
        return  numerator +
                " / " + ((denominator > 0 ) ? denominator : "( " + denominator + " )");
    }
}
