package Perimeter;

public class Circle {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter of the circle is: " + perimeter);
        input.close();
    }
}
