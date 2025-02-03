import java.util.Scanner;
class comparetwostring
{
    public static void main(String args[])
     {
           Scanner danish=new Scanner(System.in);

           String name=danish.nextLine();
           String caste=danish.nextLine();
          //it will check for the object is same or not  
          System.out.println(name==caste);
   //it will check that containt is same or not 
            System.out.println(name.equals(caste));
     }

}