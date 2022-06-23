package javaBasics;
import java.util.*;
//Write a Java program that takes a number as input and prints its multiplication table upto 10.
public class project7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
         
        for (int i=0; i< 10; i++){
         System.out.println(num1 + " x " + i + " = " + 
           (num1 * (i)));
        }
    }
}