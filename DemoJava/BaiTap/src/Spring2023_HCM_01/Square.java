package Spring2023_HCM_01;

/*  Square: hình vuông
    Square (side): assign the given side to two fields (length, width), assign the default value is 'cm' to the unit field.
    setSquare(side): if the given side is the positive number then assign it to the length, width fields
    getPerimeter(); return the perimeter of the square
    output(): display the content with format:
    the side of the square-length(unit)
    the perimeter of the square=(length+width)*2(unit)
    >> for example:
    the side of the square=5(cm)
    the perimeter of the square-20(cm)
*/
public class Square extends Rectangle {
    private String unit;
    
    //Square (side:int): gán cạnh đã cho cho hai trường (chiều dài, chiều rộng), gán giá trị mặc định là 'cm' cho unit field.
    public Square (int side) {  
    super(side, side);
    unit = "cm";
    }
    
    //setSquare(side): nếu cạnh đã cho là số dương thì gán nó cho các fields chiều dài, chiều rộng
    public void setSquare(int side) {
        if(side > 0) {
            setLength(side);
            setWidth(side);
        }
    }
    
    //getPerimeter(); trả về chu vi của hình vuông
    public int getPerimeter() {
        return 2 * (getLength() + getWidth());
    }
    
    public void output() {
        System.out.println("The side of the square = " + getLength() + "(" + unit + ")");
        System.out.println("The perimeter of the square = " + getPerimeter() + "(" + unit + ")");
    }
}
