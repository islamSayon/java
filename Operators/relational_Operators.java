package Operators;

import java.util.Scanner;

public class relational_Operators {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("----- Relational Operators -----");

        
        System.out.print("Enter Number x = ");
        int x = input.nextInt();

        System.out.print("Enter Number y = ");
        int y = input.nextInt();


        System.out.println("x==y"+(x==y));
        System.out.println("x!=y"+(x!=y));
        System.out.println("x>y"+(x>y));
        System.out.println("x<y"+(x<y));
        System.out.println("x>=y"+(x<=y));
        System.out.println("x<=y"+(x<=y));

        input.close();


    }
}
