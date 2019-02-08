import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ChangeStudentGradeOrSchedule
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userStringput = new Scanner(System.in);
		static ArrayList<Student>  directory = new ArrayList<Student>();
		
		public static void main(String[] args)
			{	
				
				ReadFile.readFile();
				directory = Runner.directory;
				
				for(Student s: directory)
					{
						System.out.println(s.getName()+" "+s.getClasses().get(0).getName()+" "+s.getClasses().get(0).getGrade()+" "+s.getClasses().get(0).getPeriod()+" "+s.getClasses().get(1).getName()+" "+s.getClasses().get(1).getGrade()+" "+s.getClasses().get(1).getPeriod()+" "+s.getClasses().get(2).getName()+" "+s.getClasses().get(2).getGrade()+" "+s.getClasses().get(2).getPeriod());
					}
					System.out.println();
				changeStudentGradesOrSchedule();
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
				else if (userSelection == 2)
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
						for(int i = 0; i < directory.size(); i++)
							{
								System.out.println("(" + (i + 1)  + ") " + directory.get(i).getName());
							}
						userSelection = userInput.nextInt() - 1;
					}
				while(userSelection < 0 || userSelection > directory.size());
				System.out.println();
				do
					{
						System.out.println("Select a class to change the grade.");
						System.out.println("(1)" + directory.get(userSelection).getClasses().get(0).getName() + " " + directory.get(userSelection).getClasses().get(0).getGrade() + " "  + directory.get(userSelection).getClasses().get(0).getPeriod());
						System.out.println("(2)" + directory.get(userSelection).getClasses().get(1).getName() + " " + directory.get(userSelection).getClasses().get(1).getGrade() + " " + directory.get(userSelection).getClasses().get(1).getPeriod());
						System.out.println("(3)" + directory.get(userSelection).getClasses().get(2).getName() + " " + directory.get(userSelection).getClasses().get(2).getGrade() +  " " + directory.get(userSelection).getClasses().get(2).getPeriod());
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
				System.out.println(directory.get(userSelection).getName() + " " + directory.get(userSelection).getClasses().get(userClassSelection).getName() + " " + directory.get(userSelection).getClasses().get(userClassSelection).getGrade() + " " + directory.get(userSelection).getClasses().get(userClassSelection).getPeriod());
			}
		public static void changeStudentSchedule()
			{
				int userSelection;
				int userClassSelection;
				String className;
				String classGrade;
				do
					{
						System.out.println("Select a student:");
						for(int i = 0; i < directory.size(); i++)
							{
								System.out.println("(" + (i + 1)  + ") " + directory.get(i).getName());
							}
						userSelection = userInput.nextInt() - 1;
					}
				while(userSelection < 0 || userSelection > directory.size());
				System.out.println();
				do
					{
						System.out.println("Select a class you want to replace.");
						System.out.println("(1)" + directory.get(userSelection).getClasses().get(0).getName() + " " + directory.get(userSelection).getClasses().get(0).getGrade() + " "  + directory.get(userSelection).getClasses().get(0).getPeriod());
						System.out.println("(2)" + directory.get(userSelection).getClasses().get(1).getName() + " " + directory.get(userSelection).getClasses().get(1).getGrade() + " " + directory.get(userSelection).getClasses().get(1).getPeriod());
						System.out.println("(3)" + directory.get(userSelection).getClasses().get(2).getName() + " " + directory.get(userSelection).getClasses().get(2).getGrade() +  " " + directory.get(userSelection).getClasses().get(2).getPeriod());
						userClassSelection = userInput.nextInt() - 1;
					}
				while(userClassSelection < 0 || userClassSelection > 2);
				System.out.println("Enter the name of the new class.");
				className = userStringput.nextLine();
//				directory.get(userSelection).getClasses().get(userClassSelection).setName(className);
				System.out.println("Enter the starting grade of the new class.");
				classGrade = userStringput.nextLine();
//				directory.get(userSelection).getClasses().get(userClassSelection).setGrade(classGrade);
				
				int userConfirmation;
				int userIncorrectInfoSelection;
				boolean infoCorrect = false;
				do
					{
						System.out.println(directory.get(userSelection).getName() + " " + className + " " + classGrade + " " + directory.get(userSelection).getClasses().get(userClassSelection).getPeriod());
						System.out.println();
						System.out.println("Is this correct?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						userConfirmation = userInput.nextInt();
						System.out.println();
						if (userConfirmation == 2)
							{
								do
									{
										System.out.println("Which information is incorrect?");
										System.out.println("(1) Class Name");
										System.out.println("(2) Class Starting Grade");
										userIncorrectInfoSelection = userInput.nextInt();
										System.out.println();
										if (userIncorrectInfoSelection == 1)
											{
												System.out.println("Enter the name of the new class.");
												className = userStringput.nextLine();
											}
										else if (userIncorrectInfoSelection == 2)
											{
												System.out.println("Enter the starting grade of the new class.");
												classGrade = userStringput.nextLine();
											}
										System.out.println();
									}
								while (userIncorrectInfoSelection != 1 && userIncorrectInfoSelection != 2);
							}
						else if (userConfirmation == 1)
							{
								directory.get(userSelection).getClasses().get(userClassSelection).setName(className);
								directory.get(userSelection).getClasses().get(userClassSelection).setGrade(classGrade);
								infoCorrect = true;
							}
					}
				while (infoCorrect == false);
			}
	}
