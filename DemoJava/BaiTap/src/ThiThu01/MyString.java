/*
    Write a class named MyString, which implements the interface IString. The class MyString implements methods f1 and f2 in IString as below:
    f1: Count and return number of words containing at least 1 even digit
    f2: Return the string s, which is obtained by replacing the (first) palindrow word in str with the string "YY"
    (word = a string without space(s), a word is called palindrom if it and its reverse are the same)
*/
package ThiThu01;

public class MyString implements IString {
    @Override
    public int f1 (String str) {
        String[] words = str.split(" ");            //tách chuỗi dựa trên khoảng trắng
        int count = 0;
        
        for (String w : words) {
            if (hasEvenDigit(w)){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String [] words = str.split(" ");           //tách chuỗi dựa trên khoảng trắng
        
        for(int i=0; i<words.length; i++ ){
            if (isPalindrome(words[i])) {
                words[i] = "YY";
                break;
            }
        }
        return String.join(" ", words);             //join (): trả về 1 chuỗi được nối với nhau bởi dấu phân cách
    }

    private boolean hasEvenDigit(String w) {
        for (char c : w.toCharArray()) {            //toCharArray(): được sử dụng để chuyển đổi chuỗi thành các mảng ký tự. Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi.
            if (Character.isDigit(c) && (c - '0') % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isPalindrome(String w) {
        String reversed = new StringBuilder(w).reverse().toString();        //Phương thức reverse() của StringBuilder được sử dụng để đảo ngược các ký tự trong StringBuilder
                                                                            // Phương thức giúp dãy ký tự này được thay thế bằng dãy ký tự ngược lại
        return w.equals(reversed);
    }
}
