import java.util.*;
class Countries
{
public static ArrayList<String> List(ArrayList<String>h)
{
return h;
}
public static void main(String args[])
{
 ArrayList<String> arr=new ArrayList<String>();
Scanner sc=new Scanner(System.in);
for(int i=0;i<=5;i++)
{
	String il=sc.next();
	arr.add(il);
}
		System.out.println(List(arr));
}
}
