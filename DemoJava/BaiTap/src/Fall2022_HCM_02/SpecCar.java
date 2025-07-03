
package Fall2022_HCM_02;

public class SpecCar extends Car{
    private int warranty;
    
    public SpecCar() {
        
    }

    public SpecCar(String name, int price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return getName() + " " + getPrice() + " " + warranty;
    }

    //warranty update
    public void setWarranty(int value) {
        warranty = value;
    }
    
    //Check if name is "AUDI" then return warranty + 5, otherwise return warranty + 2.
    public int getWarranty() {
        if (getName().equals("AUDI")) {
            return warranty + 5;
        } else {
            return warranty + 2;
        }
    }
}
