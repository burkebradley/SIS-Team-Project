import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userStringput = new Scanner(System.in);
		static ArrayList<Student> directory = new ArrayList<Student>();
		
		public static void main(String[] args)
			{
				ReadFile.readFile();
				
				for(Student s: directory)
					{
						System.out.println(s.getName()+" "+s.getClasses().get(0).getName()+" "+s.getClasses().get(0).getGrade()+" "+s.getClasses().get(0).getPeriod()+" "+s.getClasses().get(1).getName()+" "+s.getClasses().get(1).getGrade()+" "+s.getClasses().get(1).getPeriod()+" "+s.getClasses().get(2).getName()+" "+s.getClasses().get(2).getGrade()+" "+s.getClasses().get(2).getPeriod());
					}
			}
		public static void changeStudentGradesOrSchedule()
			{
				int userSelection;
				do
					{
						
						System.out.println("Would you like to change a students grade or schedule?");
						System.out.println("(1) Grade");
						System.out.println("(2) Schedule");
						userSelection = userInput.nextInt();
					}	
				while(userSelection != 1 && userSelection != 2);
				if (userSelection == 1)
					{
						changeStudentGrade();
					}
				else
					{
						changeStudentSchedule();
					}
			}
		public static void changeStudentGrade()
			{
				int userSelection;
				int userClassSelection;
				String userGradeInput;
				do
					{
						System.out.println("Select a student:");
						int i = 1;
						for(Student s: directory)
							{
								System.out.println("(" + i + ") " + s);
							}
						userSelection = userInput.nextInt() - 1;
					}
				while(userSelection < 0 || userSelection > directory.size());
				System.out.println();
				do
					{
						System.out.println("Select a class to change the grade.");
						System.out.println("(1)" + directory.get(userSelection).getClasses().get(0).getName() + directory.get(userSelection).getClasses().get(0).getGrade() + directory.get(userSelection).getClasses().get(0).getPeriod());
						System.out.println("(2)" + directory.get(userSelection).getClasses().get(1).getName() + directory.get(userSelection).getClasses().get(1).getGrade() + directory.get(userSelection).getClasses().get(1).getPeriod());
						System.out.println("(3)" + directory.get(userSelection).getClasses().get(2).getName() + directory.get(userSelection).getClasses().get(2).getGrade() + directory.get(userSelection).getClasses().get(2).getPeriod());
						userClassSelection = userInput.nextInt() - 1;
					}
				while(userClassSelection < 0 || userClassSelection > 2);
				boolean realGradeEntered = false;
				do
					{
						System.out.println("Enter the grade you would like to use for this class as an uppercase letter. Do not use a space to seperate any + or - symbols.");
						userGradeInput = userStringput.nextLine();
						if(userGradeInput.equals("A+") || userGradeInput.equals("A") || userGradeInput.equals("A-") || userGradeInput.equals("B+") || userGradeInput.equals("B") || userGradeInput.equals("B-") || userGradeInput.equals("C+") || userGradeInput.equals("C") || userGradeInput.equals("C-") || userGradeInput.equals("D+") || userGradeInput.equals("D") || userGradeInput.equals("D-") || userGradeInput.equals("F+") || userGradeInput.equals("F"))
							{
								realGradeEntered = true;
							}
					}
				while(realGradeEntered = false);
				directory.get(userSelection).getClasses().get(userClassSelection).setGrade(userGradeInput);
			}
		public static void changeStudentSchedule()
			{
				
			}
	}	

