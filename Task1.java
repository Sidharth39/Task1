import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        int randomNum = random.nextInt(100)+1;

       
        Scanner sc = new Scanner(System.in);

      
        while (true) {
            
            System.out.print("Enter your guess (between 1 and 100): ");
            int usersGuess = sc.nextInt();

            
            if (usersGuess == randomNum) {
                System.out.println("Congratulations! Your guess is correct.");
                break;
		
            } 
	    else if (usersGuess < randomNum) {
                System.out.println("Too low! Keep Trying.");
            } 
	    else {
                System.out.println("Too high! Keep Trying.");
            }
        }
	sc.close();
         
    }
}