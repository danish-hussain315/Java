import java.util.Scanner;
class trianglestars
{
        public static void main(String and[])
	    {  
                   Scanner number=new Scanner(System.in);
                  int n=number.nextInt();

                for (int i=0;i<n;i++)
		   {
              		  for (int j=0;j<i;j++)
			     {
                                   System.out.print(" "+"*");
          	      	     }
                               System.out.println();
          	   }


	    }


}