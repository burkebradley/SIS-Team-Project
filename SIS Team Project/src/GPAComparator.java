import java.util.Comparator;

public class GPAComparator implements Comparator<Student>
	{

	@Override
	public int compare(Student s1, Student s2)
		{
			if(s1.getGpa()>s2.getGpa())
				{
					return 1;
				}
			return -1;
		}

	}
