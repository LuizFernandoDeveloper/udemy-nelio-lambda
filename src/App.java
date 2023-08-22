import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import model.Product;
import util.ProductPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Hd Case", 80.90));

        list.removeIf( p -> p.getPrice() >= 100);

        for (Product product : list) {
            System.err.println(product);
        }
    }
}
