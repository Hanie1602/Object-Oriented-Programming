
package Interfaces;

public interface InterfaceDemo {
    final int MAXN = 100;           //constant
    int n=0;                        //Fields in interface must be initialized
    static public int sqr(int x) {
        return x*x;
    }
    public abstract void m1();      //abstract methods
    abstract public void m2();
    void m3();                      //default methosd
    void m4();
}