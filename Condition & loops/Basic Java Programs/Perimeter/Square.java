package Perimeter;

public class Square {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = input.nextDouble();

        double perimeter = 4 * side;

        System.out.println("Perimeter of the square is: " + perimeter);
        input.close();
    }
}
