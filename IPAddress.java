//Devansh Bhatia (14CSU056)
import java.util.Scanner;
import java.util.regex.*;
public class ipmatcher {

	static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = new String();
		System.out.println("Enter the IP Address: ");
		str = obj.next();
		Pattern p = Pattern.compile("^(((0?\\d?\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5]))\\.){3}((0?\\d?\\d)|(1\\d\\d)|(2[0-4]\\d)|(25[0-5]))$");
		Matcher m = p.matcher(str);
		if(m.find())
		{
			System.out.println("Valid IP Address");
		}
		else
		{
			System.out.println("Invalid IP Address");
		}
		
	}
}

//Output:
//	Enter the IP Address: 
//	1.1.1.256
//	Invalid IP Address
