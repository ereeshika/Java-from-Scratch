import java.util.Scanner;
public class Test {
        public static void main(String[] args) {
            int num1;
            int num2;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number :");
            num1 = input.nextInt();
            System.out.println("Enter second number :");
            num2 = input.nextInt();
            System.out.println("Your total is "+(num1+num2));
        }
    }
