import java.lang.*;
class Stringbuffer
{
   public static void main(String args[])
{
   StringBuffer str=new StringBuffer("This is string buffer");
   System.out.println("String = " + str);
	 str.append(" -This is a sample program");
   System.out.println("Output:" + str);
   System.out.println();
	str.insert(22, "Object");
	System.out.println("After insertion = ");
	System.out.println(str.toString());
		str.replace(15,21, "Builder");
	System.out.println("String after replace " +str);
 		str.reverse();
       System.out.println("String after reverse  " +str);
 
}
}