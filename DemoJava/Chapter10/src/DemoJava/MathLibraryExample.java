
package DemoJava;

public class MathLibraryExample {
    public static void main (String args[]) {
        int i = 7;
        int j = -9;
        double x = 72.3;
        double y = 0.34;
        
        System.out.println(" | " + j + " | is " + Math.abs(j));
        System.out.println(x + " is approximately " + Math.round(x));
        System.out.println(y + " is approximately " + Math.round(y));
        System.out.println("The floor of " + x + " is " + Math.floor(x));
        System.out.println("The floor of " + y + " is " + Math.floor(y));
        System.out.println("min(" + i + "," + j + ") is " + Math.min(i, j));
    }
}
