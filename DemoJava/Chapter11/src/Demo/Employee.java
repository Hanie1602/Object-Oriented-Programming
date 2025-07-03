
package Demo;

public class Employee implements Comparable {
    private String code;
    private String fullname;
    private int age;

    public Employee(String code, String fullname, int age) {
        this.code = code;
        this.fullname = fullname;
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        return code + " - " + fullname + " - " + age;
    }

    @Override
    //Sắp xếp danh sách tăng dần theo tuổi
    public int compareTo(Object t) {
        Employee temp = (Employee)t;
        /* 
        
        if(this.age>temp.age)
            return 1;
        else if (this.age==temp.age) {
            return 0;
        }
        return -1;  
        
        */
        
        return this.age-temp.age;       //Tăng dần. Nếu muốn  giảm dàn thì nhân với -1
    }
    
    
    /*
    
    //Sắp xếp danh sách tăng dần theo code 
    public int compareTo(Object o) {
        Employee temp = (Employee)o;
        return this.code.compareTo(temp.code);      //String class: S1.compareTo(S2)  =>    0: giống nhau;     1: S1>S2 (tăng dần);    -1: S1<S@ (giảm dần)
    }
    
    */
    
}
