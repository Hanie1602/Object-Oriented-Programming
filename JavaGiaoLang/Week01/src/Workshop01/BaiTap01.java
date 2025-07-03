
package Workshop01;

public class BaiTap01 {
    //In ra các số nguyên tố từ 1..1000
    public static void printPrimeList() {
        System.out.println("The list of primes form 1..1000");
        for (int i = 0; i < 1000; i++) {
            if(isPrime(i))                  //if (điều gì true thì làm tiếp trong if)
                System.out.print(i + " ");
        }
    }
    
    //Viết hàm kiếm tra 1 số có phải nguyên tố hay ko, số nguyên tố là số chỉ chia hết 1 và chính nó.
    public static boolean isPrime(int n) {
        if(n < 2)
            return false;
        
        //else rồi đấy nếu CPU đến đây, n >= 2
        //Kiểm tra xem trong khoảng từ 2 ... căn (n)
        //lỡ tay chia hết đứa nào ko, có kết luận ngay ko nguyên tố
        if (n == 2)
            return true;
        
        //for 2.. căn n, n ơi, m có chia hết đứa nào từ 2 .. căn?
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if(n % i == 0)
                return false;       //n lỡ tay chia hết trong [2 ... căn]
            
            //hết for rồi mà ko thoát sớm, đích thị ko chia hết đứa nào
            //sure nguyên tố
            return true;
    }
    
    public static void main(String[] args) {
        boolean resul = isPrime(0);
        System.out.println("0: " + resul);
        System.out.println("100: " + isPrime(100));
        System.out.println("101: " + isPrime(101));
        printPrimeList();
    }
}

