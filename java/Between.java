import java .util.Scanner;
class Between{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
if(a<=b){
for(int i=a;i<=b;i++){
System.out.println(+i);
}
}
}
}