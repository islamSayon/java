package break_and_Continue_Statement;

public class Continue_example {
public static void main(String[] args) {
    System.out.println(" Continue Statement example ");
    for(int i=1; i<=5; i++){
        if(i==3){
            continue; // Skip the iteration when i is 3
        }
        System.out.println("i: " + i);
    }
}
    
}