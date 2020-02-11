import java.util.Scanner;
public class Alice{
    public static void main(String args[])
    {  int first_no=0,second_no=0,final_no=0;
        Scanner input = new Scanner(System.in);
        System.out.println("the bird said : ");
        
        int message_digit=input.nextInt();
        first_no=message_digit%10;
        second_no=message_digit/10;
        final_no=first_no+second_no;
        
        System.out.println("Pattrick and Johnny must go in path - "+final_no +" to find alice");
    }
    
}
