import java.util.*;
class capital
{
      public static void main(String n[])
	{
     Scanner scan = new Scanner(System.in);
             char[] array=new char[10];
            for(int i=0;i<10;i++)
                 {
                      array[i] = scan.next().charAt(0);

                 }
 
     int b=0;
Arrays.sort(array);
            for(int ch: array)
                 {
                    System.out.println((char)ch);
                 }
           
	}

}