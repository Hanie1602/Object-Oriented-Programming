package Spring2019_01;


public class Employee {
    private String name;
    private double salary;
     
    public Employee() {
        
    }
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    } 
    
    
   //add and complete your other methods here (if needed)
    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "\t" + salary;
    }
    
    
}
