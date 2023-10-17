import java.util.Scanner;

    public class InputDisplay {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;
    
            do {
                System.out.println("Press 1 for integer input");
                System.out.println("Press 2 for float input");
                System.out.println("Press 3 to display");
                System.out.println("Press 4 to exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter an integer: ");
                        int intValue = scanner.nextInt();
                        // You can do something with intValue
                        break;
                    case 2:
                        System.out.print("Enter a float: ");
                        float floatValue = scanner.nextFloat();
                        // You can do something with floatValue
                        break;
                    case 3:
                        System.out.println("Display something here");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                        break;
                }
            } while (choice != 4);
    
           scanner.close()
        }
    }
