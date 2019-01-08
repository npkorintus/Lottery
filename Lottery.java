// Author: Nick Korintus
// Program: Lottery Application
//
// This program simulates a lottery. It asks the user to enter five numbers, displays any
// matching numbers to the randomly generate lottery numbers, and displays if the user
// is a grand prize winner.


import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Lottery
{
	public static void main (String[] args) throws IOException
	{
		int [] lotteryNumbers = new int [5];
		int [] user = new int [5];
		int i;
		boolean winner = true;

		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();


		// For loop to generate random lottery numbers
		for (i = 0; i < 5; i++)
		{
			lotteryNumbers[i] = randomNumber.nextInt(10);
		}


		// Ask user to enter their lottery picks
		System.out.print("\nEnter your five lottery picks (0-9) with a space in between each number:");

		for (i = 0; i < 5; i++)
		{
			user[i] = keyboard.nextInt();
		}


		// Display matching numbers
		System.out.print("Matching numbers: ");
		for (i = 0; i < 5; i++)
		{
			if (lotteryNumbers [i] == user [i])
				System.out.print(user[i] + " ");
		}

		System.out.println();
		System.out.print("The winning numbers are: ");

		for (i = 0; i < 5; i++)
		{
			System.out.print(lotteryNumbers[i] + " ");
		}


		// Check if player is a winner
		i = 0;
		while (winner && i < lotteryNumbers.length)
		{
			if (lotteryNumbers[i] != user[i])
				winner = false;
			i++;
		}

		System.out.println("\n");


		// Display if user is a winner
		if (winner)
			System.out.println("Congratulations! You are a grand prize winner!");
		else
			System.out.println("Sorry, you are not a winner.");

		System.out.println("\n\n");
	}
}