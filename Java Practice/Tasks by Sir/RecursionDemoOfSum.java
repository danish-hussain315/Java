class RecursionSum
{  
    int sum;
    int sumMachine(int a)
       {
           
           if(a==0)
               return 0;
           else
              sum = a+sumMachine(a=a-1); 
                return sum;
       }
}

class RecursionDemoOfSum
{     
     public static void main(String and[])
      {
    int num=5;
     RecursionSum object = new RecursionSum();
         System.out.println(object.sumMachine(num));
     }
}