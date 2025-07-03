package varnfun;

import java.util.Scanner;
//~ #inlcude <studio.h>

public class VarNFun {

    public static void main(String[] args) {
        playWithVariables();
        playWithIntegers();
        playWithDoubles();
        playWithCharacters();
        playWithBooleans();
        printIntegerList();
        printIntegerList(5);    //hard-code đầu vào, code cứng/ cố định value/literal
                                //không mềm mại, linh hoạt
                                //linh hoạt: bạn muốn in đến mấy??? hỏi và nhập
        int a = getAPositiveInteger();
        System.out.println("Your number: " + a);
        printIntegerList(a);    //truyền thâm trị, pass by value
                                //value từ n của hàm main() sẽ dc đưa qua ngõ/ngả
                                //phễu máy xaxy, n main() đập ngang sang n của hàm
                                
                                //OOP pass by reference - truyển tham chiếu
                                //                        con trỏ, địa chỉ
    }
    
    public static int getAPositiveInteger() {
        int n;
        //Nhập từ bàn phím, xài kĩ thuật OOP, chấm và bung lụa, name.charAt()
        Scanner banPhimCuaToi = new Scanner(System.in);
        
        System.out.print("Input a positive integer: ");
        n = banPhimCuaToi.nextInt();
        
        return n;   //getAPositiveInteger() = n
    }
    
    //Muốn in n số tự nhiên tính từ 1
    //Hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số
    //đầu vào, mà phải khac trên data type chứ ko phải khác trên tên biến
    //Được gọi là overload/overloading - quá tải hàm
    //vs. Override
    //POLYMORPHISM -> Đa hình
    
    //giống như: 5 anh em trên 1 chiếc xe Wave  
    public static void printIntegerList(int n) {
        //chỉ có thằng ngoo mới scanf(n) here!!! n đã có value khi xài
        //body of function: nghiền, trộn, xử lý với đầu vào giả định sẽ đưa qua tên gọi
        //giải quyết trên công thức
        System.out.println("The list of " + n + " first integers");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n");
    }
    
    //In ra các số tự nhiên từ 1 đến 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void playWithBooleans() {
        //C: đúng 1, >0, sai: 0. Int
        //Java: đúng: true, sai: false --> boolean
        boolean marriedStatus = false;
        if (marriedStatus == true) 
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
        
    }
    
    public static void playWithCharacters() {
        //2 byte cho kiểu char, lưu bảng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);
        //tên em thì sao? C: mảng các kí tự, ko primitive nữa rồi, phức tạp rồi
        //                char name[] = "Ahihi";
        
        String name = "Hoàng Ngọc Trinh";   //Loại data type mới hoàn toàn
                                            //phức tạp, do gom n thứ khác
                                            //Objectt data type
        System.out.println("My name is: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
    }
    
    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);    //cấm tuyệt đối ko dùng %lf
        
        float vat = 0.1F;
        System.out.println("Float: " + vat);
        
    }
    
    public static void playWithIntegers() {
        int n = 39; //Mọi con số, kí tự xuất hiện trong code được gọi là
                    //literal value
                    //Số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n);
        
        long  m = 3_000_000_000L;   //_phân cách literal trong code cho dễ đọc
        System.out.println("m: " + m);
        
        int status = 0xFA;  //hệ 16
        System.out.println("status: " + status);
        
        int phone = 010;   //0 hệ 8: Octal
        System.out.println("phone: " + phone);
        
    }
    
    //Static thì chỉ chơi với static - OOP
    public static void playWithVariables() {
        //Biến là 1 vùng RAM được đặt tên, chứa 1 số byte nhất định tùy loại
        //dữ liệu/thông tin mà nó sẽ chứa bên trong - data type - hình thức data
        //có thể là số, chữ, ảnh,....
        //Biến là cách đặt tên cho 1 đại lượng, 1 giá trị - đơn, phức
        int age = 20;
        int a = 10, b;
        b = 100;
        //tốn 12 byte trong RAM
        System.out.println("age: " + age);
        int yob = 2003; //year of birth
        age = 2024 - yob;
        System.out.println("age again: " + age);
        System.out.println("age by using transitive tech: " + (2024 - yob));
        System.out.printf("age printed by using %% as in C: %d\n", age);
    }
}
