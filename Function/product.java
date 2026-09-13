//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
public class product {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
          
        System.out.println("Enter a number");
        int a = input.nextInt();

        System.out.println("Enter 2nd number");
        int b = input.nextInt();
        
        int product = a * b ;

        System.out.println("product of two number is " + product);
    }
}
