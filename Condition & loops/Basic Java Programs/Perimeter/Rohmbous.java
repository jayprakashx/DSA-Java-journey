import java.util.Scanner;

class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of rhombus: ");
        double side = sc.nextDouble();

        double perimeter = 4 * side;

        System.out.println("Perimeter of Rhombus = " + perimeter);
    }
}