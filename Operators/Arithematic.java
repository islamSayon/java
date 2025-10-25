package Operators;

import java.util.Scanner;
public class Arithematic { public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    System.out.println("-----Arithematic Operators-----");

    System.out.print("Enter Number a = ");
    int a = input.nextInt();

    System.out.print("Enter Number b = ");
    int b = input.nextInt();

    System.out.println(" Your Result is :");


    System.out.println("a+b = "+(a+b));
    System.out.println("a-b = "+(a-b));
    System.out.println("a*b = "+(a*b));
    System.out.println("a/b = "+(a/b));
    System.out.println("a%b = "+(a%b));


    input.close();




}
    
}