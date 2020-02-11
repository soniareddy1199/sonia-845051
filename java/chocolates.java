import java .util.Scanner;
class chocolates
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m,n;
System.out.println("Enter number of chocolates");
m=sc.nextInt();
System.out.println("Enter number of childrens");

n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(m>=i)
m=m-i;
else
n=i-1;
}
System.out.println("remaining="+m);
System.out.println("lost child="+n);
}
}