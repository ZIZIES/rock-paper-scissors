import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("rock, paper, or scissors? ");

        String userinput = scanner.next();
        int computerChoice = random.nextInt(3);

        //0 is rock
        //1 is paper
        //2 is scissors
        
        if (computerChoice == 0)
        {
            if (userinput.equals("rock"))
            {
                System.out.println("it's a tie!");
            }

            if (userinput.equals("paper"))
            {
                System.out.println("you win!");
            }
            
            if (userinput.equals("scissors"))
            {
                System.out.println("you lose, but theres always next time!");
            }
        }

        if (computerChoice == 1)
        {
            if (userinput.equals("rock"))
            {
                System.out.println("you lose, but theres always next time!");
            }

            if (userinput.equals("paper"))
            {
                System.out.println("it's a tie!");
            }

            if (userinput.equals("scissors"))
            {
                System.out.println("you win!");
            }
        }

        if (computerChoice == 2)
        {
            if (userinput.equals("rock"))
            {
                System.out.println("you win!");
            }

            if (userinput.equals("paper"))
            {
                System.out.println("you lose, but theres always next time!");
            }

            if (userinput.equals("scissors"))
            {
                System.out.println("it's a tie!");
            }
        }
    }
}