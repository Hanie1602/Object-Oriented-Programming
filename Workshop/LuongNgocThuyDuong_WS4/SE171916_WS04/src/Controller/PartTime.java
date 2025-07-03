package Controller;

public class PartTime extends Employee {
    private float dailyWage;
    private int present;

    public PartTime(String code, String fullname, String phone, String address, String department, float dailyWage, int present) {
        super(code, fullname, phone, address, department);
        this.dailyWage = dailyWage;
        this.present = present;
    }

    public float getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(float dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    
    @Override
    public float totalSalary() {
        return dailyWage * present;
    }

    @Override
    public void printinfo() {
        System.out.println(this.getCode() + " - " + fullname + " - " + phone + " - " + totalSalary());
    }
}
