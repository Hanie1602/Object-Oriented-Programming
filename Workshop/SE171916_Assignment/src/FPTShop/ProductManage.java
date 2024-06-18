
package FPTShop;

import entities.Product;
import my_utils.Utils;
import java.util.ArrayList;

public class ProductManage {
    String productCode, productName, manufacturingDate, expirationDate;
    int quantity;
    float price;
    
    ArrayList<Product> products = new ArrayList<>();
    
    //1. Add a product 
    public void addProductDailyuse() {
        System.out.println("\n=====ADDING A PRODUCT=====");
        
        do {
            productCode = Utils.getStringreg("Enter product code (must be in format D000000): ", "D\\d{6}", 
                    "Product code cannot be empty", "Invalid product code format. Please use format D000000");
            if (!Utils.isCodeUnique(productCode, products)) {
                System.out.println("Product with the same code already exist. Please enter a unique code");
            }
        } while (!Utils.isCodeUnique(productCode, products));
        
        productName = Utils.getString("Enter product name: ", "Name cannot be empty");
        price = Utils.getFloat("Enter product price: ", 0);
        quantity = Utils.getIntAgain("Enter product quantity:", 0);
        manufacturingDate = Utils.getStringreg("Enter manufacturing date (yyyy-mm-dd): ", "\\d{4}-\\d{2}-\\d{2}", "Invalid date format", "Date format must be yyyy-mm-dd");
        expirationDate = Utils.getStringreg("Enter expiration date (yyyy-mm-dd): ", "\\d{4}-\\d{2}-\\d{2}", "Invalid date format", "Date format must be yyyy-mm-dd");
        
        Product newProductDailyUse = new Product(productCode, productName, price, quantity, manufacturingDate, expirationDate);
        products.add(newProductDailyUse);
        
        System.out.println("Product added successfully with code: " + productCode);
    }
    
    public void addProductLongShelfLife() {
        System.out.println("\n========ADDING A PRODUCT========");
        
        do{
            productCode = Utils.getStringreg("Enter product code (must be in format L000000): ", "L\\d{6}", 
                    "Product code cannot be empty", "Invalid product code format. Please use format L000000");
            if(!Utils.isCodeUnique(productCode, products)) {
                System.out.println("Product with the same code already exist. Please enter a unique code.");
            }
        } while (!Utils.isCodeUnique(productCode, products));
        
        productName = Utils.getString("Enter product name: ", "Product cannot be empty");
        price = Utils.getFloat("Enter product price: ", 0);
        quantity = Utils.getIntAgain("Enter product quantity: ", 0);
        manufacturingDate = Utils.getStringreg("Enter manufacturing date (yyyy-mm-dd): ", "\\d{4}-\\d{2}-\\d{2}", "Invalid date format", "Date format must be yyyy-mm-dd");
        expirationDate = Utils.getStringreg("Enter expiration date (yyyy-mm-dd): ", "\\d{4}-\\d{2}-\\d{2}", "Invalid date format", "Date format must be yyyy-mm-dd");
        
        Product newProductLongShelfLife = new Product(productCode, productName, price, quantity, manufacturingDate, expirationDate);
        products.add(newProductLongShelfLife);
        
        System.out.println("Product added successfully with code: " + productCode);
    }
    
    //2. Update product information
    public void updateProductInformation() {
        productCode = Utils.getStringreg("Enter product code (must be in format D or L with 6 digits: ", "L\\d{6}|D\\d{6}", "Product code cannot be empty", "Invalid product code format");
        
        Product productToUpdate  = null;
        for (Product product : products) {
            if(product.getProductCode().equals(productCode)) {
                productToUpdate = product;
                break;
            }
        }
        
        if( (productToUpdate == null)) {
            System.out.println("Product does not exist");
        } else {
            System.out.println("\n====== Updating Product Information: ======");
            
        }
        
        productName = Utils.getString("Enter product name (leave empty to keep current): ", " ");
        price = Utils.getFloat("Enter product price (leave empty to keep current): ", 0);
        quantity = Utils.getIntAgain("Enter product quantity (leave empty to keep current): ", 0);
        manufacturingDate = Utils.getStringreg("Enter manufacturing date (yyyy-mm-dd) (leave empty to keep current): ", "\\d{4}-\\d{2}-\\d{2}", "Invalid date format", "Date format must be yyyy-mm-dd");
        expirationDate = Utils.getStringreg("Enter expiration date (yyyy-mm-dd) (leave empty to keep current): ", "\\d{4}-\\d{2}-\\d{2}", "Invalid date format", "Date format must be yyyy-mm-dd");
        
        if(!productName.isEmpty()) {
            productToUpdate.setProductName(productName);
        }
        if (price > 0){
            productToUpdate.setPrice(price);
        }
        if (quantity > 0) {
            productToUpdate.setQuantity(quantity);
        }
        if (!manufacturingDate.isEmpty()) {
            productToUpdate.setManufacturingDate(manufacturingDate);
        }
        if (!expirationDate.isEmpty()) {
            productToUpdate.setExpirationDate(expirationDate);
        }
        
        System.out.println("Product information updated successfully.");
    }
    
    //3. Delete product. 
    public void deleteProduct() {
        productCode = Utils.getStringreg("Enter the product code to delete:", "L\\d{6}|D\\d{6}", "Product code cannot be empty", "Invalid product code format");
        
        Product productToDelete =  null;
        for (Product product : products) {
            if(product.getProductCode().equals(productCode)) {
                productToDelete = product;
                break;
            }
        }
        
        if (productToDelete == null) {
            System.err.println("Product does not exist");
        } else {
            // Check for import/export receiptss
            // If no receipts exist, delete the product
            products.remove(productToDelete);
            
            System.out.println("Product deleted successfully.");
        }
    }
    
    //4. Show all product
    public void showAllProducts() {
        System.out.println("\n====== All Products ======");
        
        for (Product showProduct : products) {
            System.out.println(showProduct);
        }
    }
}
