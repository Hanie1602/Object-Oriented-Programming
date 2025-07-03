
package Fall2022_HCM_01;

public class Product {
    private int id, quantity, discount;
    private String name;
    private double price;
    
    public Product() {
        
    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.quantity = quantity;
        this.discount = discount;
        this.name = name;
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    public double subTotal() {
        double subtotal = quantity * price * (100 - discount) / 100;
        return subtotal;
    }
}
