import java.util.Scanner;

public class MainMenu
	{

		public static void main(String[] args)
			{
				System.out.println("Main Menu:");
				System.out.println("1. Add or Delete a Student");
				System.out.println("2. Change Student's grades/schedule");
				System.out.println("3. Sort Students");
				
				Scanner number = new Scanner(System.in);
				int userChoice = number.nextInt();
				
				if(userChoice == 1)
					{
						//Add student method
						
						
					}
				else if(userChoice == 2)
					{
						//Add grades/schedule change method
						
					}
				else if(userChoice == 3)
					{
						//Add sort students method
						
					}
				

			}

	}
