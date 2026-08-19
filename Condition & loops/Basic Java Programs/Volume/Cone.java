import java.util.Scanner;

class ConeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = (1.0 / 3) * Math.PI * r * r * h;

        System.out.println("Volume of Cone = " + volume);
    }
}