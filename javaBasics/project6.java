package javaBasics;
import java.util.*;

/**
 * project6
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers input by user.
 * Note: System.out.print("Subtracted " + x-y); Shows eror that "-" is undefined argument (This is because When + or - is used with a string they are no more arithematic operators)
 */
public class project6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        System.out.println("Sum "); System.out.print(x+y);
        System.out.println("Product " + x*y);
        System.out.print("Subtraction "); System.out.print(x-y);
        System.out.println("Division " + x/y);
        System.out.println("Remainder " + x%y);

    }
}