package Number;

/**
 Creati o interfață Numeric care să conțină operații de adunare, scădere, înmulțire. Creați apoi
 următoarele clase care să implementeze interfața Numeric: Complex, Fractie. Implementați și o clasă
 Matrice care poate să aibă elemente de oricare din cele două tipuri (numere complexe / fracții). În
 clasa matrice implementați operațiile de adunare, scădere, înmulțire și înmulțire cu scalar. Testați
 funcționalitatea claselor într-o metodă main într-o clasă separată.
 */

public interface Numeric {
    public void addition (int a , int b);
    public void subtraction (int a , int b);
    public void multiplication (int a , int b);

    public void setA(int a);
    public int getA();
    public void setB( int b);
    public int getB();
}
