import java.util.*;
class FromMethod
{
        int number=0;
         Scanner inputfromuser = new Scanner(System.in);
   
   void display(int number)
      {
      
         String[] name = new String[number];
          for(int i=1;i<number;i++)
		{
                  System.out.println(name[i]);  
		}   
          
      }
    void init( int number)
	{
         String[] name = new String[number];
          for(int i=1;i<number;i++)
		{
                 System.out.println("enter any string "); 
                  name[i] = inputfromuser.nextLine();  
		}    
	}

}