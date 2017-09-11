package javaexamples;

public class ContentEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sunday";
		String str2 = "Sunday";
		if(str1.contentEquals(str2))
		{
			System.out.println("Both are equal");
			
		}
		else
		{
			System.out.println("Not equal");
		}
	}

}
