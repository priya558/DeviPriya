package Javaadvanced;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int x,y,z;
			x = 10;
			y = 0;
			z = x/y;
			System.out.println("output is" +z);
		}
		catch(Exception e)
		{
			System.out.println("cannot divide by zero,please try again..");
			//e.printStackTrace();
			
		}
		

	}

}
