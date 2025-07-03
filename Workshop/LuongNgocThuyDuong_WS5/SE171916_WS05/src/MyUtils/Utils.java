package MyUtils;

import java.util.Scanner;

public class Utils {

    public static String getString(String welcome,String msg) {
        boolean check = true;
        String result = " ";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.err.println(msg);
            } else {
                check = false;
            }
        } while (check);
        return result;
    }
    
    public static String getStringreg(String welcome,String pattern,String msg,String msgreg) {
        boolean check = true;
        String result = " ";
        Scanner sc = new Scanner(System.in);
        do {
            
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.err.println(msg);
            }
            else if(!result.matches(pattern)){
                System.err.println(msgreg);
            }
            else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static int getInt(String welcome, int min) {
        boolean check = true;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
               
                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                if(number< min){
                    System.err.println("Number must be large than " + min);
                }
                else{
                    check = false;
                }
                
            } catch (Exception e) {
                System.err.println("Input number!!!");
            }
        } while (check || number < min);
        return number;
    }
    
     public static float getFloat(String welcome, float min, float max) {
        boolean check = true;
        float number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                
                System.out.print(welcome);
                number = Float.parseFloat(sc.nextLine());
                 if(number< min){
                    System.err.println(" Number must be greater than 0");
                }
                 else if (number > max) {
                     System.err.println("Number must be less than 10");
                 }
                 else{
                      check = false;
                 }
               
            } catch (Exception e) {
                System.err.println("Input number!!!");
            }
        } while (check || number < min || number > max);
        return number;
    }
}