import java.util.Scanner;
class Positive {
public static void main(String args[])
    {
        int a[]=new int[20];
	int n,sum=0,i;
	Scanner sc =new Scanner(System.in);
        System.out.println("Enter values into array ");
        n=sc.nextInt();
	for(i=0;i<=n;i++)
        {
		a[i]=sc.nextInt();
	}
        for(i=0;i<=n;i++)
	{
         	if(a[i]>0)
			{
          			sum=sum+i;
			}
	}
       System.out.println(sum);
    }
}
