
package Session04;

public class Cylinder extends Circle {
    int height;

    public Cylinder(int height, int radius) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    //Ghi đè phương thức Area của lớp Circle
    @Override
    public double Area(){
        return 2*Math.PI*radius*height;
    }
    
    //Ghi đè phương thức printArea của lớp Circle
    @Override
    public void printArea() {
        System.out.println("Area Cylinder: " + Area());
    }
}
