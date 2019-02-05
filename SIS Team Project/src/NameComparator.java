import java.util.Comparator;

//this class allows students to be sorted based on last name using Collections.sort()

public class NameComparator implements Comparator<Student>
	{

	@Override
	public int compare(Student s1, Student s2)
		{
			String[] name1 = s1.getName().split(" ");
			String[] name2 = s2.getName().split(" ");
			
			String n1 = name1[1].substring(0, 1);
			String n2 = name2[1].substring(0, 1);
			
			return n1.compareTo(n2);
		}

	}
