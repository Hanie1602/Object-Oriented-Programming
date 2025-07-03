
package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Quản lý danh sách học sinh ---");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Tìm vị trí của học sinh");
            System.out.println("3. Thoát");
            System.out.print("Nhập lựa chọn của bạn (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Nhập tên học sinh: ");
                String name = scanner.nextLine();
                addStudent(name, studentList);
            } else if (choice == 2) {
                System.out.print("Nhập tên học sinh: ");
                String name = scanner.nextLine();
                findPosition(name, studentList);
            } else if (choice == 3) {
                System.out.println("Kết thúc chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static void addStudent(String name, List<String> studentList) {
        studentList.add(name);
        System.out.println("Đã thêm " + name + " vào danh sách học sinh.");
    }

    private static void findPosition(String name, List<String> studentList) {
        int position = studentList.indexOf(name);
        if (position != -1) {
            System.out.println(name + " đang ở vị trí " + (position + 1) + " trong danh sách học sinh.");
        } else {
            System.out.println(name + " không được tìm thấy trong danh sách học sinh.");
        }
    }
}