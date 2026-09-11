//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
public class maxmin {
    //Method to find maximum

    static void  maximum(int a, int b, int c){
        if(a >= b && a>= c ){
            System.out.println("Maximum number is " +a);
        }else if(b >= a && b >= c){
          System.out.println("Maximum number is " +b);
        }else{
            System.out.println("Maximum number is " +c);
        }
    }

    //Method to find minimum

    static void minimum(int a, int b, int c ){
        if(a <= b && a <= c){
            System.out.println("Minimum number is " +a);
        }else if(b <= a && b<= c){
            System.out.println("Minimum number is " +b);
        }else{
            System.out.println("Minimum number is " +c);
        }

    }

    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
      System.out.println("Enter a number " );
      int a = input.nextInt();
      
      System.out.println("Enter a number " );
      int b = input.nextInt();

      System.out.println("Enter a number " );
      int c = input.nextInt();
      
      //calling the method
      maximum(a,b,c);
      minimum(a,b,c);

      input.close();
    }
}