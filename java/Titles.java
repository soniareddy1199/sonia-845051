import java.util.Scanner;

public class Titles {
    public static void main(String args[])
    {
        int tile_lenght=8,tile_width=8;
        
        int required_tites,pieces_used;
        
        int remaining_length,remaining_width,actual_tiles,actual_width_tiles;
        
    Scanner input=new Scanner(System.in);
    System.out.println("enter the length of the room");
    int length=input.nextInt();
    System.out.println("enter the width of the room");
        int width=input.nextInt();
        
        if((length%  tile_lenght != 0)&&(width%tile_width != 0)){
            
            remaining_length=length % tile_lenght;
            actual_tiles=(length-remaining_length)/tile_lenght;
            
            remaining_width=width%tile_width;
            actual_width_tiles=(width-remaining_width)/tile_width;
            
            required_tites=actual_tiles*actual_width_tiles;
            
            pieces_used=actual_tiles+actual_width_tiles;
            
            
          
            
            
        }
        else if(((length% tile_lenght == 0)&&(width%tile_width == 0)))
        {
            remaining_length=length% tile_lenght;
            actual_tiles=(length-remaining_length)/tile_lenght;
            
            remaining_width=width%tile_width;
            actual_width_tiles=(width-remaining_width)/tile_width;
            
            required_tites=actual_tiles*actual_width_tiles;
            
            pieces_used=0;
             
        }
        else
        {
            
           remaining_length=length% tile_lenght;
            actual_tiles=(length-remaining_length)/tile_lenght;
            
            remaining_width=width%tile_width;
            actual_width_tiles=(width-remaining_width)/tile_width;
            
            required_tites=actual_tiles*actual_width_tiles;
            
            
           if(remaining_length==0){
             pieces_used=actual_tiles;
            }
            else 
            {
               pieces_used=actual_width_tiles;
            }
              
           
            
        }        
        
        System.out.println("the no of required tiles : "+ required_tites);
       System.out.println("the no of pieces required : "+ pieces_used);
    }
    
}
