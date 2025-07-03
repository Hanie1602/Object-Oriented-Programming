package Sum_HCM_02;

/* Flower
    unitPrice: final static variable contains price for each Flower.
    +unitPrice:int
    +bloom at(int):int 
    +fade at(int):int 
    +price(int):int
*/

public class Daisy implements Flower{

    //Return bloomHour = currHour + 5. 
    //If bloomHour > 24 bloomHour--24 to ensure valid format of bloom Hour. For example: if we set currHour is 23:00 at night, then it will bloom at 23:00+5-24-4:00 on the next morning day.
    @Override
    public int bloom_at(int currHour) {
        int bloomHour = currHour + 5 ;
        if(bloomHour > 24){
            bloomHour -= 24;
        }
        return bloomHour;
    }

    //Calculate at what hour (from currHour), a flower will be faded (all hours are in 24 hours format). Rerturn fadeHour = currHour + 10. 
    //If fadeHour > 24 → fadeHour--24 to ensure valid hour format of fadeHour. For example: if we set currHour is 23:00 at night, then it will die at 23:00+10 -24= 9:00 on the next morning day.
    @Override
    public int fade_at(int currHour) {
        int fadeHour  = currHour + 10;
        if(fadeHour  > 24){
            fadeHour  -= 24;
        }
        return fadeHour ;
    }

    //Return the price using this formular: price = Flower.unitPrice * numOfFlower
    @Override
    public int price(int numOfFlower) {
        return Flower.unitPrice * numOfFlower;
    }
    
}


//TEST:
//1     Enter: 5        Out: 10
//2     Enter: 23       Out: 9
//3     Enter: 10       Out: 100