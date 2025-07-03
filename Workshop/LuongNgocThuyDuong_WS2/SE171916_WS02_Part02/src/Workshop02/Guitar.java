
package Workshop02;

public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    //to assign all fields by input parameters
    public Guitar() {
        
    }
    
     //return the value of the field serialNumber
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Implement getter/setter of all other fields
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    
    public void createSound() {
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Builder: " + getBuilder());
        System.out.println("Model: " + getModel());
        System.out.println("Back Wood: " + getBackWood());
        System.out.println("Top Wood: " + getTopWood());
    }
    
}
