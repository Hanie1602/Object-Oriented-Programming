
import java.util.Scanner;
public class Part03 {
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the list of names: ");
        n = sc.nextInt();
        System.out.println("\n");
        
        sc=new Scanner(System.in);
        String[] list = new String [n];
        for(int i=0;i<n;i++) {
            System.out.print((i+1) + " - ");
            list[i]=sc.nextLine();
        }
        System.out.println("\n");
        
        System.out.println("List of new names: ");
        for(int i=0;i<n;i++) {
            list[i]=list[i].toUpperCase();
            System.out.println((i+1) + " - " + list[i]);
        }
    }
}