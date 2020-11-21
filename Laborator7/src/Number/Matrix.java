package Number;

public class Matrix {
    private  Numeric[][] mat;
    private int n;
    private int m;

    public Matrix() {
        this(null , 0 , 0);
    }
    public Matrix(Numeric[][] mat) {
        this(mat, mat.length , mat[0].length);
    }

    public Matrix(Numeric[][] elem, int n, int m) {
        this.mat = elem;
        this.n = n;
        this.m = m;
    }

    public Numeric[][] getMat() {
        return mat;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }


    public void adunare(Matrix matrice) {
        if(n == matrice.getN() && m == matrice.getM()) {
            for( int i = 0; i < n; i++)
                for( int j = 0 ; j < m; j++){
                    this.mat[i][j].addition(matrice.getMat()[i][j].getA() , matrice.getMat()[i][j].getB());
                }
        }else System.out.println("Adunare imposibila");
    }
    public void scadere(Matrix matrice) {
        if(n == matrice.getN() && m == matrice.getM()) {
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    this.mat[i][j].subtraction(matrice.getMat()[i][j].getA() , matrice.getMat()[i][j].getB());
        }else System.out.println("Scadere imposibila");
    }
    public void inmultireScalar(Numeric z) {
        for( int i = 0; i < n; i++)
            for( int j = 0; j < m; j++)
                mat[i][j].multiplication(z.getA() , z.getB());
    }

    @Override
    public String toString() {
        String elemente = "";
        for( int i = 0; i < n; i++)
        {
            for( int j = 0; j < m; j++) {
                elemente += mat[i][j].toString() ;
                for(int k = 0 ; k < 17 - mat[i][j].toString().length() ; k++)
                    elemente += " ";
            }
            elemente += "\n";
        }
        return "Matrice \n" +
                 elemente +
                "\n " + n +
                " " + m ;
    }
}
