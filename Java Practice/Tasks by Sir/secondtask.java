import java.util.*;

class secondtask
{
   public static void main(String and[])
	{
          Scanner  scan = new Scanner(System.in);
             
             int array[] = new int[6];
           
             System.out.println("enter the numbers to store in array");
int number=0;
           for (int i=0;i<array.length;i++)
                {
                      array[i]=scan.nextInt();
                        

                }
     System.out.println("enter a number for search ");
         int numberfromuser = scan.nextInt();
           for (int i=0;i<array.length;i++)
                {
                     if(array[i]==numberfromuser)
                         {
                            System.out.println("number is present and index is " +i );
                            break;
                         } 
                     else 
                     {number++;}

                }
            if(number==6)

                            System.out.println("not present");
	}

}