package Variable01;

import java.util.Scanner;           //~ #include <stdio.h>

public class AllVariable {
    
    public static void main(String[] args) {
        int n = getAPositiveInteger();
        System.out.println("Your number: " + n);
        
         printIntegerList(n);       //Truyền tham trị, pass by value
                                    //Value từ n của hàm main() sẽ được đưa qua ngõ/ngả phễu máy xay, n main() đập sang n của hàm
                                    //OOP pass by reference - truyền tham chiếu con trò, địa chỉ
                                    
        printIntegerList(300);      //hard-code đầu vào, code cứng/cố định value/listera
                                    //Ko linh hoạt
                                    //Linh hoạt: bạn muốn in đến mấy?? Hỏi và nhập
        printIntegerList();
        playWithBooleans();
        playWithCharacters();
        playWithDoubles();
        playWithIntegers();
        playWithVariable();
    }
    
    public static int getAPositiveInteger() {
        int n;
        //Nhập từ bán phìm, xài kỹ thuật OOP, chấm và bung lụa, name.charAt()
        Scanner banPhimCuaToi = new Scanner(System.in);
        
        System.out.print("Input a positive integer: ");
        n = banPhimCuaToi.nextInt();
        
        return n;   //getAPositiveInteger() = n
    }
    
    public static void printIntegerList(int n) {
        /*  Muốn in n số tự nhiên tính từ 1
        Hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số
        đầu vào, mà phải khác trên data type chứ ko phải khác trên tên biến.
        --> Được gọi là Overload/Overloading - quá tải hàm
        >> Giống như: 5 ae trên 1 chiếc xe Wave.
        */
        
        //Ko scanf(n)!!! Vì n đã có value khi xài
        //body of function: nghiền, trộn, xử lý với đầu vào giả định sẽ đưa qua tên gọi
        //Giải quyết trên công thức
        
        System.out.println("The list of " + n + " first integers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    //In ra các số tự nhiên từ 1 đến 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers: ");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    public static void playWithBooleans () {
        //C: đúng 1, >0         Sai: 0, int
        //Java: Đúng: true      Sai: false -> Boolean
        boolean marriedStatus = false;
        if (marriedStatus == true) {
            System.out.println("Đánh đồn có địch mới vui");
        } else System.out.println("Vườn hồng có lối nhưng chưa ai vào");
        System.out.println("\n");
    }
    
    public static void playWithCharacters() {
        //2 byte cho kiểu char, lưu bảng mã Unicaode.
        char m = '$';
        System.out.println("Unit: " + m);
        
        /*
            Tên bản thân thì sao??? C: mảng các kí tự, ko primitive, phức tạp hơn
                                       char name [] = "Ahihi";
        */
        String name = "Lương Ngọc Thùy Dương";
        System.out.println("My name is: " + name);     //Loại data type mới hoàn toàn, phức tạp và do gom n thứ khác
                                                        //Object data type
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
        System.out.println("\n");
    }
    
    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("PI: " + pi);
        System.out.printf("PI in C: %.2f\n", pi);    //Cấm tuyệt đối ko dùng %lf
        
        float vat = 0.1F;
        System.out.println("VAT: " + vat);
        System.out.println("\n");
    }
    
    public static void playWithIntegers() {
        int n = 39;                 //Literal value: mọi con số, ký tự xuất hiện trong code.
                                    //Số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);
        
        long m = 3_000_000_000L;    //_ phân cách literal trong code cho dễ đọc.
        System.out.println("m: " + m);
        
        int status = 0xFA;          //hệ 16
        System.out.println("Status: " + status);
        
        int phone = 010;           //0 hệ 8 octal
        System.out.println("Phone: " + phone);
        System.out.println("\n");
    }
    
    //static thì chỉ chơi với static - OOP
    public static void playWithVariable () {
        /* 
            Biến là 1 vùng RAM được đặt tên, chiếm 1 số byte nhất định tùy loại dữ liệu
            hoặc thông tin mà nó sẽ chứa bên trong - data type: hình thức data (có thể là số, chữ, ảnh, ....)
            biến là cách đặt tên cho 1 đại lượng, 1 giá trị - đơn, phức.
        */
        
        int age = 20;
        int a = 10, b;
        b = 100;
        //Tốn 12 byte trong RAM
        System.out.println("Age: " + age);         
        
        int yob = 2001;      //year of birth
        age = 2021 - yob;
        System.out.println("Age again: " + age);
        
        System.out.println("Age by using transitive tech: " + (2021 - yob));
        
        System.out.printf("Age printed by using %% as in C: %d\n", (2021 - yob));
    }
}
