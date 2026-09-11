//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
/*public class eveodd{
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = input.nextInt();

        if(a/2 == 0){
            System.out.println("IT is a Even number");
        }else{
            System.out.println("its a odd number");
        }
        input.close();
    }
    
} */
   //Method 2A: Using Bitwise OR (|)
    /* class eveodd {
    public static void main(String[] args) {
        int n = 100;

        if ((n | 1) > n) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}  */

    //Method 2B: Using Bitwise AND (&) Best Bitwise Approach

    /*class eveodd {
    public static void main(String[] args) {
        int n = 91;

        if ((n & 1) == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }
} */

    /*Method 2C: Using Bitwise XOR (^)
    
    class eveodd {
    public static void main(String[] args) {
        int num = 99;

        if ((num ^ 1) == num + 1) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}*/  

/*Method 3: Checking the Least Significant Bit (Modernized) */

class eveodd {
    static String checkOddEven(int n) {
        if (n == 0) return "Zero";
        return ((n & 1) == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " : " + checkOddEven(i));
        }
    }
}