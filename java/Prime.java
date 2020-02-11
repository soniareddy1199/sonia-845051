import java.util.Scanner;
class Prime{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
int n,i,c=0,flag=0,j ;
System.out.println("Enter a number");
n=sc.nextInt();
for(i=2;i<=n;i++)
{
c=0;
for(j=2;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==1 && flag==0)
{
System.out.println(+i);
flag=1;
}
else if(c==1 && flag==1)
flag=0;
}
}
}
