package Sum_HCM_03;


public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    
    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setID(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    //String-return the employee's name
    public String getName(){
        return firstName + " " + lastName;
    }
    
    //return the employee salary * 12.
    public int getAnnualSalary(){
        return salary*12;
    }
    
    //return the employee raise salary percent.
    //trả lại phần trăm tăng lương cho nhân viên.
    public int raiseSalary(int percent){
        int salarynew = salary+(salary*percent)/100;
        setSalary(salarynew);
        return salarynew;
    }

    //overriding the toString method and return a string following format "Employee[id="name="" salary=""1",
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}


//TEST:
//1     1       alan        smith       30              Out: Employee[id=1, name=alan smith, salary=30]
//2     5       alex        fegi        50              Out: id is: 5       ||  firstname is: fegi      ||     lastname is: alex        ||   salary is: 50      ||  name is: fegi alex      || 600
//3     6       oliver      girou       80      10      Out: Employee[id=6, name=girou oliver, salary=88]