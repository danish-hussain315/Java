class Animal
{
     String name ;
     int  age ;
     double height ;

//creating constuctor no argument 
      Animal()
    {
        name ="kaswa ";
        age =35;
        height = 7.5;
    }   
// creating parameter contructor
      Animal(String n, int a, double h )
    {
         name =n;
         age =a ;
         height =h;
    }
// method 
  void methodforprinting()
	{
             
           System.out.println("Name is "+name);
           System.out.println("Age is  "+ age);
           System.out.println("Height is "+height);
	}


//passing parameter through method
    void passingargument(String n, int a, double h)
	{
               name =n;
               age =a ;
               height =h;
             
           System.out.println("Name is "+name);
           System.out.println("Age is  "+ age);
           System.out.println("Height is "+height);
	}


}


// main method
class AnimalDemo
{
    public static void main(String and[])
        {
              Animal camel = new Animal("dansih ",22 , 35.5);
               
              camel.methodforprinting();
              camel.passingargument("musawer",23,35.5);
              
	}

}