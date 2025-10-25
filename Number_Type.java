import java.util.Scanner;

public class Number_Type {public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("---- Number Type Cheaker ----");

    System.out.print("Enter a Number : ");
    int num = input.nextInt();


    if( num>0 ){
        System.out.println(num+" is Positive Number ");
    }
    else if (num<0) {
        System.out.println(num+" is Negative Number");
    }
    else {
        System.out.println(num+" is zero");
    }


    input.close();


}
    
}
