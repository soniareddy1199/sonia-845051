import java.util.Scanner;
public class Kids {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the chesse board size : ");
        int board_size=input.nextInt();
        int max_bishop=board_size+(board_size-2);
        
        System.out.println("the max  no of bishop in the chess board : "+ max_bishop);
    
    }
    
}
