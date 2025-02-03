class My{
	My(String name1){
	System.out.println(name1); 

}
	int age = 0;
	String name = "";
	int weight = 0;
	void Display(int ...arr){
	//System.out.println("Name=" + name + " Wieght = " + weight + " Age = " +age); 
	for (int element:arr)
	System.out.println(element); 

	}
}