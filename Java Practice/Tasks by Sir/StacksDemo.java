class Stacks
{
   int array[] = new int[10];
   int tos=-1;
   // init of top of staks 
  /* Stacks()
    {
       tos=-1;
    }*/
   void input(int item)				//inputing stacks
        {
           if(tos==9)
              System.out.println("Stack is filled ");
           else 
              array[++tos] =item;

        }
   int output()                   //outputing from stacks 
     {
         if(tos<0)
           { 
               System.out.println("Stack is under flow");
                return 0;
           }
         else 
             return array[tos--];

     }

}

class StacksDemo
{
     public static void main(String man[])
          {
              Stacks object = new Stacks();
              
           
               for(int i=0;i<10;i++)
                    object.input(i);
              for(int i=0;i<10;i++)
                    System.out.println( object.output());

          } 
}