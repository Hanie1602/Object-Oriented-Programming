
package Interfaces;

public class UseIt {
    public static void main(String[] args) {
        InterfaceDemo obj = new A();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        int s = InterfaceDemo.sqr(5);
        System.out.println("5x5= " + s);
    }
}
