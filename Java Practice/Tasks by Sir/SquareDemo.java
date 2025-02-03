class Square
{
     int myMethod(int a)
       {
           return a*a;
       }

}


class SquareDemo
{
    public static void main(String asn[])
      {
          Square object = new Square();
           int b=object.myMethod(5); 
          System.out.println(object.myMethod(5));
          System.out.println(b);
      }

}