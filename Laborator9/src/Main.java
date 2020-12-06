public class Main {

    public static void main(String[] args) {
        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

        IntegerMatrix integerMatrix = new IntegerMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');

        Double[][] m3 = new Double[][]{{1.5,2.4, 3.4}, {(double)4, 5d,(double) 6}, {(double)1, (double)1, (double)1}};
        Double[][] m4 = new Double[][]{{(double)1, 1.2, (double)1}, {2.6, 2d,2.6}, {(double)0, (double)0, (double)0}};

        DoubleMatrix doubleMatrix = new DoubleMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m3, m4, doubleMatrix.addMatrix(m3, m4), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m3, m4, doubleMatrix.multiplyMatrix(m3, m4), '*');


        Long[][] m5 = new Long[][]{{1L, 2L, 3444L}, {422L, 5443L, 654L}, {1L, 1L, 1L}};
        Long[][] m6 = new Long[][]{{1L, 1L, 1543L}, {2654L, 212L, 25L}, {0L, 0L , 0L}};

        LongMatrix longMatrix = new LongMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m5, m6, longMatrix.addMatrix(m5, m6), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(m5, m6, longMatrix.multiplyMatrix(m5, m6), '*');
    }
}
