import java.util.ArrayList;
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
								System.out.println("What is the student's second period class?");
								String class2 = userInput2.nextLine();
								System.out.println("What is the studnet's second period grade?");
								String grade2 = userInput2.nextLine();
								System.out.println("Whats is the student's third period class?");
								String class3 = userInput2.nextLine();
								System.out.println("What is the student's third period grade?");
								String grade3 = userInput2.nextLine();
								
								
								Runner.directory.add(new Student(name, 0.00, new ArrayList<Course>()));
								Runner.directory.get(Runner.directory.size()-1).getClasses().add(new Course(class1,grade1, 1));
								Runner.directory.get(Runner.directory.size()-1).getClasses().add(new Course(class2,grade2, 2));
								Runner.directory.get(Runner.directory.size()-1).getClasses().add(new Course(class3,grade3, 3));
							}
						else if(userChoice == 2)
							{
								for(int i = 0; i<Runner.directory.size(); i++)
									{
										System.out.println("What is the name of the student that you would like to remove from the class?");
										Runner.displayStudents();
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
						public static void calculateGPA()
							{
							for(int i =0; i<Runner.directory.size(); i++)
								{
									for(int a = 0; i<Runner.directory.get(i).getClasses().size(); a++)
										{
											switch(Runner.directory.get(1).getClasses().get(a).getGrade())
											{
												case "A+":
													GPACalculator.GPA += 4.3;
													break;
												case "A":
													GPACalculator.GPA += 4;
													break;
												case "A-":
													GPACalculator.GPA += 3.7;
													break;
												case "B+":
													GPACalculator.GPA += 3.3;
													break;
												case "B":
													GPACalculator.GPA += 3;
													break;
												case "B-":
													GPACalculator.GPA += 2.7;
													break;
												case "C+":
													GPACalculator.GPA += 2.3;
													break;
												case "C":
													GPACalculator.GPA += 2;
													break;
												case "C-":
													GPACalculator.GPA += 1.7;
													break;
												case "D+":
													GPACalculator.GPA += 1.3;
													break;
												case "D":
													GPACalculator.GPA += 1;
													break;
												case "D-":
													GPACalculator.GPA += 0.7;
													break;
												case "F":
													GPACalculator.GPA += 0;
													break;
													
											}
										}
												Runner.directory.get(i).setGpa(	GPACalculator.GPA /3);
												GPACalculator.GPA = 0;
													
									}
										
								
							}

		}

