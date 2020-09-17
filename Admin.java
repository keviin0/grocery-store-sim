import java.util.Scanner;

public class Admin{

  public static void adminConsole() {
    Scanner scan = new Scanner(System.in);
  
    System.out.println("-------------\n" +
    "Admin Console\n" +
    "-------------"
    );
    System.out.println("1. Create Product");
    System.out.println("2. Remove Product");
    System.out.println("3. Create/Remove Category");
    System.out.println("4. Change stock value of product");

  } 

  //Assuming Arraylist[][] inventory is 

  public static void createProduct() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the name of the product:");
    String name = scan.next();
    System.out.println("Enter category of product:");
    int category = scan.nextInt();
    System.out.println("Enter the price of the product:");
    float price = scan.nextFloat();
    System.out.println("Enter the Description of the product:");
    String desc = scan.next();
    Product item = new Product(name, category, price, desc);
    System.out.println(item);
  }

  class Product{
    String prodName;
    int prodCategory;
    float prodPrice;
    String prodDesc;

    public Product(String a, int b, float c, String d){
      prodName = a;
      prodCategory = b;
      prodPrice = c;
      prodDesc = d;
    }
  }
}

