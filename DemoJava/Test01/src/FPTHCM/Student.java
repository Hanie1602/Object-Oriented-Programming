
package FPTHCM;

public class Student {
   private String code;
   private String fullname;
   private String major;
   private String birthday;

    public Student(String code, String fullname) {
        this.code = code;
        this.fullname = fullname;
    }
   

    public Student(String code, String fullname, String major, String birthday) {
        this.code = code;
        this.fullname = fullname;
        this.major = major;
        this.birthday = birthday;
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
        System.out.println(code+"-"+fullname+"-"+major+"-"+birthday);
        
    }
}
