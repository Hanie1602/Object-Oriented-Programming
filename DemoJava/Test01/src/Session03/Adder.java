
package Session03;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a+b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Adder call = new Adder();
        int s1=call.add(10, 20);
        System.out.println("Result:" + s1);
        
        Adder cal2=new Adder();
        double s2= cal2.add(10.5, 20.8);
        System.out.println("Result: " + s2);
    }
}
