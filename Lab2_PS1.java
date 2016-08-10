//Devansh Bhatia (14CSU056)
import java.util.Scanner;
import java.util.regex.*;
public class Regex1 {

	static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String pat = new String();
		String str = new String();
		System.out.println("Enter the Pattern: ");
		pat = obj.next();
		System.out.println("Enter the String: ");
		str = obj.next();
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		while(m.find())
		{
			System.out.println("String matched at index :"+m.start());
		}
		
	}
}

//Output:
//	Enter the Pattern: 
//	[a-z]+
//	Enter the String: 
//	abcdDegasDejk
//	String matched at index :0
//	String matched at index :5
//	String matched at index :10
