/*
    > public dấu +
    > private dấu -
    > protected dấu #
    > dafault dấu ~
*/
package dogmanagement;

import data.Dog;


public class DogManagement {

    public static void main(String[] args) {
        //Lấy khuôn Dog ra để bắt đầu đổ info
        //y chang làm thẻ căn cước: lấy thông tin, in lên thẻ, đổ mực
        //sau khi chờ khô, ta có được object thuộc nhóm vừa đức
        //đặt tên gọi tắt cho obj để dễ dàng nói chuyện
        
        Dog chiHu = new Dog("Chi Hu Hu", 2021, 0.5);
  //  biến/tên tắt        object
        //có object thì object sẽ biết làm gì đó, cò hó biết sủa
        chiHu.bark();
        System.out.println("");
        Dog ngaoDa = new Dog("Ngao Ngao", 2020, 50.0);
        ngaoDa.bark();
        
        System.out.println("");
        //chiHu sủa trở lại
        System.out.println("Chi Hu Hu sủa lại lần nữa: ");
        chiHu.bark();
        
        //bark(); ???đứa nào sủa vậy ??? ko biết
        //HÀNH ĐỘNG PHẢI GẮN VỚI OBJECT, THÔNG QUA CHẤM
        
        System.out.println("");
        System.out.println("After overwieight");
        chiHu.setNewWitght(5);
        chiHu.bark();
    }
    
    //new xin vùng RAM mới đủ chứa info của 1 bạn Dog sẽ được đúc, được đổ data
    //Có 2 vùng name dành cho 2 object
    //Ngao Da ko đè name của chi Hu, và tương tự cho phần còn lại
    
    //ENCAPSULATION: tính đóng gói của thông tin và hành động
    //Hàm và biến phải đi kèm với nhau, đại diện mô tả cho 1 object, thực thể (Sống)
    
    //Là 1 khái niệm gói mọi thứ vào trong 1 class, và từ class nhân bản ra object,
    // và object nào hành động cho khuôn khổ cho nhà object đó, đó gọi là ENCAPSULATION
}
