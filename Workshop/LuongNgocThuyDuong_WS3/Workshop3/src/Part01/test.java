
package Part01;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        boolean cont = false;
        do {
            try {
                String s = " ";
                String pattern = "^SE\\d{3}$";
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Enter the string: ");
                        s = sc.nextLine();
                                if (! s.matches(pattern))
                                    throw new Exception();
                                System.out.println("The string is " + s);
                                cont = false;
            } catch (Exception e){
                System.out.println("The string is invalid");
                cont = true;
            }
        } while(cont);
    }
}