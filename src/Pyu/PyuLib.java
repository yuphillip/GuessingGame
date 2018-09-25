package Pyu;

import java.util.Scanner;

public class PyuLib {
    public static void main(String[]args)
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
    
}

