package Loop;

import java.util.Scanner;
public class For_Loop {public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("enter number : ");

    for (int i =input.nextInt() ; i<=5; i++){
        
        System.out.println( " Number : " +i);

    }
    input.close();
    
}
    
}
