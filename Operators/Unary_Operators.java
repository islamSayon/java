package Operators;

import java.util.Scanner;

public class Unary_Operators {public static void main(String[] args) {
    
    System.out.println("----- Unary Operators -----");

    Scanner input = new Scanner(System.in);
    

    System.out.print("Enter any Number : ");
    int c = input.nextInt();

    c++;
    System.out.println("After c++ : " +c);

    ++c;
    System.out.println("After ++c : " +c);

    c--;
    System.out.println("After c-- : " +c);

    --c;
    System.out.println("After --c : " +c);

    


    input.close();




}
    
}
