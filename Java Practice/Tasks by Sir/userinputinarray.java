import java.util.Scanner;
class userinputinarray
{
      public static void main(String name[])
       {
                 Scanner number=new Scanner(System.in);
           int array[]=new int[5];
            for(int i=0;i<array.length;i++)
                {
                    int numberfromuser=number.nextInt();
                    array[i]=numberfromuser;
                }
            for(int i=0;i<array.length;i++)
                {
                    System.out.print(array[i]+" ");
                }

       }



}