
package FPTShop;

public class TV extends Product {
    private String size;

    public TV(String code, String name, String brand, float price, int quantity, String size) {
        super(code, name, brand, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV - " + super.toString() +
               ", Size " +size;
    }
}