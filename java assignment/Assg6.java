import java.util.*;
public class Assg6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=n%10;
		switch(r)
		{
			case 0:
					System.out.println("zero");
					break;
			case 1 :
					System.out.println("One");
					break;
			case 2 :
					System.out.println("Two");
					break;
			case 3 :
					System.out.println("Three");
					break;
			case 4 :
					System.out.println("Four");
					break;
			case 5 :
					System.out.println("Five");
					break;
			case 6 :
					System.out.println("Six");
					break;
			case 7 :
					System.out.println("Seven");
					break;
			case 8 :
					System.out.println("Eight");
					break;
			case 9 :
					System.out.println("Nine");
					break;
		}
	}
}