class Recursion
{
     
    public static int factorial(int a )
        {     int result;
              if(a==0)
                   return 1;
             else 
		{
		  result = factorial(a-1)*a;
                     return result;    
		}
        }

}


class RecursionDemo
{
    public static void main(String and[])
	{
          Recursion object =new Recursion();
             int fact=0;
              object.factorial(fact);
                 System.out.println(object.factorial(fact));
	}

}