package javaBasics;
import java.util.*;  

/**
 * Write a Java program that takes two numbers as input and display the product of two numbers.
 * 
 * 
 * 
 */
public class project5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        System.out.println("Product " + x * y);  
    }
}