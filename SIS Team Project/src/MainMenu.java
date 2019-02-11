import java.util.Scanner;

public class MainMenu
	{

		public static void printMainMenu()
			{
				System.out.println("Main Menu:");
				System.out.println("1) Add or Delete a Student");
				System.out.println("2) Change Student's grades/schedule");
				System.out.println("3) Sort Students");
				
				Scanner number = new Scanner(System.in);
				int userChoice = number.nextInt();
				
				if(userChoice == 1)
					{
						AddOrDeleteStudent.addOrDelete();
					}
				else if(userChoice == 2)
					{
						//Add grades/schedule change method
						
					}
				else if(userChoice == 3)
					{
						Runner.sortStudents();
					}
				
				System.out.println("/nWhat would you like to do nex?\n"
						+ "1) Carry out another operation\n"
						+ "2) Quit");
				
				userChoice = number.nextInt();
				
				if(userChoice==1)
				{
					printMainMenu();
				}
				else
				{
					System.exit(0);
				}
				
			}

	}
