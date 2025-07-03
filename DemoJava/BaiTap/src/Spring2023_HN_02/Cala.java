package Spring2023_HN_02;


public class Cala {
    private String owner;
    private int price;
    
    public Cala() {
        
    }

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

    public void setPrice(int price) {
        this.price = price;
    }
}

/*
    interface ICala {
    int fl(List<Cala> t);

    void f2(List<Cala> t);

    void f3(List<Cala> t);
}
*/
