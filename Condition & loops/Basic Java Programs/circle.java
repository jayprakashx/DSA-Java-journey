//Area of circle.
import java.util.Scanner;
public class circle{
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the radius of the circle;");
    double radius = input.nextDouble();
    double area = 2*radius*3.14;
    System.out.println("Area of circle is: " + area);
    input.close();
 }
}