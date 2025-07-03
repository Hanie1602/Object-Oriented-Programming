package Spring2019_03;

/*
    String getCode();this function return code of RC as the rule:
    Code of RC = increment all letters (other characters are unchanged) only in the given string of RC by 1:a->b,b->c,c->d,…->z,z->a, this increment is applied same rule for upper characters
    Dịch: chỉ tăng tất cả các chữ cái khác (các ký tự không thay đổi) trong chuỗi RC đã cho thêm 1:a->b,b->c,c->d,…->z,z->a, việc tăng này được áp dụng cùng một quy tắc cho các ký tự trên
*/
public class ReservationCode {
    private String code, customerName;

    public ReservationCode(String code, String customerName) {
        this.code = code;
        this.customerName = customerName;
    }
         
    public String getCode() {
        //a : 1, b : 2
        //(26 + 1) % 26 = 1 -> a
        char[] arr = customerName.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(!Character.isDigit(arr[i])) {
                if(arr[i] == 'z')   arr[i] = 'a';
                else if (arr[i] == 'Z')   arr[i] = 'A';
                else {
                    arr[i] = (char) (arr[i] + 1);
                }
            }
        }
        String rs = "";
        for(int i = 0; i<arr.length;i++){
            rs += arr[i];
        }
        return rs;
    }
    
    /*add and complete your other methods here (if needed)*/

    @Override
    public String toString() {
        return "" + customerName + "\t" + code;
    }
}



// TEST:
// Ab12cDz45    K2M1D9     Enter: 2    Out: Bc12dEa45
// Anton        K2M1D9      Enter: 1    Out: Anton K2M1D9