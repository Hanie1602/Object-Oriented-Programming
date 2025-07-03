
package Sum_HCM_033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sort student by: first priority is name of students. If 2 students have the same name, we sort by gpa. 
//  Hint: you can use Collections sort() if you have already implemented compareTo method in Student class
//Sắp xếp sinh viên theo: ưu tiên đầu tiên là tên của sinh viên. Nếu 2 sinh viên có cùng tên, chúng tôi sắp xếp theo gpa.
public class ProcessStudent {
    public static void sortStudent(List<Student> students) {
        Collections.sort(students);
    }

    //find_by_partial_name(List<Student> li,String letter):List<Student>
    //Find all students with partial name. For example: If we find student with "N", "Nam". "Nhan" will be matched but not "An".
    //Tìm tất cả các sinh viên với một phần tên. Ví dụ: Nếu tìm sinh viên có chữ "N", "Nam". "Nhân" sẽ được ghép nhưng không phải là "An".
    public List<Student> findByPartialName(List<Student> students, String partialName) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(partialName)) {
                result.add(student);
            }
        }
        return result;
    }

    // find_higher_gpa|List<Student> li,int gpa):List<Student>
    //Find all students whose gpa is higher the given gpa parameter.
    //Tìm tất cả các sinh viên có điểm trung bình cao hơn tham số gpa đã cho.
    public List<Student> findHigherGPA(List<Student> students, int gpa) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGpa() > gpa) {
                result.add(student);
            }
        }
        return result;
    }
}
