import java.util.*;
class EvenSum
{
     public static void main(String and[])
	{
  int sum=0;
	     Scanner scan = new Scanner(System.in);
       int number=scan.nextInt();
     
        sum=sum+number;
         while(number%2==0)
            {  
                number = scan.nextInt();
                 sum=sum+number;
                       
            }

      System.out.println("sum of all given numbers "+sum);
       }

}