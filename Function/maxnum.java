import java.util.Scanner;
public class maxnum {
     public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number" );
        int a = input.nextInt();

        System.out.print("Enter a 2nd number");
        int b = input.nextInt();

        System.out.print("Eter 3rd number");
        int c = input.nextInt();
        if (a > b && a > c) { 
            System.out.print("a is the largest number");
            } else if (b > a && b > c) {
                System.out.print("b is the largest number");
            } else {
                System.out.print("c is the largest number");
            }
        input.close(); 
     } 
}