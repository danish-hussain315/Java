import java.util.Scanner;
class angstromnumber
{
      public static void main(String args[])
           {
                 Scanner numberfromuser =new Scanner(System.in);  //153     
                System.out.println("enter any number to check whether it is a angstrom number or not ");   //getting input from user
               String number=numberfromuser.nextLine();
                  int numbersize =number.length();        //length of string for count 000 of any number
                   int integer =Integer.parseInt(number);       //converting string into integer 
                     int sizesofintegeris= numbersize-1;           //struggle of loop making  10*10

                
         // System.out.println(sizesofintegeris);

                  
            
              //making thousand condition
                 int units=1;
                  for (int j=0;j<sizesofintegeris;j++) 
                       {
                               units=units*10;
                       }               
                   //System.out.println(units);     
        
        


            //loop for seperating each digit
                  int a[]=new int[numbersize];
              for (int i=0;i<numbersize;i++)
               {
                    a[i]=integer/units%10;
                     units=units/10;
               }
            





           //for checking is numbers are seperating 
         /*   for (int i=0;i<numbersize;i++)
               {
                    System.out.print(a[i]+" ");
               }
           */


        
               // for powering of the number
                  int sum=0,result=0;
                    
                        for(int i=0;i<numbersize;i++)
                             {
                                  sum=1;
                                  for(int j=0;j<numbersize;j++)
                                      {
                                           sum=sum*a[i];

                                      }
                                    
                                   result=result+sum;
                             }
                       



                        // System.out.println(result);
                       //deciding that is angstrom number or not
                  if(result==integer)
                       System.out.println("Angstrom number ");
                  else 
                        System.out.println("Not a Angstrom number ");

           }


}