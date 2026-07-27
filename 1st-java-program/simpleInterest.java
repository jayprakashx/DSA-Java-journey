//wrp to input principle , time and rate and calculate simple interest
import java.util.Scanner;
public class simpleInterest{
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the time period: ");
        double time = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
        scanner.close();
    }
}
