import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      Random random = new Random();

      int guessTotal = 0;

      System.out.println("I'm thinking of a random number. Guess it.");
      
      for (int number = random.nextInt(101); guessTotal < 11; guessTotal++ ){
        System.out.println("Guess " + guessTotal + ":");
        int guess = input.nextInt();

        if (guess == number){
          System.out.println("hip hip hurray!");
          break;
        }
        else if (guess > number){
          System.out.println("Your guess is greater than my number");
        }
        else if (guess < number){
          System.out.println("Your guess is less than my number");
        }
      }
    }
  }