import java.util.*;
class Danish
{
    String name=null;
   double age= 0;
      int height=0;
   void display()
     {
          System.out.print("name = "+name+"\nheight = "+height+"\nage = "+age);
     }
  
     //creating methos for recieve data    
   void input(String naam,double umar,int lambai)
     {
          name=naam;
          age=umar;
          height = lambai;
     }
   void inputfromuser()            //input from user 
	{
             Scanner scan = new Scanner(System.in);
             System.out.println("Enter your name ");   
                name=scan.nextLine();
             System.out.println("Enter your age "); 
                age = scan.nextDouble();
             System.out.println("Enter your height "); 
                height=scan.nextInt();
                
	}
}