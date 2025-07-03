
package Session04;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
   public double Area() {
       return Math.PI*radius*radius;
   }
   
   public void printArea(){
       System.out.println("Area Circle: " + Area());
   }
}
