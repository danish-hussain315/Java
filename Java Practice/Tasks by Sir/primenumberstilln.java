import java.util.Scanner;
class primenumberstilln
{
  public static void main(String args[])


   {
     Scanner scan=new Scanner(System.in);
   System.out.print("enter how many prime number you want to print "); 
    int n=scan.nextInt();
         int m=1;
          int l=1;
       for(int i=1;m<=n;i++)
          {

              int sum=0;  //for make sum again 0
              for(int j=1;j<=i ;j++)
                {
                  if(i%j==0)
                     {
                       sum+=1; //checking a number how many divisor are possible
                     }
                   
                }
                if(sum==2)
                   {
                      System.out.println("prime number "+l+" is "+i);
                       m++;//condition for make end of outer loop
                      l++; //for print prime number n is n
                     }

           }

    }


}