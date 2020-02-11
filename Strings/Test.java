public class Test 
{ 
    public static void main(String[] args) 
    { 
        Object obj = new int(); 
        Class c = obj.getClass(); 
        System.out.println("Class of Object obj is : "
                           + c.getName()); 
    } 
} 