//Devansh Bhatia (14CSU056)
import java.util.Scanner;
import java.util.regex.*;
public class time {

	static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = new String();
		System.out.println("Enter the time (24 hr format HH:MM)");
		str = obj.next();
		Pattern p = Pattern.compile("^(((0|1)?\\d)|(2[0-4])):([0-5]\\d)$");
		Matcher m = p.matcher(str);
		if(m.find())
		{
			System.out.println("Valid Time");
		}
		else
		{
			System.out.println("Invalid Time");
		}
		
	}
}

//Output:
//	Enter the time (24 hr format HH:MM)
//	21:30
//	Valid Time
