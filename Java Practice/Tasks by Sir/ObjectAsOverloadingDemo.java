class ObjectAsOverloading
  {  
     String color ,company;
     double price;
     ObjectAsOverloading(String color,String company,double price)
        {
             this.color=color;
             this.company=company;
             this.price=price;
        }
     void mutatorOfColor(String color)       //mutator  color
       {
            this.color=color;
       }
     void mutatorOfCompany(String company)        //mutator company
        {
            this.company=company;
       }
     void mutatorOfPrice(double price)           //mutator price
        {
             this.price=price;
       }
     String geterOfColor()
       {
              return color;
       }
     String geterOfCompany()
        {
            return company;
       }
     double geterOfPrice()
        {
            return price;
       }
      void displayCar()
          {
              System.out.println("Color "+color + " Company "+company+" Price "+price);
         }
    
 }
  class ObjectAsOverloadingDemo
     {
          public static void main(String and[])
         	{
                   ObjectAsOverloading object = new ObjectAsOverloading("white","Honda",560000); 
                   object.displayCar();
                    object.mutatorOfColor("Black");
                    object.displayCar();
                    object.displayCar(ObjectAsOverloading object);
                    
         	}

    }


