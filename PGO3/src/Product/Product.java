package Product;

public class Product {
    private String productName;
    private double price;
    private String productCode;
    private int quantity;

    public Product(String productName, double price, String productCode, int quantity) {
        setProductName(productName);
        setPrice(price);
        setProductCode(productCode);
        setQuantity(quantity);
    }
    public Product(String productName, double price, String productCode) {
        setProductName(productName);
        setPrice(price);
        setProductCode(productCode);
        setQuantity(0);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
