package Spring2023_HN_03;


public class MyString implements IString{

    //Count and return number of words containing at least 1st even digit.
    //Đếm và trả về số từ chứa ít nhất 1 chữ số chẵn.
    @Override
    public int f1(String str) {
        String[] words = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (containsEvenDigit(word)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean containsEvenDigit(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch) && (ch - '0') % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    //Return the string s, which is obtained by replacing the 1st palindrome word in str with the string "YY" 
    //(word = a string without space(s), a word is called palindrome if it and its reverse are the same)
    //Trả về chuỗi s, có được bằng cách thay thế từ đối xứng đầu tiên trong str bằng chuỗi "YY"
    @Override
    public String f2(String str) {
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                words[i] = "YY";
                break;
            }
        }
        return String.join(" ", words);
    }
    
    private boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


//TEST:
//1         Enter: ab c2 d1 e1 b4 u8         Out: 3
//2         Enter: ab abc abcba 12321 uv     Out: ab abc YY 12321 uv