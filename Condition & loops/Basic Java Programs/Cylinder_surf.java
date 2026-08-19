import java.util.Scanner;

class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double csa = 2 * Math.PI * r * h;

        System.out.println("Curved Surface Area of Cylinder = " + csa);
    }
}