package Spring2023_HCM_02;

/*
    >> WordData(String, String): init two fields( type and dataSource) by the given parameters, 
        assign "this is a string" to the content field. 
    >> makeConnection(); return true if the dataSource field contains a substring "localhost:8080", otherwise return false
    >> readData(): if the type field contains ".doc at the end of it, then assign "humpty dumpty sat on the wall" to the content field.
    >> writeData(): to capitalize a first letter of each word in the content field and return the result string. 
        For example: assume that the content is "humpty dumpty sat on the wall", this method will return the result "Humpty Dumpty Sat On The
*/
public class WordData extends Factory implements IConnect{
    private String content;

    public WordData(String type, String dataSource) {
        super(type, dataSource);
        this.content = "this is a string";
        makeConnection();
    }
    
    
    @Override
    public void readData() {
        if (type.endsWith(".doc")) {
            content = "humpty dumpty sat on the wall";
        }
    }

    @Override
    public String writeData() {
        String[] words = content.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }

    @Override
    public boolean makeConnection() {
        if (this.getDataSource().contains("localhost:8080")) {
            return true;
        } else {
            return false;
        }
    }
}
//>> writeData(): để viết hoa chữ cái đầu tiên của mỗi từ trong trường nội dung và trả về chuỗi kết quả. 
//          Ví dụ: giả sử nội dung là "humpty dumpty sat on the wall" thì phương thức này sẽ trả về kết quả "Humpty Dumpty Sat On The Wall"

//TEST:     Enter a type        Enter a data
// data.doc     source:source:http://localhost:8080/exam        Out: Humpty Dumpty Sat On The Wall
//data.doc      testing8080                                     Out: not connect
//testing       localhost:8080                                  Out: This Is A String