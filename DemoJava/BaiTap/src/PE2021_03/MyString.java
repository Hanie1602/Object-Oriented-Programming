package PE2021_03;

/*
    f1: Count and return number of words containing only letters and and having length<4 (word = a string without space(s).
    f2: Return the strings, which is obtained by removing the second word having maximum length in the string str (thus if only one maximum length word then do nothing)
*/
public class MyString implements IString{
     @Override
    public int f1(String str) {
        String[] words = str.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.matches("[a-zA-Z]+") && w.length() < 4) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split(" ");
        int maxWordLength = 0;
        int secondMaxWordLength = 0;
        int maxWordIndex = -1;
        int secondMaxWordIndex = -1;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.matches("[a-zA-Z]+")) {
                int length = word.length();
                if (length > maxWordLength) {
                    secondMaxWordLength = maxWordLength;
                    secondMaxWordIndex = maxWordIndex;
                    maxWordLength = length;
                    maxWordIndex = i;
                } else if (length > secondMaxWordLength) {
                    secondMaxWordLength = length;
                    secondMaxWordIndex = i;
                }
            }
        }

        if (secondMaxWordIndex != -1) {
            StringBuilder resultBuilder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (i != secondMaxWordIndex) {
                    resultBuilder.append(words[i]).append(" ");
                }
            }
            return resultBuilder.toString().trim();
        }

        return str;
    }
}

/*
    f1: Đếm và trả về số từ chỉ chứa các chữ cái và có độ dài < 4 (từ = một chuỗi không có khoảng trắng).
    f2: Trả về các chuỗi, có được bằng cách loại bỏ từ thứ hai có độ dài tối đa trong chuỗi str (do đó, nếu chỉ có một từ có độ dài tối đa thì không làm gì cả)
*/

//TEST:
//1     Enter: ab a$b a1b hola hoa          Out:2
//2     Enter: day la canh cay xanh la      Out: day la canh cay la



/*
    public interface IString {
    public int f1(String str);
    public String f2(String str);
*/