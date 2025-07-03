//Vòng lặp for nâng cao
package Operators;

public class EnhancedFor {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a [] = {1, 2, 3, 4, 5};
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + ",");
        System.out.println("");
        
        //Cách 2
        for(int x:a)
            System.out.print(x + ",");
        System.out.println("");
        
        //Cách 3
        for(int x:a)
            x += 10;
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + ",");
        System.out.println("");
    }
}
