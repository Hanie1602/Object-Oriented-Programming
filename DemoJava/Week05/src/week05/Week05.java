
package week05;

import java.util.Scanner;

public class Week05 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean cont = true;
        int n = 0;
        do {
            try {
                System.out.print("Enter a whole number: ");
                n = Integer.parseInt(in.nextLine());
                cont = false;
            }
            catch (Exception e) {
                System.out.println("Required integer! ");
            }
        }
        while (cont == true || n < 10 || n>50);
    }
    
}
