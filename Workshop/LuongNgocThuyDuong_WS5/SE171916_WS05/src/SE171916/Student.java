
package SE171916;

public class Student {
    String code;
    String name;
    float mark;

    public Student(String code, String name, float mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
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

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    public void printinfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
    }
}
