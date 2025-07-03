
package UsingTryCatch;

public class Demo02 {
    public static void main(String[] args) {
        int x=20;
        int y = 5;
        
        try {
            System.out.println("Result: " + (x/y));
        }
        catch(Exception e) {            //Không làm gì thì nó sẽ bỏ qua luôn
            System.out.println("Error y==0!!!");
        } finally {                     //Luôn luôn được thực hiện dù try có lỗi hay không
            y=2;
            System.out.println("Result: " + (x/y));
        }
        
        System.out.println("Finish Successfully");
    }
}
