import java.util.*;
class Second
{
public static ArrayList<Integer> List(ArrayList<Integer>h)
{
return h;
}
public static void main(String args[])
{
 ArrayList<Integer> arr=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
for(int i=1;i<=10;i++)
{
	int il=sc.nextInt();
	arr.add(il);
}
		System.out.println(List(arr));
}
}
