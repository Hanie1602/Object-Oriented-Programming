
package Sum_HCM_033;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    //You need to compare name of 2 students according to alphabert table, if 2 students have the same name, then we sort ascendently by their gpa. 
    //  The function will support for Collections sort function in next class
    //Bạn cần so sánh tên 2 học sinh theo bảng chữ cái, nếu 2 học sinh trùng tên thì ta sắp xếp tăng dần theo điểm trung bình. 
    //  Chức năng sẽ hỗ trợ cho chức năng sắp xếp Bộ sưu tập trong lớp tiếp theo
    @Override
    public int compareTo(Student other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Double.compare(this.gpa, other.gpa);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


}
