import java.util.Scanner;

public class Main {
    // instansiering - skapandet av ett objekt
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Input number!");
            int result = scanner.nextInt();

            System.out.println("You picked " + result);


        } while (true);
    }
}