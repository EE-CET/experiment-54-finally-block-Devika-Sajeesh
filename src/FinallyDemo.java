import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int result = a/b; // Enclose division in try block
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e){ // Catch ArithmeticException
            System.out.println("Error: / by zero");
        }
        finally{ // finally block
            System.out.println("Finally block executed");
        }
        // TODO: Read a and b
        
        // TODO: try block
        // Perform division
        // Print "Result: " + result
        
        // TODO: catch ArithmeticException e
        // Print "Error: " + e.getMessage()
        
        // TODO: finally block
        // Print "Finally block executed"
    }
}
