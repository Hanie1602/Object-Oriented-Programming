package Sum_HCM_04;

//which verifies whether a student ID is correct. The student ID must start with se,he, or qe(ignore case) followed by exactly 4 to 6 digits.
//For example: SE1234 is a correct ID but SE1234$ is not. Or hE1111 is a correct ID but hhE1111 is not.
// xác minh xem ID sinh viên có đúng không. ID sinh viên phải bắt đầu bằng se,he hoặc qe(bỏ qua chữ hoa chữ thường) theo sau chính xác từ 4 đến 6 chữ số.
public class StringProcessor {
    public static boolean match_student_id(String id){
        id = id.toUpperCase();
        boolean check = true;
        if(id.length()<6&&id.length()>4){
            if(id.startsWith("SE")||id.startsWith("QE")||id.startsWith("HE")){
                String sub1 = id.substring(3);
                char []c = sub1.toCharArray();
                for(char c1:c){
                    if(!Character.isDigit(c1)){
                        check = false;
                        break;
                    }
                }   
            } else{
                check = false;
            }
        } else{
            check = false;
        }
        return check;
    }
    
    //A static function which converts a string from "underscore" format to "camel" format. For example: format camel will be transformed into formatCamel using this function
    //Một hàm tĩnh chuyển đổi một chuỗi từ định dạng "gạch dưới" sang định dạng "lạc đà". Ví dụ: định dạng lạc đà sẽ được chuyển đổi thành định dạngCamel bằng chức năng này
    public static String format_camel(String str1){
        String finall = "";       
        if(str1.startsWith("_")){
            String []str = str1.substring(1).split("_");
            for(String str2:str){
            str2 = str2.substring(0,1).toUpperCase()+str2.substring(1);
            finall+=str2;
        }
        } else{
            String []str = str1.split("_");
            finall = finall + str[0];
            for(int i = 1;i<str.length;i++){
                str[i] = str[i].substring(0, 1).toUpperCase()+str[i].substring(1);
                finall +=str[i];
            }
        }
        
        return finall;
    }
}


//TEST:
//1     Enter: xse12345     Out: false
//1     Enter: HE111114     Out: false
//1     Enter: QE12345#     Out: false
//2     Enter: 