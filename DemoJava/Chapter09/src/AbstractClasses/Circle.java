
package AbstractClasses;

public class Circle extends Shape {
    double r;
    public Circle (double rr) {
        r = rr;
    }
    public double circumstance() {
        return 2*Math.PI*r*r;
    }
    public double area() {
        return Math.PI*r*r;
    }
}
