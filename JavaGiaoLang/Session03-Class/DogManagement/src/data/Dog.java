package data;

//Khuôn dùng để đúc ra các object, đối tượng cần  lưu trữ info, thứ
//làm ra để bán
//Khuôn phải kín, có phễu để chế/rót/hứng/đổ vào cái data, nguyên liệu
public class Dog {
    //Chứa đặc điểm, chi tiết mà cái khuôn, object tương lai sẽ có
    //Khuôn design ra sao, mai mốt object có thể
    private String name;        //______________
    private int yob;            //______________
    private double weigh;       //______________
    
    //Có khuôn, thì phải có phễu/miệng loe để hứng vật liệu đi vào
    //Phễu dùng để nhận vật liệu để đúc ra, tạo ra, construct cái object
    public Dog(String iName, int iYob, double iWeigh) {
        name = iName;
        yob = iYob;
        weigh = iWeigh;
    }
    //phễu còn gọi là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng
    //ra object vì thông qua nó như cái phễu vật liệu chảy vào trong khuôn
    //vật liệu khô ra object/bức tượng, cmnd của ai, hồ sơ được tạo ra
    //CONTRUCTOR là hàm cực kì đặc biệt, vì nó dùng để tạo ra obj
    //cứ mỗi lần xài nó, tức là phải đưa vật liệu vào, tức là có 1 obj mới
    //Phễu là hàm đặc biệt, ko giá trị trả về, ko void luôn, t ói về nguyên
    //bức tượng đang đúc
    //tên 100% giống tên class
    
    //Viết các hàm xử lý data, ví dụ như giao tiếp nhau để hỏi năm sinh
    //m hỏi t sẽ trả lời, vì ba má đã fill yob = 2001
    //object thì gọi là hành động, behaviour, xử lý, tính toán trên các
    //biến đc đổ value từ lúc đúc ra
    
    //Hàm gọi n lần tương đượng các hành động mà obj nào đó lặp đi lặp lại 1 lần
    //Hành động của pbj gọi n lần trên obj đó
    public void bark() {
        //System.out.println("Gogogogogogo.....my nam is " + name);
        //System.out.println("Gogogoogogo....my yob is " + yob);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                    name, yob, weigh);
    }
    
    //Mình đi xăm mình, nhuộm tóc
    //Thay đổi info ba má đã từng cho lúc ba má new/đúc ra mình
    public void setNewWitght(double newWeight) {
        weigh = newWeight;
    }
}

//Code bên ngoài giống khuôn bị lủng
//Ngoài đời: bạn (yob: 2001), tui (yob:2001)