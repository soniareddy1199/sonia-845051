import java.util.ArrayList; 
  
public class Merge{ 
  
    public static void main(String[] args) 
    { 
int sum;
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1"); 
        list1.add("2"); 
        list1.add("3"); 
        list1.add("4"); 
  	System.out.println("List1: "+ list1); 
 	ArrayList<String> list2 = new ArrayList<String>();
        list2.add("3"); 
        list2.add("4"); 
        list2.add("5"); 
	list2.add("6"); 
        System.out.println("List2: " + list2); 
        list1.retainAll(list2); 
        System.out.println("Common elements: "+ list1); 
	sum=list1+list1;
 	System.out.println("sum"+sum); 
    } 
} 