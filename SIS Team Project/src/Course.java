
public class Course
	{
		private String name, grade;
		private int period;
		
		public Course(String n, String g, int p)
		{
			name = n ;
			grade = g;
			period = p;
		}

		public int getPeriod()
			{
				return period;
			}

		public void setPeriod(int period)
			{
				this.period = period;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getGrade()
			{
				return grade;
			}

		public void setGrade(String grade)
			{
				this.grade = grade;
			}
		
		

	}
