import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int number,mod,i=0;
		System.out.print("Enter Number : ");
		number=scn.nextInt();
		while(number>0)
		{
			i++;
			mod=number%10;
			number=number/10;
			if(mod%3==0)
				System.out.println("\n"+i+". digit is divisible");
			else
				System.out.println("\n"+i+". indivisible");
		}
		
	}
}