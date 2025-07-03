
package DemoSort02;

public class Employee {
    String ID;
    String Name;
    int salary;

    public Employee(String ID, String Name, int salary) {
        this.ID = ID;
        this.Name = Name;
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String toString() {
        return ID + " - " + Name + " - " + salary;
    }
}
