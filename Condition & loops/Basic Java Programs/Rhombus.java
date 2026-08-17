public class Rhombus {
    public static void main(String [] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the length of the diagonal 1 of the rhombus:");
        int d1 = input.nextInt();
        System.out.print("Enter the length of the diagonal 2 of the rhombus:");
        int d2 = input.nextInt();

        int area = (d1 * d2) / 2 ; 
        System.out.println("Area of the rhombus is: " + area);
        input.close();
    }
}
