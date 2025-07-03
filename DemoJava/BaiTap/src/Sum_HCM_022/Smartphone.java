
package Sum_HCM_022;

public class Smartphone extends Product{
    private int price;
    private int internalMemory;
    private float weight;

    public Smartphone(String code, String name, int internalMemory, float weight, int price) {
        super(code, name);
        this.internalMemory = internalMemory;
        this.weight = weight;
        this.price = price;
    }
    
    //Print product information; scode":"+name+" internal memory name.internal_memory "GB"""weight"g""" + price + "5"
    public void showInfo() {
        System.out.println("Product Information:");
        System.out.println("Code: " + this.code);
        System.out.println("Name: " + this.name);
        System.out.println("Internal Memory: " + internalMemory + "GB");
        System.out.println("Weight: " + weight + "g");
        System.out.println("Price: " + price);
    }

    //Returns the total payment according to the following description:
    //  If the product is "IPHONE 14 PROMAX" with quantity>=5, then 20% off total payment, otherwise no discount
    //  Total payment-quantity"price
    public double buyNow(int quantity) {
        double totalPayment = quantity * price;
        if (this.name.equals("IPHONE 14 PROMAX") && quantity >= 5) {
            totalPayment *= 0.8;    // 20% discount
        }
        return totalPayment;
    }
}
