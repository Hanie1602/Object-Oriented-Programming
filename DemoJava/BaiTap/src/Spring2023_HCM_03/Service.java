package Spring2023_HCM_03;


public class Service {
    private String name;
    private int price;

    public Service(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price > 0) {
        this.price = price; 
        }
    }
}

/*
    ITax
    public interface ITax{
    public final double VAT=0.1;
    public double getTax();
    public double getTotalMoney(); }
*/