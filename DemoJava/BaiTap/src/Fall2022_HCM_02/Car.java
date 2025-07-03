
package Fall2022_HCM_02;

public class Car {
    private String name;
    private double price;
    
    public Car () {
        
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + "\t" + price;
    }
    
}
