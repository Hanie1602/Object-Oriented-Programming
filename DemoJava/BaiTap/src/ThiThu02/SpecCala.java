package ThiThu02;


public class SpecCala extends Cala {
    private int color;

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    //Return the string of format: owener, price, color
    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }
    
    //Replace the 3rd character in owner with the string "XX"
  public void setData() {
      if(getOwner().length() >=3) {
          String newOwner = getOwner().substring(0, 2) + "XX" + getOwner().substring(3);
          setOwner(newOwner);
      }
  }
  
  //Check if color is odd number then return price+7, otherwise return price+3.
  public int getValue() {
      if(color %2 == 1) {
          return getPrice() + 7;
      } else return getPrice() + 3;
  }
}