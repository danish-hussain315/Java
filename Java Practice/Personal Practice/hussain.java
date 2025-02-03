import java.util.*;
class hussain
{
    public static void main(String and[])
        {
             Scanner scan = new Scanner(System.in);
              Danish data1 =new Danish();
                  /* data1.name = "danish ";
                   data1.height=12;
                   data1.age=45;*/
          // System.out.print("name = "+data1.name+"\nheight = "+data1.height+"\nage = "+data1.age);
                  




                 //  data1.input("hassan",45,58);         by pasing arguments
                 //  data1.display();                   display of data
     


                    //taking input through method from user calling method to print data
                    data1.inputfromuser();
                    data1.display();


                 //for the second persons data
            Danish data2 =new Danish();
                /*   data2.name = "danish ";
                   data2.height=12;
                   data2.age=45;*/
                   
                  


              //  data2.input("hasnain",55,48);      by passing arguments
               //data2.display();                      display of data


            //taking input  therough method from user and call method from Danish 
                 data2.inputfromuser();
                 data2.display();
               

        }
}