import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
       
        System.out.println("Table for " + number + ":");
        
        for (int i = 1; i <= 20; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        scanner.close();
    }
}
