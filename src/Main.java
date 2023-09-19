import java.util.Scanner;

public class Main {
    // instansiering - skapandet av ett objekt
    public static void main(String[] args) {

        boolean isPlaying = true;

        do{

           int result = scannerNumber();
           
           if(result > 1000){
               break;
           }
           for(int i = 0; i < result; i++){
               System.out.println(i);
               System.out.println("Looping --");

           }



        } while(isPlaying);




        /*while(true){
            scanner();
            break;
        }*/

    }

    public static int scannerNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a number");
        return scanner.nextInt();



    }


    public static String scannerText(){
        // instansiering - skapandet av ett objekt
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a random sentence");
        scanner.nextLine();

        String input = scanner.nextLine();

        return input;


    }



}