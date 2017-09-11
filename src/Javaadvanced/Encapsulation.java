package Javaadvanced;

public class Encapsulation {
			
		private void add(int x,int y)
		{
			int z = x + y;
			System.out.println("Addition" +z);
		}
		private void sub(int x,int y)
		{
			int z = x - y;
			System.out.println("Subraction" +z);
		}
		protected int mult(int x,int y)
		{
			int z = x * y;
			return z;
		}
		public int div(int x,int y)
		{
			int z = x/y;
			return z;
		}
		public static void main(String[] args)
		{
			Encapsulation obj=new Encapsulation();
			obj.add(20, 10);
			obj.sub(30, 10);
			
		}
}
