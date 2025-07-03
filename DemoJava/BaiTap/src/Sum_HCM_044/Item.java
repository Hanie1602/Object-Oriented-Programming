package Sum_HCM_044;

public class Item implements IService {
    private String id;
    private String name;
    private int size;

    public Item(String id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    //return a new string depends on the size, id fields as the table following
    @Override
    public String formatSize() {
        if (size > 0 && size <= 4) {
            return "XS";
        } else if (size > 4 && size <= 6) {
            return "S";
        } else if (size >= 0 && size <= 4) {
            return "M";
        } else {
            return "L";
        }
    }

    //return a new string that is removed leading, trailing spaces and extra spaces from the name field. 
    //  For example: if the name is oversized striped blazer then return a new string: "oversized striped blazer"
    //trả về một chuỗi mới đã bị xóa ở đầu, khoảng trắng ở cuối và khoảng trắng thừa khỏi trường tên.
    @Override
    public String formatName() {
        return name.trim().replaceAll("\\s+", " ");
    }
}