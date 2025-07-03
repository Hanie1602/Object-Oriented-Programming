
package Operators;


public class Using_Operators {
    public static void main(String[] args) {
        int x= -1;
        System.out.println("-1<<1: " + (x<<1));
        System.out.println("-1>>1: " + (x>>1));
        System.out.println("-1>>>1: " + (x>>>1));
        System.out.println("3|4: " + (3|4));
        System.out.println("3&4: " + (3&4));
        System.out.println("3^4: " + (3^4));
        String S="Hello";
        boolean result = S instanceof String;
        System.out.println("Hello is an instance of String: " + result);
    }
}


/*
    1:      0000 0000 0000 0001
            1111 1111 1111 1110 (1-complement)
    -1:     1111 1111 1111 1110 (2-complement)
    -1<<1:  1111 1111 1111 1111 (-2)
*/