package NumberGuessingGame;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Random rnd=new Random();
		Scanner scn=new Scanner(System.in);
		int guess;
		int number=rnd.nextInt(10);
		 while(true)
		    {
		        System.out.print("\nEnter Your Guess : ");
		        guess=scn.nextInt();
		        if(guess<number)
		        	System.out.print("\nIncrease Your Number : ");
		        if(guess>number)
		        	System.out.print("\nReduce Your Number : ");
		        if(guess==number)
		        {
		        	System.out.print("\n-Congratulations-");
		             break;
		        }
		    }
	}
}
