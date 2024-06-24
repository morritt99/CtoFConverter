import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        // Scanner class
        Scanner scan = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(10*Math.random());

        int i, guess;

        System.out.println("Guess the number between 1-10: ");
        guess = scan.nextInt();

        System.out.println(number);

        if(number > guess){
            System.out.println("too low"); // guess was too low against random number
        } else if (number < guess) {
            System.out.println("On the Money!"); //guess was correct!

        }

    }
    }
