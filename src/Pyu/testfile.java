package Pyu;

import java.util.Scanner;

import static Pyu.PyuLib.AiGuessingGame;
import static Pyu.PyuLib.GuessingGame;

public class testfile {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Which game do you version do you want to play? You guessing? or Ai guessing?");
        String response = input.nextLine();
        response = response.toLowerCase();
        if(response.equals("you guessing"))
        {
            GuessingGame();
            input.close();
        }
        if (response.equals("ai guessing"))
        {
            AiGuessingGame();
            input.close();
        }
        else
        {
            System.out.println("Sorry never heard of that before.");
        }

    }
}

