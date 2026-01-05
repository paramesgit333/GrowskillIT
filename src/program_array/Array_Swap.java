package program_array;

public class Array_Swap {
	
	static void swap(int arr[])
	{
		int first = arr[0];
		int last = arr[arr.length-1];
		int temp = last;
		last = first;
		first = temp;
		arr[0] = first;
		arr[arr.length-1] = last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {100,200,300,400,500};
		swap(arr);
		for(int i=0; i<arr.length-1;i++)
			System.out.println(arr[i]+ " ");

	}

}
