//Input currency in rupees and output in USD.
import java.util.Scanner;
public class rupeesconv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        double rupees = scanner.nextDouble();
        double usd = rupees / 82.0; // Assuming 1 USD = 82 INR
        System.out.printf("Amount in USD: %.2f\n", usd);
        scanner.close();
    }
}
