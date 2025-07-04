package ThiThu02;

// dấu - nghĩa là private

public class Cala {
    private String owner;
    private int price;

    public Cala(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return owner + " - " + price;
    }
    
    
}
