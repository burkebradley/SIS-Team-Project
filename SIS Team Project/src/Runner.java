
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner
	{

		static int periodChoice = 0;
		static Scanner userInput = new Scanner(System.in);

		static ArrayList<Student> directory = new ArrayList<Student>();
		
		public static void main(String[] args)
			{
				ReadFile.readFile();
				sortStudents();
			}

		
		public static void sortStudents()
		{
			System.out.println("How would you like to sort students?\n"
					+ "1) Sort by last name\n"
					+ "2) Sort by GPA\n"
					+ "3) Sort by period");
			int userChoice = userInput.nextInt();
			
			switch(userChoice)
			{
				case 1: 
					Collections.sort(directory, new NameComparator());
					break;
				case 2: 
					Collections.sort(directory, new GPAComparator());
					break;
				case 3:
					System.out.println("Sort by which period?\n"
							+ "1) Period One\n"
							+ "2) Period Two\n"
							+ "3) Period Three");
					periodChoice = userInput.nextInt();
					Collections.sort(directory, new PeriodComparator());
					break;
				default:
					System.out.println("Invalid Input\n\n");
					sortStudents();
					break;
			}
			displayStudents();
		}
		
		public static void displayStudents()
		{
		

			for(Student s: directory)
				{
					System.out.printf("%-16s ", s.getName());
					System.out.printf("%-2s %.2f  ", "GPA: ", s.getGpa());
					System.out.printf("%-2s %-6s %10s %-2s", "P"+s.getClasses().get(0).getPeriod(), s.getClasses().get(0).getName(), "Grade: "+s.getClasses().get(0).getGrade(), " ");
					System.out.printf("%-2s %-6s %10s %-2s", "P"+s.getClasses().get(1).getPeriod(), s.getClasses().get(1).getName(), "Grade: "+s.getClasses().get(1).getGrade(), " ");
					System.out.printf("%-2s %-6s %10s\n", "P"+s.getClasses().get(2).getPeriod(),  s.getClasses().get(2).getName(), "Grade: "+s.getClasses().get(2).getGrade());
				}
			
		}
		
	}



