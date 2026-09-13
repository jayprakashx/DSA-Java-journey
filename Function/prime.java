//Define a method to find out if a number is prime or not.
import java.util.Scanner;
public class prime {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = input.nextInt();
        
        if(num >= 1){
            System.out.println("Its not a prime number");
            return;
        } 
        
        for(int i = 2; i< num; i++ ){
            System.out.println("its not a prime number");
            return;
        }
        System.out.println("its a prime number");    
    }
    
}
