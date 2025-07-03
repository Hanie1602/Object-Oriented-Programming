//Chapter 7 Slide 37
package Student_Software;

public class Student_SE1847 {
    String code;
    String name;
    static String uni = "FPT University";
    
    public Student_SE1847 (String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void output() {
        System.out.println(code + " - " + name + " - " + uni);
    }
    
}
