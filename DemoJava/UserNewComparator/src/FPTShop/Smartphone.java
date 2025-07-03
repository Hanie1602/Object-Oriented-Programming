
package FPTShop;

public class Smartphone extends Product {
    private int ram;
    private String cpu;
    private String size;

    public Smartphone(String code, String name, String brand, float price, int quantity, int ram, String cpu, String size) {
        super(code, name, brand, price, quantity);
        this.ram = ram;
        this.cpu = cpu;
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Smartphone - " + super.toString() +
               ", RAM " + ram +
               ", CPU " + cpu +
               ", Size " + size;
    }
}
