package Spring2023_HCM_03;

import java.util.ArrayList;

public class Pet implements ITax{
    private String name;
    private String birthday;
    private ArrayList<Service> usedServices;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.usedServices = new ArrayList<>();
    }
    
    //1.to create a new service from the given parameters, and add it to the usedServices list.
    public void addService (String nameService, int price) {
        Service service = new Service(nameService, price);
        usedServices.add(service);
    }

    //2.return the String with format: name - total money - tax. For example: dog-100.0-10.0
    @Override
    public String toString() {
        return name + "-" + getTotalMoney() + "-" + getTax();
    }

    //3.to return the paid total money of the usedServices field. If the pet's birthday belongs to the quarter 4 then discount 5% of the total money.
    //để trả về tổng số tiền đã thanh toán của trường usedServices. Nếu ngày sinh của thú cưng thuộc tứ quý thì chiết khấu 5% trên tổng số tiền.
    public double getTotalMoney() {
        double totalMoney = 0.0;
        for (Service service : usedServices) {
            totalMoney += service.getPrice();
        }

        // Discount 5% if birthday belongs to quarter 4             Giảm 5% nếu sinh nhật thuộc quý 4
        if (getQuarter(birthday) == 4) {
            totalMoney -= (totalMoney * 0.05);
        }
        return totalMoney;
    }
    
    private int getQuarter(String date) {
        int month = Integer.parseInt(date.split("/")[1]);
            return (month - 1) / 3 + 1;
    }
    
    //4.return the tax value. Tax value= VAT* paid total money
    public double getTax() {
        return ITax.VAT * getTotalMoney();
    }
}


//TEST:     Enter pet name     Enter birthday        Enter the number of used services      
//dog       10/11/2022      2       spa     50      shower      50      Out: dog-95.0-9.5
//dog       2/23/2022       2       spa     50      shower      50      Out: dog-100.0-10.0
//dog       3/3/2022        0                                           Out: INVALID