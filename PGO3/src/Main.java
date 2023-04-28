import Category.Category;
import Product.Product;
import User.User;
public class Main {
    public static void main(String[] args) {

        User user1= new User("abc123@gmail.com");
        User user2= new User("qwe123@gmail.com");

        User full= new User("Janusz", "Kowalski", "zxc123@gmail.com", "12345678x");

        if (user2.geteMail() != null) {
            user2.setName("John");
            user2.setLastName("Kowalski");
            user2.setPassword("1234567x");
            user2.setGuestAccount(false);
        } else {
            System.out.println("There is no guest account connected to this e-Mail.");
        }

        user1.checkAccount();

        Product product1= new Product("Phone", 999, "12345x");
        Product product2= new Product("Laptop", 2999, "54321x", 9);

        product2.setPrice(2899);
        product1.setQuantity(20);

        System.out.println(product1.getQuantity());
        System.out.println(product2.getPrice());

        Category laptops= new Category("Laptops");
        laptops.addProduct(product2);

        Category phones= new Category("Phones",
                product1);

    }
}
