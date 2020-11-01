public class MatriceComplexa {

    private  NumarComplex[][] mat;
    private int n;
    private int m;

    public MatriceComplexa() {
        this(null , 0 , 0);
    }
    public MatriceComplexa(NumarComplex[][] mat) {
        this(mat, mat.length , mat[0].length);
    }

    public MatriceComplexa(NumarComplex[][] elem, int n, int m) {
        this.mat = elem;
        this.n = n;
        this.m = m;
    }

    public NumarComplex[][] getMat() {
        return mat;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }


    public void adunare(MatriceComplexa matrice) {
        if(n == matrice.getN() && m == matrice.getM()) {
            for( int i = 0; i < n; i++)
                for( int j = 0 ; j < m; j++){
                    this.mat[i][j].adunare(matrice.getMat()[i][j]);
                }
        }else System.out.println("Adunare imposibila");
    }
    public void scadere(MatriceComplexa matrice) {
        if(n == matrice.getN() && m == matrice.getM()) {
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    this.mat[i][j].scadere(matrice.getMat()[i][j]);
        }else System.out.println("Scadere imposibila");
    }
    public void inmultireScalar(NumarComplex z) {
        for( int i = 0; i < n; i++)
            for( int j = 0; j < m; j++)
                mat[i][j].inmultire(z);
    }

    public void inmultire(MatriceComplexa matrice){
       if(m == matrice.getN()){
           NumarComplex suma = new NumarComplex(0 , 0);
           NumarComplex produs = new NumarComplex(1 ,1);
           NumarComplex[][] newElems = new NumarComplex[n][matrice.getM()];

           for(int i = 0 ; i < n ; i++){
               suma.setIm(0);
               suma.setRe(0);
               for(int k = 0 ; k < n ; k++) {
                   for (int j = 0; j < matrice.getM(); j++) {
                       produs.setRe(mat[i][j].getRe());
                       produs.setIm(mat[i][j].getIm());
                       produs.inmultire(new NumarComplex(matrice.getMat()[j][i].getRe(), matrice.getMat()[j][i].getIm()));
                       suma.adunare(produs);
                   }
                   newElems[i][k] = suma;
               }
           }
           m = matrice.getM();
           mat = newElems;
       } else System.out.println("Nu se poate efectua inmultirea");
    }

    @Override
    public String toString() {
        String elemente = "";
        for( int i = 0; i < n; i++)
        {
            for( int j = 0; j < m; j++)
                elemente += mat[i][j].toString() + " ";
            elemente += "\n";
        }
        return "Matrice{" +
                "elem= \n"  + elemente +
                ", n=" + n +
                ", m=" + m +
                '}';
    }
}
