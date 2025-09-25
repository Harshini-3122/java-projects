import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner apple = new Scanner(System.in);
        String name = apple.next();
        System.out.println("hello " +name);
        System.out.println("enter the number");
        int value = apple.nextInt();
        System.out.println(value);
    }
}
