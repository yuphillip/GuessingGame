package Pyu;

import java.util.Scanner;

public class PyuLib {
    public static void GuessingGame()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Can you guess my number ?");
        int newNum = (int)(Math.random()*100);
        int response = input.nextInt();
        while(newNum != response) {
            if (response > newNum) {
                System.out.println("My number is less then your guess!");
            }
            if (response < newNum) {
                System.out.println("My number is greater then your guess!");
            }
            response = input.nextInt();
        }
        input.close();
        System.out.println("Your guess was right!");
    }
    public static void AiGuessingGame()
    {
        Scanner input = new Scanner(System.in);
        int first = 50;
        int min = 0;
        int max = 100;
        System.out.println(first);
        String response = (input.next()).toLowerCase();
        while(!(response.equals("correct")))
        {
            if(response.equals("lower"))
            {
                int average = (first+min)/2;
                max = first;
                first = average;
                System.out.println(first);
            }
            if(response.equals("higher"))
            {
                int average = (first+max)/2;
                min = first;
                first = average;
                System.out.println(first);
            }
            response = (input.next()).toLowerCase();
        }
        System.out.println("Yay! I won. Thanks for playing with me! :D");
        input.close();
    }
}


