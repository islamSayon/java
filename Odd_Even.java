import java.util.Scanner;
public class Odd_Even {public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("---- Odd Even Cheaker ----");

    System.out.print("Enter a Number : ");
    int num = input.nextInt();

    if ( num%2==0 ) {
        System.out.println( num+" is Even Number "); 
    }
    else{
        System.out.println(num+" is Odd Number");
    }

    input.close();

}
    
}
