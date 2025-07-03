package PE2021_SUM03;


public class MyString implements IString{

    //Count and return number of words ending with 'm' or 'n' (not case sensitive).
    //Đếm và trả về số từ kết thúc bằng 'm' hoặc 'n' (không phân biệt chữ hoa chữ thường).
    @Override
    public int f1(String string) {
        int count =0;
        String[] tokens = string.split("[ ]+");
        for (String token : tokens) {
            if((""+token.charAt(token.length()-1)).equalsIgnoreCase("n") || (""+token.charAt(token.length()-1)).equalsIgnoreCase("m"))
                count++;
        }
        return count;
    }

    //Return the strings, which is obtained by reversing the (first) longest word in the string str (word = a string without space(s)).
    //Trả về các chuỗi, có được bằng cách đảo ngược từ dài nhất (đầu tiên) trong chuỗi str (word = một chuỗi không có khoảng trắng).
        //Hàm f2    
        //TH1: thay thế first
        /*for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].length() > maxLong){
                maxLong=tokens[i].length();
                indexMax=i;
            }
        }
        String result = "";
        result += str.replaceFirst(tokens[indexMax], reverseWord(tokens[indexMax]));*/
    @Override
    public String f2(String str) {
        //TH2: thay thế second, nếu chỉ có 1 thì ko thay thế
        String[] tokens = str.split("[ ]+");
        int indexMax1 = 0;
        int indexMax2 = 0;
        int maxLong = 0;
        int count=0;
        for (String token : tokens) {
            if(token.length() > maxLong)
                maxLong = token.length();
        }
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].length() == maxLong){
                count++;
            }
            if(count==1){
                indexMax1=i;
                break;
            }
        }
        for (int i = indexMax1+1; i < tokens.length; i++) {
            if(tokens[i].length() == maxLong){
                count++;
            }
            if(count==2){
                indexMax2=i;
                break;
            }
        }
            //indexMax: vị trí của second longest word trong tokens[]
            //indexMax: vị trí của từ dài thứ hai trong mã thông báo[]
        if (count > 1) {
            if (!(tokens[indexMax1].equals(tokens[indexMax2]))) {           // VD: Str = "ab abcde ah   jklhg vf" => tokens[indexMax].length() = 5
                int indexStr_2nd = str.indexOf(tokens[indexMax2]);          //= 15 Vì trả về index đầu tiên của chuỗi con 
                return str.substring(0, indexStr_2nd) + reverseWord(tokens[indexMax2]) + str.substring(indexStr_2nd + tokens[indexMax2].length());
            } else {                               
                                                                //VD: str = "abcde   jki  abcde  lk abcde  tfr   abcde"
                String strFind = tokens[indexMax1];             // or = tokens[indexMax2] . Vì tokens[indexMax1] = tokens[indexMax2] = "abcde"
                int indexStr_1st = str.indexOf(strFind);        // = 0 Vì trả về index đầu tiên của chuỗi con
                int indexStr_2nd = str.indexOf(strFind, indexStr_1st + strFind.length()); // = 13 vì trả index đầu tiên của chuỗi con sau index đã cho
                return str.substring(0, indexStr_2nd) + reverseWord(tokens[indexMax2]) + str.substring(indexStr_2nd + tokens[indexMax2].length());
            }
        }
        return str;
    }
    public String reverseWord(String word){
        char[] ws = word.toCharArray();
        String result = "";
        for (int i = ws.length-1; i >= 0; i--) {
            result+=ws[i];
        }
        return result;
    }
}


//TEST:
//Enter: 1      am bn cd uvm                Out: 3
//Enter: 2      ab bc abcde uv bcdef xy     Out: ab bc abcde uv fedcb xy
