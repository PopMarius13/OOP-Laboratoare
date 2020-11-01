public class NumarComplex {
    private double re;
    private double im;

    public NumarComplex() {
        this(0 , 0);
    }

    public NumarComplex(double re) {
        this(re , 0);
    }

    public NumarComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void adunare(NumarComplex z) {
        re = re + z.getRe();
        im = im + z.getIm();
    }
    public void scadere(NumarComplex z) {
        re = re - z.getRe();
        im = im - z.getIm();
    }

    public void inmultire(NumarComplex z) {
        re = re * z.getRe() - im * z.getIm();
        im = re * z.getIm() + im * z.getRe();
    }

    public double modul(NumarComplex z) {
        return z.getRe()*z.getRe() + z.getIm() * z.getIm();
    }

    public void impartire(NumarComplex z) {
        NumarComplex z1 = new NumarComplex(re , im);
        z1.inmultire(z);
        System.out.println(z1 + "  " + modul(z));
        re = z1.getRe() / modul(z1);
        im = z1.getIm() / modul(z1);
    }


    @Override
    public String toString() {
        if(im > 0)
            return "NumarComplex{ " + re + " + i*"+ im + " }";
        return "NumarComplex{ " + re + " +  i*(" + im + ") }";
    }
}
