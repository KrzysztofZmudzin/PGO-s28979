package Category;

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String name;
    private ArrayList<Product> products= new ArrayList<>();

    public Category(String name) {
        this.name= name;
        this.products= new ArrayList<>();
    }
    public Category(String name, Product product) {
        this.name= name;
        this.products.add(product);
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
