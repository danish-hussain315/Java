class CallByValue
{   int a
      
     void myMethod(int i,int j)
         {     
             a*=10;
             b*=10;
            
         } 
}

class CallByValueDemo
{
    public static void main(String and[])
     {
          CallByValue object = new CallByValue();
          int a=15;
          int b=20;
          System.out.println("before "+a+" " + b);
     object.myMethod(a,b);

          System.out.println("after "+a+" " + b);
    }
}