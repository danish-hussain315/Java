import java.util.Scanner;
class integerintostring
{
      public static void main(String and[])
         {
                Scanner number=new Scanner(System.in);
                 int n=number.nextInt();
                  System.out.println(n+100);
                 String s=Integer.toString(n);
                 System.out.println(s+100);
         }

}