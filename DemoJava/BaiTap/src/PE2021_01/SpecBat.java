package PE2021_01;


public class SpecBat extends Bat{
    private int color;
    
    public SpecBat() {
        
    }

    public SpecBat(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "," +color;       //return get.Owner() + ", " + get.Price() + "," + color;
    }

    public void setData() {
        super.setPrice(super.getPrice() + 5);       //Increase price by 5
    }

    public int getValue() {
        if(("" + super.getOwner().charAt(0)).equals("K")) {
            return super.getPrice() + 3;
        }
        return super.getPrice() + 6;
    }
        
}

//TEST: Enter place     Enter depth
//han       5       7       Enter:1     Out: han,5  han,5,7
//han       5       7       Enter:2     Out: han,10
//Kan       5       7       Enter:3     Out: 8