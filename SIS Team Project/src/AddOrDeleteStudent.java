
import java.util.ArrayList;

public class AddOrDeleteStudent
	{
	
		public static void addOrDelete()
		{
			System.out.println("Select an Option:\n"
					+ "1) Add a Student\n"
					+ "2) Delete a Student");
			
			int choice = Runner.userInput.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter your Student's name");
				String tempName = Runner.userInput.next();
				Runner.directory.add(new Student(tempName, 0.00, new ArrayList<Course>()));
				System.out.println("\nAdd 3 Courses");
				
				for(int i=0; i<3; i++)
				{
					System.out.println("\nEnter course "+(i+1)+"'s name:");
					tempName = Runner.userInput.next();
					System.out.println("Enter course "+(i+1)+"'s grade:");
					String tempGrade = Runner.userInput.next();
					
					Runner.directory.get(Runner.directory.size()-1).getClasses().add(new Course(tempName, tempGrade.toUpperCase(), (i+1)));
				}
			    
				System.out.println("\nStudent Added");
			}
			else
			{
				Runner.displayStudents();
				System.out.println("\nWhich student would you like to remove?");
				int userDecision = Runner.userInput.nextInt();
				System.out.println("Removed: "+Runner.directory.get(userDecision-1).getName());
				Runner.directory.remove(userDecision-1);
			}
		}
=======
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
