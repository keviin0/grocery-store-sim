import java.util.Scanner;
import java.lang.Math; 

class Main {
  public static void main(String[] args) {
    double money = Math.floor((Math.random() * (100 - 20 + 1) - 20)*100) / 100;
    while(true){
      menu(money);
    }
  }

  public static int sanitizeInput(Scanner scan) {
    try {
      int choice = scan.nextInt();
      return choice;
    } catch (Exception e){
      System.out.println("Invalid choice");
      return 0;
    }
  };
  

  public static void menu(double currency) {

    Scanner scan = new Scanner(System.in);

    System.out.println("----------------------------------------------");
    System.out.println("Welcome to the Grocery Store. Select an option.");
    System.out.println("----------------------------------------------");
    System.out.println("You have $" + currency + " in your wallet.");
    System.out.println("1. Browse Categories\n" +
    "2. View Shopping Cart\n" + 
    "3. Confirm Purchase\n" +
    "4. Exit"
    );

    int choice = sanitizeInput(scan);


    switch (choice) {
      case 0:
        break;
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        System.out.println("Have a nice day!");
        System.exit(0);
      case 1337: //hidden input to restock
        Admin.adminConsole();
    }
    
    return;
  }
}