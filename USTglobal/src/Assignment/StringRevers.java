package Assignment;

public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "zxyabc";
		

		char arr[] = str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}


	}
}
