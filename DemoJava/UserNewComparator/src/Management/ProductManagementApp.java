
package Management;

import FPTShop.*;
import MyUtils.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManagementApp {
    String code, name, brand, cpu, size;
    float price;
    int quantity, ram, power
            ;
    List <Product> pList = new ArrayList<> ();
    
    //1.Add a new product
    public void addNewProduct () {
                
        int productType = Utils.getInt("\n1. Smartphone \n2. TV \n3. Air-conditioner \nSelect a product type to add: ", 1, 3);
        
        do {
            code = Utils.getStringreg("Enter product code (must be in format P000000): ", 
                "P\\d{6}", "Product code cannot be empty", "Invalid product code format. Please use format P000000");
            if (!Utils.isCodeUnique(code, pList)) {
                System.out.println("Product with the same code already exist. Please enter a unique code");
            }
        } while (!Utils.isCodeUnique(code, pList));
        
        name = Utils.getString("Enter product name: ", "Product name cannot be empty");
        brand = Utils.getString("Enter product brand: ", "Product brand cannot be empty");
        price = Utils.getFloat("Enter product price: ", 0);
        quantity = Utils.getIntAgain("Enter product quantity: ", 0);
        
        switch (productType) {
            case 1:
                ram = Utils.getIntAgain("Enter RAM size (in GB): ", 0);
                cpu = Utils.getString("Etner CPU model: ", "CPU cannot be empty");
                size = Utils.getString("Enter screen size: ", "Size cannot be empty");
                
                Smartphone sp = new Smartphone(code, name, brand, price, quantity, ram, cpu, size);
                pList.add(sp);
                break;
            
            case 2:
                size = Utils.getString("Enter TV size: ", "TV size cannot be empty");
                
                TV tv = new TV(code, name, brand, price, quantity, size);
                pList.add(tv);
                break;
                
            case 3:
                power = Utils.getIntAgain("Enter power (in watts): ", 0);
                
                Air_conditioner ac = new Air_conditioner(code, name, brand, price, quantity, power);
                pList.add(ac);
                break;
        }
        System.out.println("Product added successfully with code: " + code);
        
        int choice = Utils.getInt("1. Add a new product \n2. Exit \nEnter your choice (1-2): ", 1, 2);
        if(choice == 2) {
            return;
        } else {
            addNewProduct();
        }
    }
    
    //2.Print out the list of products on the screen
    public void printAllProduct() {
        if (pList.isEmpty()) {
            System.err.println("No products available");
        }
        else {
            System.out.println("--- LIST OF ALL PRODUCT ---");
            for (Product p : pList) {
                System.out.println(p);
            }
        }
    }
    
    //3.Print a list of Smartphones in Descending order of price
    /*
        Collections.sort: sắp xếp 1 danh sách tại chỗ
        Comparator.comparingDouble: phương thức để so sánh 'price' field của 'Product' class
        reversed: được sử dụng để đảo ngược thứ tự sắp xếp, dẫn đến thứ tự giá giảm dần
    */
    public void printSmartphones () {
        List <Smartphone> smartphones = new ArrayList<> ();
        for (Product p : pList) {
            if (p instanceof Smartphone) {
                smartphones.add((Smartphone)p);
            }
        }
        
        if(smartphones.isEmpty()) {
            System.out.println("No smartphones available");
        } else {
            Collections.sort(smartphones, Comparator.comparingDouble(Product::getPrice).reversed());    
            
            System.out.println("--- SMARTPHONE LIST (Descending order of price) ---");
            for (Smartphone sm : smartphones) {
                System.out.println(sm);
            }
        }
    }
    
    
    //4.Print a list of Tivis in Ascending order of price
    public void printTV() {
        List <TV> tv01 = new ArrayList<> ();
        for(Product p : pList) {
            if(p instanceof TV) {
                tv01.add((TV)p);
            }
        }
        
        if(tv01.isEmpty()) {
            System.out.println("No TVx available");
        } else {
            Collections.sort(tv01, Comparator.comparingDouble(Product::getPrice));
            
            System.out.println("--- TV LIST (Ascendingorder of price) ---");
            for(TV t : tv01) {
                System.out.println(t);
            }
        }
    }
    
    
    //5.Print a list of Air-conditioner in descending order of price.
    public void printAir_conditioner () {
        List <Air_conditioner> air= new ArrayList<> ();
        for(Product p : pList) {
            if (p instanceof Air_conditioner) {
                air.add((Air_conditioner)p);
            }
        }
        
        if(air.isEmpty()){
            System.out.println("No Air-conditioner available");
        } else {
            Collections.sort(air, Comparator.comparingDouble(Product::getPrice).reversed());
            
            System.out.println("--- AIR-CONDITIONER LIST (Descending order of price) ---");
            for(Air_conditioner a : air) {
                System.out.println(a);
            }
        }
    }
    
    
    //6.Print information about products with the highest unit price for each product type
    public void printProductHU () {
        List <Smartphone> smartphones = new ArrayList<> ();
        List <TV> tv01 = new ArrayList<> ();
        List <Air_conditioner> air= new ArrayList<> ();
        
        for (Product p : pList) {
            if (p instanceof Smartphone) {
                smartphones.add((Smartphone)p);
            } else if (p instanceof TV) {
                tv01.add((TV)p);
            } else if (p instanceof Air_conditioner) {
                air.add((Air_conditioner)p);
            }
        }
        
        System.out.println("--- PRODUCT WITH HIGHEST UNIT PRICE ---");
        
        if (!smartphones.isEmpty()) {
            float maxSmartphonePrice = Collections.max(smartphones, Comparator.comparingDouble(Product::getPrice)).getPrice();
            for(Smartphone sm : smartphones) {
                if (sm.getPrice() == maxSmartphonePrice) {
                    System.out.println(sm);
                }
            }
        }
        
        if(!tv01.isEmpty()) {
            float maxTVPrice = Collections.max(tv01, Comparator.comparingDouble(Product::getPrice)).getPrice();
            for(TV t : tv01) {
                if(t.getPrice() == maxTVPrice) {
                    System.out.println(t);
                }
            }
        }
        
        if(!air.isEmpty()) {
            float maxAirPrice = Collections.max(air, Comparator.comparingDouble(Product::getPrice)).getPrice();
            for(Air_conditioner a : air) {
                if (a.getPrice() == maxAirPrice) {
                    System.out.println(a);
                }
            }
        }
        
        //7. Update the product  information based on the code the user entered
        
    }
}