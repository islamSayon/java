package Operators;
import java.util.Scanner;

public class Assignment_Operators {public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("----- Assignment Operators -----");

    
    System.out.print("enter any Number : ");
    int num = input.nextInt();
    
    num +=5;
    System.out.println("After num += : "+num);

    num -=4;
    System.out.println("After num -= : "+num);

    num *=2;
    System.out.println("After num *= : "+num);

    num /=2;
    System.out.println("After num /= : "+num);

    num %=1;
    System.out.println("After num %= : "+num);

    input.close();
}
    
}
