
package AnonymousClass;

//abstract class contains all concrete methods
public abstract class MyAdapter {
    public void M1() {
        System.out.println("M1");
    }
    public void M2() {
        System.out.println("M2");
    }
}
class Program {
    public static void main(String[] args) {
        //Overriding one method
        MyAdapter obj = new MyAdapter () {
            public void M1() {
                System.out.println("M1 overridden");
            }
        };
        obj.M2();
        obj.M1();
    }
}