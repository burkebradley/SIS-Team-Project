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
	}
