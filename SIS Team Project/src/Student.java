import java.util.ArrayList;

public class Student
	{
		private String name;
		private double gpa;
		private ArrayList<Course> classes;
		
		public Student(String n, double g, ArrayList<Course> c)
		{
			name = n;
			gpa = g;
			classes = c;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public double getGpa()
			{
				return gpa;
			}

		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}

		public ArrayList<Course> getClasses()
			{
				return classes;
			}

		public void setClasses(ArrayList<Course> classes)
			{
				this.classes = classes;
			}
		
		

	}
