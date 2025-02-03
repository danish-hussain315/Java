class Confuse 
{
   int a;
   double b;
   void clue(double a,int b)
       {System.out.print("Method 1");}
   void clue(int b,double a)
        {System.out.print("Method 2");}


}
class confuseDemo
    {
  

   public static void main(String and[])
         {
             Confuse number =new Confuse();
             number.clue(22,55);
         }
    }