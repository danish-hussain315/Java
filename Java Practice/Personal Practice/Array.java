import java.util.*;

class  Array
{
   public static void main(String na[])
     {
         Scanner inputfromuser = new Scanner(System.in);
          System.out.println("enter no of elements ");
            int number=inputfromuser.nextInt();
           FromMethod jano=new FromMethod();

         jano.init(number);
         jano.display(number);
            
     }
}