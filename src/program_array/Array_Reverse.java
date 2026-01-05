package program_array;

public class Array_Reverse {
	
	static void reverse(int arr[])
	{
		for(int i=arr.length-1; i>=0; i--)
			System.out.println(arr[i]+ " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] = {100,200,300,400,500};
 reverse(arr);
		
	}

}
