import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Random random = new Random();
        int randomNum = random.nextInt(36);
        int numberOfGuess = 0;
        while (numberOfGuess < 10) {
            System.out.println("guess my random number");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput > randomNum) {
                System.out.println("too high!!");
                numberOfGuess++;
            } else if (userInput < randomNum){
                System.out.println("too low!!");
                numberOfGuess++;
            } else if (userInput == randomNum){
                System.out.println("wow you got it!! \n" +
                        "it only took " + numberOfGuess + " tries");
                break;
            } else {
                System.out.println("try again??");
                numberOfGuess++;
            }
            if (numberOfGuess == 0){
                System.out.println("wow you suck");
            }
        }
    }
}
