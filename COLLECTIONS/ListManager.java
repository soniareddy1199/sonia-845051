import java.util.ArrayList;
public class ListManager {
	public static ArrayList<String> removeElements(ArrayList<String> a1,ArrayList<String> a2)
	{
		a1.removeAll(a2);
		return a1;
	}
	public static void main(String...args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		a1.add("sonia");
		a1.add("kavya");
		a1.add("deepthi");
		a1.add("pavi");
		a2.add("kavya");
		a2.add("deepthi");
		a2.add("pavi");
		System.out.println(removeElements(a1,a2));
		
	}

}
