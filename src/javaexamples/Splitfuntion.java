package javaexamples;

public class Splitfuntion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Testing Masters Technologies";
		String[] arr = str.split(" ");
		System.out.println(arr.length);
		for(String a:arr)
		{
			System.out.println(a);
		}
		
	}

}
