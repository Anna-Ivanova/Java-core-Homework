import java.util.Random;
import java.util.Scanner;
 
public class Homework57 {
     
    public static void main (String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(101);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println( "- I guessed number between 1 and 1000" );
         
        while (win == false) {
         
            System.out.println( "Type number:" );
            guess = input.nextInt();
             
            numberOfTries++;
             
            if (guess == numberToGuess) {
                win = true;
            } 
            else if (guess < numberToGuess) {
                System.out.println("- Your guess is too low\n");
            }
            else if (guess > numberToGuess) {
                System.out.println("- Your guess is too high\n");
            }
        }  
        if (win == true) 
		{
			 	if (numberOfTries<=3){
		System.out.print ("You guessed a number, but looks like you're a cheater!"+numberOfTries);
				}
	else if (numberOfTries>=3 & numberOfTries<=7){
	System.out.print ("Congrats, you guessed a number!"+numberOfTries);
	}
		else if(numberOfTries>7){
		System.out.print ("You guessed a number, but can be better!"+numberOfTries);
	}
		}
		
            }
}
