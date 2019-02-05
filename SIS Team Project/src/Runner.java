
import java.util.ArrayList;

public class Runner
	{

		static ArrayList<Student> directory = new ArrayList<Student>();
		
		public static void main(String[] args)
			{
				ReadFile.readFile();
				
				for(Student s: directory)
					{
						System.out.println(s.getName()+" "+s.getClasses().get(0).getName()+" "+s.getClasses().get(0).getGrade()+" "+s.getClasses().get(0).getPeriod()+" "+s.getClasses().get(1).getName()+" "+s.getClasses().get(1).getGrade()+" "+s.getClasses().get(1).getPeriod()+" "+s.getClasses().get(2).getName()+" "+s.getClasses().get(2).getGrade()+" "+s.getClasses().get(2).getPeriod());
					}
			}
		
	}

