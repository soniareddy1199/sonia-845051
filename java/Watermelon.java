import java.util.Scanner;
class Watermelon{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
int n,i;
System.out.println("Enter weight" );
n=sc.nextInt();
if(n%2==0)
System.out.println("Equal parts are"+n/2+"  "+n/2 );
else
System.out.println("can't divide" );
for(i=1;i<=n;i++)
{
System.out.println(i+" "+(n-i));
}
}
}

