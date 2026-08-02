//Area of tringle
import java.util.Scanner;
public class Tringle{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the height of the triangle: ");
    double height = input.nextDouble();
    System.out.print("Enter the base of the triangle: ");
    double base = input.nextDouble();
    double area =( height * base) / 2 ;  
    System.out.println("Area of tringle ="+ area);
    input.close();   
}
}
