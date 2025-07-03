
package Session04;

public class DemoCylinder {
    public static void main(String[] args) {
        Circle c1=new Circle(10);
        c1.printArea();
        System.out.println("---------------------------");
        Cylinder c2=new Cylinder(10,4);
        c2.printArea();
    }
}
