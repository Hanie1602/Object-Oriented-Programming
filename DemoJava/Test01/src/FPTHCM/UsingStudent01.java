package FPTHCM;

public class UsingStudent01 {

    public static void main(String[] args) {
        //tao moi 1 doi tuong sinh vieen tu khuon mau sinh vien
       /* Student sv1 = new Student("");
        sv1.code = "SE17001";
        sv1.fullname = "Le Hoai Bao";
        sv1.major = "se";
        sv1.birthday = "10/05/2000";

        sv1.viewinfo();
        //tao moi 1 doi tuong sinh vieen tu khuon mau sinh vien
        Student sv2 = new Student();
        sv2.code = "SE17003";
        sv2.fullname = "Le Hoai Bao";
        sv2.major = "se";
        sv2.birthday = "10/05/2003";

        sv2.viewinfo();*/
       Student sv1 = new Student("SE172079" , "Luong Ngoc Thuy Duong" , "SE" , "16/02/2003");
       sv1.viewinfo();
       
       Student sv2 = new Student("SE172079" , "Luong Ngoc Thuy Duong");
       sv2.viewinfo();
       
        System.out.println("----------------------------------------");
        //cap nhap thong tin
       
    }

}
