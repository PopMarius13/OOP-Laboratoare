
public class MainProblema41 {

    public static void main(String[] args) {
        int n = 15 , m = 40;
        int a[] = new int[5000];
        CiurulLuiEratostene(m + 1 , a);
       /// printCiurulEratostene(m , a);
        VerificareInterval(n , m , a);
    }


   static void CiurulLuiEratostene(int n , int a[]){
        /// punem 1 in toate valorile lui a, adica le consideram pe toate prime
        for(int i = 2 ; i < n ; i++)
            a[i] = 1;
        a[1] = 0;

        for(int i = 2 ; i <= n ; i++) {
            if(a[i] == 1){
                for(int j = 2 ; j*i <= n ; j++)
                    a[i*j] = 0;
            }
        }

    }

    static void VerificareInterval (int n , int m , int a[]){
        int ok = 1;
        for(int i = n ; i <= m && ok == 1; i++)
            if(i > 2 && i % 2 == 0)
            {
                int p = VerificareConjecturaGoldbach(i , a);
                if(p != 0)
                    System.out.println(i + " = " + p + " + " + (i - p) );
                else {
                    ok = 0;
                    System.out.println("Conjectura lui Goldbach este gresita pentru " + i);
                }
            }
        if(ok == 1)
            System.out.println("Conjectura lui Goldbach este corecta pe intervalul [" + n + " , " + m + "]");
    }

    static int VerificareConjecturaGoldbach (int x, int a[]){
        int  i = 2;
        while( i <= x/2){
            if(a[i] == 1 && a[x - i] == 1)
                return i;
            i++;
        }
        return 0;
    }


    static void printCiurulEratostene (int n , int a[]){
        for(int i = 1 ; i <= n ;i++)
            if(a[i] == 1)
                System.out.println(i + " este prim");
            else
                System.out.println(i + " nu este prim");
    }

}
