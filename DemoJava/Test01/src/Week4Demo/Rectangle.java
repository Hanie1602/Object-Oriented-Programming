
package Week4Demo;

public class Rectangle {
    private int length = 0;
    private int width =0;
    
    //Overloading constructors
    public Rectangle() {        //Default constructor
        
    }
    
    public Rectangle(int l, int w) {
        length = l>0? l: 0;     width= w>0? w: 0;
    }
    
    //Overriding the toString methohd of the java.lang.Object class
    public String toString () {
        return "[" + getLength() + "," + getWidth() + "]}";
    }
    
    //Getters, Setters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int area() {
        return length*width;
    }
}
