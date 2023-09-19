import com.André.scanner.Student;

import java.util.Scanner;

public class Main {
    // instansiering - skapandet av ett objekt
    public static void main(String[] args) {

        // objects
        Scanner scanner = new Scanner(System.in);
        Student benny = new Student();

        // Game
        do {

            System.out.println("Input Benny's age!");
            int result = scanner.nextInt();

            benny.age = result;

            System.out.println("You picked " +  result);
            System.out.println("Benny's age is " + result);


        } while (true);
    }
}