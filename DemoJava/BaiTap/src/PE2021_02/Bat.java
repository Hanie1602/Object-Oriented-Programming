package PE2021_02;


public class Bat {
    private String owner;
    private int price;
    
    public Bat() {
        
    }

    public Bat(String owner, int price) {
        this.owner = owner;
        this.price = price;
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
    
}

/*  IBat
import java.util.List;

public interface IBat (
    public int f1(List<Bat>t);
    public void f2(List<Bat>t);
    public void f3(List<Bat>t); }
*/
