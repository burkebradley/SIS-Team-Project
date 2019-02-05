import java.io.*;
import java.util.ArrayList;

public class ReadFile
	{

		public static void readFile()
			{
				
			String line = null;	
			try
			{
				
			BufferedReader br = new BufferedReader(new FileReader("StudentList.txt"));
			int counter=0;
			int counter2=2;
			int counter3=0;
			
			while((line = br.readLine()) != null) 
		 	{
		 	//takes entire line and puts it into an array
		    String[] student = line.split(" ");
		    Runner.directory.add(new Student((student[0]+" "+student[1]), 0, new ArrayList<Course>()));
		    
		    for(int i=0; i<3; i++)
		    	{
		    	    //takes data from the array and creates student objects
		    		Runner.directory.get(counter).getClasses().add(new Course(student[counter2], student[counter2+1], counter3+1));
		    		counter2+=2;
		    		counter3++;
		    		
		    	}
		    counter++;
		    counter2=2;
		    counter3=0;
		 	}
			
			br.close();
			}
			catch(Exception e)
			{
				System.out.println("bet");
			}
			}
		
	}
