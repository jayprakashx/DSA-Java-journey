import java.util.*;
public class Sum1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 20;
        int b = 10;

        swap(a , b);

        System.out.println(a+ " " +b);
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
