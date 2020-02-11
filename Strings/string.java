import java.util.*;
class string
{
	public static void main(String args[])	
		{
			char ch;	
			String s1="WELCOME TO JAVA WORLD";
			String s2="welcome";
			ch=s1.charAt(5);
			System.out.println(ch);
			System.out.println(s1.equalsIgnoreCase(s2));
			String s3=" let us learn";
			System.out.println(s1.concat(s3));
			System.out.println("the index of a is in :" +s1.indexOf('a'));
			String new_str = s1.substring(5,10);
			System.out.println("the charecters between 4th index and 10th index are: " +new_str);
			String s4=s1.replace('a','e');
			System.out.println("after replacing a with e:" +s4);		
			
			System.out.println("to lowercase : " +s1.toLowerCase());

		}
}