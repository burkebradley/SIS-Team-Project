import java.util.Comparator;

//this class sorts students based on their period utilizing Collections.sort()

public class PeriodComparator implements Comparator<Student>
	{

	@Override
	public int compare(Student s1, Student s2)
		{
			if(s1.getClasses().get(0).getPeriod()>s2.getClasses().get(0).getPeriod())
				{
					return 1;
				}
			return -1;
		}

	}
