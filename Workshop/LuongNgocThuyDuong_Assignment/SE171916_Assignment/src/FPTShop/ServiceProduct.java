package FPTShop;

import entities.Product;
import entities.ProductDailyUse;
import entities.ProductLongShelfLife;
import manage.ProductManage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import my_utils.Utils;

public class ServiceProduct implements IService {

    String productCode, productName, type;
    int quantity;
    float price;
    Date manufacturingDate, expirationDate;

    ProductManage productManage = new ProductManage();

    List<Product> pList = productManage.listProducts;

    //1. Add a product 
    @Override
    public void addProductDailyuse() {
        //submenu
        System.out.println("\n=====ADDING A PRODUCT=====");

        do {
            productCode = Utils.getStringreg("Enter product code (must be in format D000000): ", "D\\d{6}",
                    "Product code cannot be empty", "Invalid product code format. Please use format D000000");
            if (!Utils.isCodeUnique(productCode, (ArrayList<Product>) pList)) {
                System.out.println("Product with the same code already exist. Please enter a unique code");
            }
        } while (!Utils.isCodeUnique(productCode, (ArrayList<Product>) pList));

        productName = Utils.getString("Enter product name: ", "Name cannot be empty");
        price = Utils.getFloat("Enter product price: ", 0);
        quantity = Utils.getIntAgain("Enter product quantity:", 0);
        type = "D\\d{6}";

        if (type.equals("D\\d{6}")) {
            manufacturingDate = Utils.setDate("Enter manufacturing date: ", "Invalid date!!", "dd/mm/yyy");
            expirationDate = Utils.setDate("Enter expiration date: ", "Invalid date!!", "dd/mm/yyy");
        }

        Product newProduct = new ProductDailyUse(manufacturingDate, manufacturingDate, productCode, productName, type, quantity, price);
        productManage.addProductDailyuse(newProduct);

        System.out.println("Product added successfully with code: " + productCode);
    }

    @Override
    public void addProductLongShelfLife() {
        System.out.println("\n=====ADDING A PRODUCT=====");

        do {
            productCode = Utils.getStringreg("Enter product code (must be in format L000000: ", "L\\d{6}",
                    "Product code cannot be empty", "Invalid product code format. Please use format L000000");
            if (!Utils.isCodeUnique(productCode, (ArrayList<Product>) pList)) {
                System.out.println("Product with the same code already exist. Please enter a unique code");
            }
        } while (!Utils.isCodeUnique(productCode, (ArrayList<Product>) pList));

        productName = Utils.getString("Enter product name: ", "Name cannot be empty");
        price = Utils.getFloat("Enter product price: ", 0);
        quantity = Utils.getIntAgain("Enter product quantity: ", 0);
        type = "L\\d{6}";

        if (type.equals("L\\d{6}")) {
            manufacturingDate = Utils.setDate("Enter manufacturing date: ", "Invalid date!!", "dd/mm/yyy");
            expirationDate = Utils.setDate("Enter expiration date: ", "Invalid date!!", "dd/mm/yyy");
        }

        Product newProduct = new ProductLongShelfLife(manufacturingDate, expirationDate, productCode, productName, type, quantity, price);

        //Cập nhật sản phẩm trong class ProductManager
        productManage.addProductLongShelfLife(newProduct);

    }

    //2. Update product information
    @Override
    public void updateProductInformation() {
        //submenu
        System.out.println("\n=====UPDATE PRODUCT INFORMATION=====");

        //Yêu cầu người dùng nhập mã sản phẩm để cập nhật
        productCode = Utils.getStringreg("Enter the product code you want to update: ", "L\\d{6}||D\\d{6}",
                "Product code cannot be empty", "Invalid product code format");

        //Tìm sản phẩm có mã đã nhập
        Product productToUpdate = null;
        for (Product product : pList) {
            if (product.getProductCode().equals(productCode)) {
                productToUpdate = product;
                break;
            }
        }

        if (productToUpdate == null) {
            System.out.println("Product does not exist with code: " + productCode);
            return;     //Thoát nếu sản phẩm không tồn tại
        }

        //Hiển thị các tùy chọn cập nhật thông tins
        System.out.println("Select information to update:");
        System.out.println("1. Product Name");
        System.out.println("2. Price");
        System.out.println("3. Quantity");
        System.out.println("4. Manufacturing Date");
        System.out.println("5. Expiration Date");

        int choice = Utils.getInt("Enter your choice (1-5): ", 1, 5);

        switch (choice) {
            case 1:
                String newName = Utils.getString("Enter new product name: ", "Name cannot be empty!");
                productToUpdate.setProductName(newName);
                break;
            case 2:
                float newPrice = Utils.getFloat("Enter the new product price: ", 0);
                productToUpdate.setPrice(newPrice);
                break;
            case 3:
                int newQuantity = Utils.getIntAgain("Enter the new product quantity: ", 0);
                productToUpdate.setQuantity(newQuantity);
                break;
            case 4:
                if (productToUpdate instanceof ProductDailyUse) {
                    Date newManufacturingDate = Utils.setDate("Enter the new manufacturing date: ", "Invalid date format! Use dd/mm/yyyy", "dd/MM/yyyy");
                    ((ProductDailyUse) productToUpdate).setManufacturingDate(newManufacturingDate);
                }
                break;
            case 5:
                if (productToUpdate instanceof ProductDailyUse) {
                    Date newExpirationDate = Utils.setDate("Enter the new expiration date: ", "Invalid date format! Use dd/mm/yyyy", "dd/MM/yyyy");
                    ((ProductDailyUse) productToUpdate).setExpirationDate(newExpirationDate);
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        //Cập nhật sản phẩm trong class ProductManager
        productManage.updateProductInformation(productCode, productToUpdate);

        System.out.println("Product information updated successfully.");
    }

    //3. Delete product. 
    @Override
    public void deleteProduct() {
        // Submenu
        System.out.println("\n=====DELETE PRODUCT=====");

        // Request the product code to delete
        productCode = Utils.getStringreg("Enter the product code you want to delete: ", "L\\d{6}||D\\d{6}",
                "Product code cannot be empty", "Invalid product code format");

        Product productToDelete = null;
        for (Product product : pList) {
            if (product.getProductCode().equals(productCode)) {
                productToDelete = product;
                break;
            }
        }

        if (productToDelete == null) {
            System.err.println("Product does not exist");
        } else {
            //Xóa sản phẩm bằng phương thức deleteProduct của ProductManager
            productManage.deleteProduct(productToDelete);
            System.out.println("Product deleted successfully.");
        }
    }

    // 4. Show all products
    @Override
    public void showAllProducts() {
        // Call the showAllProducts method of the ProductManager instance
        productManage.showAllProducts();
    }
}
