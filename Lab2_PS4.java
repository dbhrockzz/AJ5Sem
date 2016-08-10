//Devansh Bhatia (14CSU056)

// Given a username, check whether that username is valid. A valid username will have the following properties:
// a. The username can contain alphanumeric characters and/or underscores(_).
// b. The username must start with an alphabetic character.
// c. 8  <=Username<= 15

import java.util.Scanner;
import java.util.regex.*;
public class Regex4 {

	static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = new String();
		System.out.println("Enter the Username: ");
		str = obj.next();
		Pattern p = Pattern.compile("^[a-zA-z]\\w{7,14}$");
		Matcher m = p.matcher(str);
		if(m.find())
		{
			System.out.println("Valid Username");
		}
		else
		{
			System.out.println("Invalid Username");
		}
		
	}
}

//Output:
//	Enter the Username: 
//	Abcd123_23
//	Valid Username
