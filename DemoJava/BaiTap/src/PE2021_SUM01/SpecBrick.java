package PE2021_SUM01;


public class SpecBrick extends Brick {
    private int color;

    public SpecBrick() {
    }

    public SpecBrick(String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+", "+color;
    }
    
    //Insert the string "BCA" into place at position 2 (the first position is 0)
    //Chèn chuỗi "BCA" vào vị trí số 2 (vị trí đầu tiên là số 0)
    public void setData(){
        String result = "";
        result += this.getPlace().substring(0, 2)+ "BCA" + this.getPlace().substring(2);
        super.setPlace(result);
    }
    
    //Check if color > 7 then return price + 9, otherwise return price + 6.
    public int getValue(){
        if(color > 7) return this.getPrice()+9;
        else
        return this.getPrice()+6;
    }
}

//TEST:     Enter place         Enter price          Enter color  
//balaba        15          8           Enter: 1        Out: balaba, 15     || balaba, 15, 8
//01234         15          8           Enter: 2        Out: 01BCA234, 15
//alaba         15          8           Enter: 3        Out: 24
//alaba         15          7           Enter: 3        Out: 21
