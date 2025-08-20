class Demo6 
{
	public static void main(String[] args) 
	{
		
		byte x =10;
		byte y = 20;
		
		
		System.out.println("before swapping"+x);
		System.out.println("before swapping"+y);
	  // before 
		byte temp = x;
		x=y;
		y=temp;
	
			
		
		System.out.println("after swapping:- "+x);
		System.out.println("after  swapping :-"+y);
	}
}
