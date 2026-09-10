import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            n = sc.nextInt();

            if (n == 0) {
                break;
            }

            sum = sum + n;
        }

        System.out.println("Sum = " + sum);
    }
}
