package PE2021_01;


public class Bat {
    private String owner;
    private int price;

    public Bat(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }
    
    public Bat() {
        
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return owner + " " + price;
    }
    
}
