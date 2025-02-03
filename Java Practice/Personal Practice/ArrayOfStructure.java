import java.util.*;
class Mangi
{
 
     int familymembers;
    
       void Mangi(int n)
       {
           
          familymembers=n;
            

       }
   
     
}

//Main method and main class 
class ArrayOfStructure
{


   public static void main(String[] args)
         {
            Scanner scan = new Scanner(System.in);
        Mangi danish[] = new Mangi[3];
   for (int i=0;i<3;i++)
       {
            

              System.out.println("Enter family menber ");
              int n= danish[i].familymembers = scan.nextInt();
           danish[i].Mangi(n);
           
       }


          
         }   
 }