import java.util.Scanner;
public class ForLoopChallenges
	{

		public static void main(String[] args)
			{
			challenge1();
			challenge2();
			challenge3();
			challenge4();
			challenge5();
			challenge6();
			challenge7();
			challenge8();
		

			}

		public static void challenge1()
			{
				//i love donuts
				for(int i = 1; i <= 5; i++)
					{
			System.out.println("I love donuts");
					}
			}
		public static void challenge2()
			{
			//1-5
			for(int i = 1; i<= 5; i++)
				{
				System.out.println(i);
				}

			System.out.println("");
			//5-1
			for(int i = 5; i >=1; i-=1)
				{
					System.out.println(i);	
				}
			}
		public static void challenge3()
			{
				//multiples of 5
				for(int i = 5; i <= 100; i += 5)
					{
						System.out.println(i);	
					}
			}
		public static void challenge4()
			{
			//totals of the multiples of 5
			int total = 0;
			for(int i = 5; i <= 100; i += 5)
				{
				total +=  i;
	
				}
			System.out.println(total);
			System.out.println("");
			}
		public static void challenge5()
			{
				//multiples of 5
				for(int i = 5; i <= 100; i += 5)
				{
					System.out.println(i);	
					}
				System.out.println("");
			}
		public static void challenge6()
			{
				//lowerbound and upperbound
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Give me a lower bound number");
				int lowerBound = userIntInput.nextInt();
				System.out.println("Give me a upperbound number");
				int upperBound = userIntInput.nextInt();
				for(int i = lowerBound; i <= upperBound; i += 1)
					{
						System.out.println(i);	
					}
				System.out.println("");
			}
		public static void challenge7()
			{
				//9X9 rectangle
				System.out.println("* * * * * * * *");
				for(int i = 1; i <= 9; i += 1)
					{
				System.out.println("*             *");
					}
				System.out.println("* * * * * * * *");

				System.out.println("");
			}
		public static void challenge8()
			{
			//10- 50
			for(int i = ((5*3)-5); i <= ((11*7)-23); i +=  ((5*3)-5))
				{
				System.out.println(i);
				

				}
			}
	}