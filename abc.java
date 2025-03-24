import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Customer details and units consumed
        System.out.println("Welcome to the Electrical Billing System!");
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Calculate the bill
        double billAmount = calculateBill(unitsConsumed);

        // Output: Display the bill
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.printf("Total Bill Amount: $%.2f%n", billAmount);

        scanner.close();
    }

    // Method to calculate the bill based on units consumed
    public static double calculateBill(int units) {
        double totalBill = 0;

        // Slab rates
        if (units <= 100) {
            totalBill = units * 6; // $1.20 per unit for the first 100 units
        } else if (units <= 300) {
            totalBill = 100 * 1.20 + (units - 100) * 7.00; // $2.00 per unit for 101-300 units
        } else if (units <= 500) {
            totalBill = 100 * 1.20 + 200 * 7.00 + (units - 300) * 8.00; // $3.00 per unit for 301-500 units
        } else {
            totalBill = 100 * 1.20 + 200 * 7.00 + 200 * 8.00 + (units - 500) * 9.00; // $4.00 per unit for above 500 units
        }

        return totalBill;
    }
}