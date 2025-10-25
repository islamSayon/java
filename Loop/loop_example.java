package Loop;
import java.util.Scanner;

public class loop_example {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Set Your Passward : ");
    String set_Pass = input.nextLine();

    String userpass = "";


    while (!userpass.equals(set_Pass)) {

        System.out.print("enter your passward To Login : ");
        userpass = input.nextLine();

        }
    System.out.println("your passward is correct. You Login Successfully .");

    input.close();
}
    
}

