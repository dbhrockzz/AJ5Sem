//DEVANSH BHATIA (14CSU056)

// Given a string replace all the occurrences of all words starting with itm like itm, itmindia, itmindia.edu with ncu

import java.util.Scanner;
import java.util.regex.*;
public class ItmtoNcu {

	static Scanner obj = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String str = new String();
		System.out.println("Enter the String: ");
		str = obj.nextLine();
		Pattern p = Pattern.compile("\\b(?i)itm");
		Matcher m = p.matcher(str);
		String newstring = m.replaceAll("ncu");
		System.out.println("New String : \n"+newstring);
	}
}

//Output : 
//Enter the String: 
//itm itmindia itmindia.edu itmggn is now itmgurgaon ggnitm is now ggnitm
//New String : 
//ncu ncuindia ncuindia.edu ncuggn is now ncugurgaon ggnitm is now ggnitm
