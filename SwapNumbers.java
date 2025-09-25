import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a : ");
        int a = sc.nextInt();
        System.out.print("Enter second number b : ");
        int b = sc.nextInt();
        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b; 
        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
