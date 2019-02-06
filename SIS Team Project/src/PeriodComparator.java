import java.util.Comparator;

//this class sorts students based on their period utilizing Collections.sort()

public class PeriodComparator implements Comparator<Student>
	{

	@Override
	public int compare(Student s1, Student s2)
		{
			return s1.getClasses().get(Runner.periodChoice-1).getName().compareTo(s2.getClasses().get(Runner.periodChoice-1).getName());
		}

	}
