package read;

import models.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<Product> readProducts(String filePath){
        try {
            int nrProd;
            List<Product> products = new ArrayList<>();

            BufferedReader bf = new BufferedReader(new java.io.FileReader(filePath));
            nrProd = Integer.parseInt(bf.readLine());

            for(int i = 0 ; i < nrProd ; i++){
                String line;
                line = bf.readLine();

                String[] comp = line.split(",");

                products.add(new Product(comp[0] , Double.parseDouble(comp[1])));
            }
            return products;
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
