
package UsingTryCatch;

public class Demo01 {
    public static void main(String[] args) {
        int x=20;
        int y = 0;
        
        try {
            System.out.println("Result: " + (x/y));
        }
        catch(Exception e) {            //Không làm gì thì nó sẽ bỏ qua luôn
            if(y==0) {                  
                y=2;
                System.out.println("Result: " + (x/y));
            }
        }
        
        System.out.println("Finish Successfully");
    }
}
