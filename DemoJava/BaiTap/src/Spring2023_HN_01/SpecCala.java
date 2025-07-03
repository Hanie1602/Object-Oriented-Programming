package Spring2023_HN_01;

/*
    >> setData():void Formats the owner with the following rules:
    The first letter of all words is converted to uppercase.
    All other letters are converted to lowercase.
*/
public class SpecCala extends Cala{
    private int color;
    
    public SpecCala() {
        
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return getOwner() + "@" + getPrice() + "#" + color;
    }
    
    public void setData() {
        setOwner(formatOwner(getOwner()));
    }
    
    private String formatOwner(String owner) {
        String[] words = owner.toLowerCase().split("\\s+");
        StringBuilder formattedOwner = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1);
                formattedOwner.append(firstLetter).append(restOfWord).append(" ");
            }
        }
        return formattedOwner.toString().trim();
    }
    
    //Check if color is even number then return price+1, otherwise return price*2.
    public int getValue() {
        if (color % 2 == 0) {
            return getPrice() + 1;
        } else {
            return getPrice() * 2;
        }
    }
}

/*
    Chữ cái đầu tiên của tất cả các từ được chuyển thành chữ hoa.
    Tất cả các chữ cái khác được chuyển thành chữ thường.
*/

//TEST:
//john  10  7   Enter: 1        Out: john @ 10      john@10#7
