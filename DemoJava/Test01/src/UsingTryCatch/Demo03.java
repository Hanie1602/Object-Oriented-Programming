
package UsingTryCatch;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        
        try {
            System.out.println("Enter your age: ");
            age=integer.parseInt(sc.nextLine());
            if(age<0) {
                System.out.println("Age must >0!!!!!!");
            }
        }
        catch() {
            
        }
    }
}
