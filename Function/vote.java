//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;
public class vote {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your curent age");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("Candidate is eligible for voating");
        }else{
            System.out.println("candidate is not eligible for voating");
        }
    }
}
