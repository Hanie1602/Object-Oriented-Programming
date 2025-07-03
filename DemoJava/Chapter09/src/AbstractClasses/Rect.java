
package AbstractClasses;

public class Rect extends Shape {
    double l, w;
    public Rect (double ll, double ww) {
        l = ll; w = ww;
    }
    public double circumstance() {
        return 2*(l+w);
    }
    public double area () {
        return l*w;
    }
}
