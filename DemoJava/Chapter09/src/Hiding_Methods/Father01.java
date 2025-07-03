
package Hiding_Methods;

public class Father01 {
    public static void m () {
        System.out.println("I am a father");
    }
}

class Son01 extends Father01 {
    public static void m () {
        
    }
}

public class HidingMethodDemo {
    public static void main(String[] args) {
        Father01 obj = new Father01();
        obj.m();
        obj = new Son01();
        obj.m();
        Son01 obj2= new Son01();
        obj2.m();
    }
}