package Spring2019_01;

/*
    double getSalary() – use to determine sale price of a seller; salary = basic salary + bonus, where: 
    bonus = 0.0005 percent out of revenue if revenue < 30000.
    otherwise bonus = 0.00001 percent out of revenue. 
 salary shoude be arounded tho the closest double value with tie rounding up if Seller name start with letter “C” or”c”, ortherwisre the salary  shoude be a rounded to the closest double value with ties rounding down
*/
public class Seller extends Employee {  
    private double revenue;
   
    public Seller() {
       
    }

    public Seller(String name, double revenue, double salary) {
        super(name, salary);
        this.revenue = revenue;
    }
    
     /*Complete the below function for second test case*/
    public double getSalary() {
        double basicSalary = super.getSalary();
        double bonus;
        
        if(revenue < 30000) {
            bonus = 0.0005 * revenue;
        } else{
            bonus = 0.00001*revenue;
        }
        
        double salary = basicSalary + bonus;
        if(Character.toLowerCase(super.getName().charAt(0)) == 'c'){
            salary = Math.ceil(salary);                             //Lương phải được làm tròn đến giá trị gấp đôi gần nhất với cách làm tròn lên nếu tên Người bán bắt đầu bằng chữ cái “C” hoặc “c”
        } else {
            salary = Math.floor(salary);                            //Được sử dụng để làm tròn salary giá trị xuống số nguyên gần nhất.
        }
        return salary;
    }  
    
    //add and complete your other methods here (if needed)
    
    @Override
    public String toString() {
        return super.toString() + " " + revenue;
    }
    
}


//TEST:
//Anton     1500        31000       Enter:2     1500.0
//Canton    1500        31000       Enter:2     1501.0