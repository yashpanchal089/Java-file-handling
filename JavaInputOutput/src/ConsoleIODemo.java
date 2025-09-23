//Console Input (I) → Reading data entered by the user through the keyboard.
//Console Output (O) → Displaying data back to the user on the screen.

/*In simple terms:
Input = You type something.
Output = Program shows something.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleIODemo {
    public static void main(String[] args) throws IOException {

        //1. Using BufferedReader (old way, before Java 5)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name");
        String name = br.readLine();

        System.out.println("Enter Your Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Hello "+ name + ", you are " + age + " years old. ");

        //2. Using Scanner (modern & easier way)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your City");
        String city = sc.nextLine();

        System.out.println("Enter your pin code: ");
        int pin = sc.nextInt();

        System.out.println("You live in : " + city + " pin code of the city is " + pin);
//        sc.close();

        // 3. Using Console Class (Java 6+)
        java.io.Console console = System.console();

        if(console == null) {
            System.out.println("Console is not available");
            return;
        }

        String username = console.readLine("Enter username : " );
        char[] password = console.readPassword("Enter password: ");

        System.out.println("Hello "+ username + ", your password is hidden");
    }
}
