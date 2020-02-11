import java.util.Scanner;

class Discount{
  public static void main (String[] args) {
 Scanner sc = new Scanner(System.in);   
double dis=20,amount,num1,num2,num3,s,markedprice,temp,result,small;
System.out.println("Enter markedprice" );
num1=sc.nextDouble();
num2=sc.nextDouble();
num3=sc.nextDouble();
markedprice=num1+num2+num3;
System.out.println("Total amount="+markedprice);
s=100-dis;
amount=(s*markedprice)/100;
System.out.println("Offer 1="+amount);
temp=num1<num2?num1:num2;
small=num3<temp?num3:temp;
result=markedprice-small;
System.out.println("Offer 2="+amount);
if(amount<result)
{
System.out.println("use offer1");
}
else
{
System.out.println("use offer2");
}
}
}

