
package Sum_HCM_011;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // return subtotal [subtotal = quantity * price * (100- discount)/100]
    public double subTotal() {
        return quantity * price * (100 - discount) / 100;
    }
}
