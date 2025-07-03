
package demo05;

import java.util.Scanner;

public class DemoRegex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        System.out.print("Enter User Name: ");
        username=sc.nextLine();
        
        if(username.matches("[a-z0-9_-] {6,12}$")) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
