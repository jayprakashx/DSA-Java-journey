public class Parallelogram {
    public static void main(String [] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the base of the parallelogram:");
        int base = input.nextInt();
        System.out.print("Enter the height of the parallelogram:");
        int height = input.nextInt();

        int area = base * height ; 
        System.out.println("Area of the parallelogram is: " + area);
        input.close();
    }
}
