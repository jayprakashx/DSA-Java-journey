package Perimeter;

public class Equilateral_Triangle {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = input.nextDouble();

        double perimeter = 3 * side;

        System.out.println("Perimeter of the equilateral triangle is: " + perimeter);
        input.close();
    }
}
