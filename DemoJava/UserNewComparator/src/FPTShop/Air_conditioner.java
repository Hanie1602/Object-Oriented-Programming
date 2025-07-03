
package FPTShop;

public class Air_conditioner extends Product {
    private int power;

    public Air_conditioner(String code, String name, String brand, float price, int quantity, int power) {
        super(code, name, brand, price, quantity);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Air_conditioner - " + super.toString() +
               ", Power " + power;
    }
}
