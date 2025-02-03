class OverLoad
{   
int a;
int b;
    //creating constructor 
 /*  Overload(int a,int b)
      {
         this.a=a;
         this.b=b;  

      }*/

     double myMethod(int a)
        {
              return a+2;
        }

}
class overLoadDemo
{
    public static void main(String and[])
      {
           OverLoad object = new OverLoad();
         int a=88;
           System.out.println(object.myMethod(a));                               
           
      }

}

