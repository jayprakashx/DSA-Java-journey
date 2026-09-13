//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner ;
public class sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
          
        System.out.println("Enter a number");
        int a = input.nextInt();

        System.out.println("Enter 2nd number");
        int b = input.nextInt();
        
        int sum = a + b ;

        System.out.println("Sum of two number is " + sum);
    }
                          
}
