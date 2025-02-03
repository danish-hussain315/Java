import java.util.Scanner;
class givenumberandgetsumofthosedigits
   {
         public static void main(String f[])
          {
               Scanner number =new Scanner(System.in);
              System.out.print ("enter any four digit number ");
                int bignumber=number.nextInt();     
               int small1=bignumber/1000%10; //for thousand 
               int small2=bignumber/100%10; //for hundreds
               int small3=bignumber/10%10;  //for tens
               int small4=bignumber/1%10;    //for units
			System.out.print(small1+" "+small2+" "+small3+" "+small4);
          }

   }