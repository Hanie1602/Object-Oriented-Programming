
import java.util.Scanner;
public class Part02 {
    public static void main(String[] args) {
        float num1, num2;
        float result = 0;
        String op;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number 1: ");
        num1=sc.nextFloat();
        
        System.out.println("Imput the number 2: ");
        num2=sc.nextFloat();
        
        System.out.println("Input the operator (+-*/): ");
        sc=new Scanner(System.in);
        op=sc.nextLine();
                
        switch(op){
            case"+":
                result=num1+num2;
                System.out.println("the result of: " + num1 + " " + op + " " + num2 + " = " + result);
                break;
            case"-":
                result=num1-num2;
                System.out.println("the result of: " + num1 + " " + op + " " + num2 + " = " + result);
                break;
            case"*":
                result=num1*num2;
                System.out.println("the result of: " + num1 + " " + op + " " + num2 + " = " + result);
                break;
            case"/":
                if(num2==0) {
                    System.out.println("Number 2 must be different from zero");
                } else {
                result=num1/num2;
                System.out.println("the result of: " + num1 + " " + op + " " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}