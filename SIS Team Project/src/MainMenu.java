import java.util.Scanner;

public class MainMenu
	{
		static boolean run = true;
		public static void main(String[] args)
			{
				Scanner userNumber = new Scanner(System.in);				
				String[] choice = new String[3];
				choice[0] = "Add or delete a student";
				choice[1] = "Change Student's Grades/Schedule";
				choice[2] = "Sort Students";
				
				System.out.println("Main Menu");
				while(run)
					{
						for (int i = 0; i < choice.length; i++)
				        	   {
				        		   System.out.println((i+1)+ ". " + choice[i]);
				        	   }
						int userChoice = userNumber.nextInt();
						
						switch(userChoice)
						{
							case 1:
								//Input Add Student method
								break;
								
							case 2:
								//Input Change Student's Grades/Schedule method
								break;
								
							case 3:
								//Input Sort Students method
								break;
						}
						
						System.out.println("Would you like to return to the main menu?");
						
						Scanner userInput = new Scanner(System.in);
						String again = userInput.nextLine();
						again.toLowerCase();
						
						if(again.equals("yes"))
							{
								run = true;
							}
						else
							{
								run = false;
								System.out.println("Have a nice day!");
							}
						
						
						
					}
				
				
				
				

			}

	}
