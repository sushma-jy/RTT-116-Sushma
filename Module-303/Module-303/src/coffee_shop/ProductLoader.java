package coffee_shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductLoader {
    public List<Product> loadProducts() {
        List<Product> result = new ArrayList<>();

        try {
            File file = new File("src/products.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                Product p = new Product();
                p.setName(tokens[0]);
                p.setPrice(Double.parseDouble(tokens[1]));
                result.add(p);

                System.out.println(p);
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args) {
        new ProductLoader().loadProducts();
    }
}