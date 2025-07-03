
package demo05;

import java.util.Scanner;

public class Demoergex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String code;
        System.out.print("Enter code student: ");
        code = sc.nextLine();
        
        if(code.matches("^SE\\d{5}$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
