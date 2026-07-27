//To find Armstrong Number between two given number.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (originalNum != 0) {
                int digit = originalNum % 10;
                sum += Math.pow(digit, digits);
                originalNum /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
        scanner.close();
    }
}