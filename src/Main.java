import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isValid = true;
        char repeat;

        do{
            int randomNumber = random.nextInt(100);
            for (int i = 0;i<=10;i++){
                System.out.println("Guess the number (1-100): ");
                int userGuessedNumber = scanner.nextInt();

                if(userGuessedNumber < 1 || userGuessedNumber >100){
                    System.out.println("Invalid Process");
                    i = 0;
                } else {
                    if(userGuessedNumber < randomNumber){
                        System.out.println("Too Low");
                    } else if (userGuessedNumber > randomNumber ) {
                        System.out.println("Too High");
                    }else {
                        System.out.println("Correct");
                        System.out.println("You took " + i + " tries!");
                        break;
                    }
                }
            }

            System.out.println("Do you want to play again? (Y/N): ");
            repeat = scanner.next().charAt(0);
        } while (repeat == 'Y'  || repeat == 'y');
        System.out.println("Thank you For Playing");

    }
}