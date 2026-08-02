import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of the equal sides of the isosceles triangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the Base of the isosceles triangle: ");
        double base = input.nextDouble();
        double Area = (length * base ) / 2 ;
        System.out.println("Area of the isosceles triangle is: " + Area);
        input.close();
    }
}
