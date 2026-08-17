package Perimeter;

public class Parallelogram {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the base of the parallelogram:");
        int base = input.nextInt();
        System.out.print("Enter the height of the parallelogram:");
        int height = input.nextInt();
        int perimeter = 2 * (base + height);
        System.out.println("Perimeter of the parallelogram is: " + perimeter);
        input.close();
    }
}
