/*
    Write a program that whill accept an array of intergers then print out entered value and the sum of values
*/
package InputOutput;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        int a[];        //array of integers
        int n;          //number of elements of the array
        int i;          //variable for traversing the array
        
        Scanner sc = new Scanner(System.in);        //object for the keyboard
        System.out.print("Enter number of elements: ");
        
        n = Integer.parseInt(sc.nextLine());
        a = new int[n];         //mem. allocating for elements of te array
        for(i=0; i<n; i++) {
            System.out.print("Enter the " + (i+1) + "/" + n + " element: ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        
        System.out.print("Enter values: ");
        for (i=0; i<n; i++)
            System.out.format("%2d", a[i]);
        
        int S = 0;
        for(int x:a)
            S += x;
        System.out.println("\nSum of values: " + S);
    }
}

