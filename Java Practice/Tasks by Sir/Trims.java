import java.util.*;

class Trims
{
   public static void main(String and[])
	{
          Scanner  scan = new Scanner(System.in);
             String word = scan.next();
            
          for(int i=0;i<word.length();i++)
            {
                  if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' )
                     {
                          System.out.println(word.charAt(i));
                            
                     }
                  
            }
           
	}

}