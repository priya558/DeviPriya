package Javaadvanced;

public class staticadd {
	public static int add(int x,int y)
	{
		int z = x + y;
		return z;
	}
	public static class classD{
		public static void main(String[] args)
		{
			System.out.println(staticadd.add(20, 30));
		}
	}
	

}
