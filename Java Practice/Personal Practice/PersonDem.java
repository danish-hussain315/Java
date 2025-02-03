class Raja
{
        String name=null;
        int age =0;
        int height =0;
  void display(String name,int age,int height)
      {
          System.out.println("name "+name+" age "+age+" height "+height);
      } 
   void init()
     {
       System.out.println("name "+name+" age "+age+" height "+height);

     }



}









class PersonDem
{
   public static void main(String and[])
	{
              Raja faraz = new Raja();
              faraz.name="raja";
              faraz.age=45;
               faraz.height=34;
              faraz.display("danish",23,45);
  System.out.println("name "+faraz.name+" age "+faraz.age+" height "+faraz.height);

	}

}