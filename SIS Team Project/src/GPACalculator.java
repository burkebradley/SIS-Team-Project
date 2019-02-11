
public class GPACalculator
	{
		static double GPA = 0;
		public static void calculateGPA()
		{
		for(int i =0; i<Runner.directory.size(); i++)
			{
				for(int a = 0; i<Runner.directory.get(i).getClasses().size(); a++)
					{
						switch(Runner.directory.get(1).getClasses().get(a).getGrade())
						{
							case "A+":
								GPA += 4.3;
								break;
							case "A":
								GPA += 4;
								break;
							case "A-":
								GPA += 3.7;
								break;
							case "B+":
								GPA += 3.3;
								break;
							case "B":
								GPA += 3;
								break;
							case "B-":
								GPA += 2.7;
								break;
							case "C+":
								GPA += 2.3;
								break;
							case "C":
								GPA += 2;
								break;
							case "C-":
								GPA += 1.7;
								break;
							case "D+":
								GPA += 1.3;
								break;
							case "D":
								GPA += 1;
								break;
							case "D-":
								GPA += 0.7;
								break;
							case "F":
								GPA += 0;
								break;
								
						}
					}
							Runner.directory.get(i).setGpa(GPA/3);
							GPA = 0;
								
				}
					
			
		}
	}
