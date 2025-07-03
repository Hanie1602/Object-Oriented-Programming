
package Democlass;
/* trong 1 lap can co cac thuoc tinh:
+ Thuộc tính
+ Các hàm tạo
+ Phuong pháp set/get
+ Các phương thức đáp ứng người dùng

*/
public class Student {
   private String code;
   private String fullname;
   private String major;
   private String birthday;
   private String gpa;

    public Student(String code, String fullname) {
        this.code = code;
        this.fullname = fullname;
    }
    public Student(String code, String fullname, String major, String birthday, String gpa) {
        this.code = code;
        this.fullname = fullname;
        this.major = major;
        this.birthday = birthday;
        this.gpa = gpa;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

   
 
   public void setCode(String code){
       this.code = code;
   }
   
    public void setFullname(String fullname){
       this.fullname = fullname;
   }
    
     public void setMajor(String major){
       this.major = major;
   }
     
      public void setBirthday(String birthday){
       this.birthday = birthday;
   }
    
    public void viewinfo() {
        System.out.println(code+"-"+fullname+"-"+major+"-"+birthday+"-"+gpa);
        
    }
}
