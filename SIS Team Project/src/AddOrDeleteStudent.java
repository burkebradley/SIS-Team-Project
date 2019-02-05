import java.util.Scanner;

public class AddOrDeleteStudent
	{
		public static void addStudent()
		{
			Scanner userInput1 = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Press '1' to add a student.");
			System.out.println("Press '2' to delete a student.");
			int userChoice = userInput1.nextInt();
			if (userChoice == 1)
				{
					System.out.println("What is the student's full name?");
					String name = userInput2.nextLine();
					System.out.println("What is the student's first period class?");
					String class1 = userInput2.nextLine();
					System.out.println("What is the student's first period grade?");
					String grade1 = userInput2.nextLine();
					System.out.println("What is the student's second period grade?");
					
					Runner.directory.add(new Student(name, 0, ));
				}
			else if(userChoice == 2)
				{
					for(int i = 0; i<Runner.directory.size(); i++)
						{
							System.out.println("What is the name of the student that you would like to remove from the class?");
							String studentToRemove = userInput2.nextLine();
							if (studentToRemove.equals(Runner.directory.get(i)))
								{
									Runner.directory.remove(i);
								}
						}
				}
			else
				{
					System.out.println("Please follow the instructions.");
				}
		}

	}
