import java.util.Scanner;

class PyramidVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base length: ");
        double l = sc.nextDouble();

        System.out.print("Enter base width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = (1.0 / 3) * l * w * h;

        System.out.println("Volume of Pyramid = " + volume);
    }
}