import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random randomNumber= new Random();
        int rightGuess=randomNumber.nextInt(100);
        int chances=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100, You will have 10 chances!" );
        System.out.println("best of luck!");

        int guess;
        int i=0;
        boolean win=false;

        while(win==false) {
            guess=scan.nextInt();
            chances++;

            if(guess==rightGuess) {
                win=true;
            }
            else if(i>8){
                System.out.println("You loose! the right answer was: "+rightGuess);
                return;
            }
            else if(guess<rightGuess){
                i++;
                System.out.println("Yor Guess is lower than the right guess! chances left: "+(10-i));
            }
            else if(guess>rightGuess) {
                i++;
                System.out.println("Your Guess Is Higher Than THe Right Guess! chances left: "+(10-i));
            }
        }

        System.out.println("YOu win!");
        System.out.println("Then number was "+rightGuess);
        System.out.println("You used "+chances+" turns to guess the right number");
        System.out.println("Your score is "+((11-chances)*10)+" out of 100");

    }
}