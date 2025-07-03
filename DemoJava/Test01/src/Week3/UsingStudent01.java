package Week3;

import java.util.Scanner;

public class UsingStudent01 {

    public static void main(String[] args) {
      /* student sv1 = new student("SE172079" , "Nguyen Tuan Kiet" , "SE" , "08/02/2003","7.5f");      
       student sv2 = new student("SE172079" , "Nguyen Tuan Khoi" , "SE" , "03/02/2003","6.5f");          
       student sv3 = new student("SE172079" , "Nguyen Tuan Kien" , "SE" , "17/02/2003","9.5f");      
       student sv4 = new student("SE172079" , "Nguyen Tuan Khang" , "SE" , "14/02/2003","5.5f");
      */
      
      Scanner sc=new Scanner(System.in);
      String code,fullname,major,birthday;
      float gpa;
      int n;
      
        System.out.println("Enter n: ");
        n=Integer.parseInt(sc.nextLine());
        
        //Tạo danh sách n sinh viên
        Student[] listst=new Student[4];
        
        for (int i=0;i<n;i++) {
            System.out.print("Enter code:");
            code=sc.nextLine();
            System.out.print("Enter fullname:");
            fullname=sc.nextLine();
            System.out.print("Enter major:");
            major=sc.nextLine();
            System.out.print("Enter birthday:");
            birthday=sc.nextLine();
            System.out.print("Enter gpa:");
            gpa = Float.parseFloat(sc.nextLine());
            
            listst[i]=new Student(code, fullname, major, birthday, gpa);
            System.out.println("Addded successfully");
        }
      
       //in danh sách sinh viên có gpa >=7
        for(int i=0;i<n;i++){
            if (listst[i].getGpa() >= 7) {
                listst[i].viewinfo();
            }            
        }
    }

}
