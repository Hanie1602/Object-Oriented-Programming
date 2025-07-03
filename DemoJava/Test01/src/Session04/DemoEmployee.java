
package Session04;

public class DemoEmployee {
    public static double TotalSalary(Employee emp []) {
        double s = 0;
        for (int i=0; i<emp.length;i++) {
                s+=emp[i].salary;
        }
        return s;
    }
    public static void main(String[] args) {
        Employee[] emp=new Employee[3];
        
        emp[0]= new Employee("SE171916", "Luong Ngoc Thuy Duong", 500);
        emp[1]= new Employee("SE173516", "Nguyen Van A", 600);
        emp[2]= new Employee("SE179456", "Le Minh Thanh", 550);
        
        double total = TotalSalary(emp);
        System.out.println("Total Salary: " + total);
        System.out.println("-----------------------");
        
        System.out.println(emp[0]);
        System.out.println(emp[1]);
        System.out.println(emp[2]);
    }
}
//Static không được truy cập vào biến bình thường của biến và lớp
//Chỉ truy cập vào biến static