package program_array;

public class Largest_Array {

	static int largest(int [] arr)
	{
		int maximum =arr[0];
		for(int i =0;i< arr.length; i++)
		
			if(arr[i] > maximum)
				maximum= arr[i];
			
			return maximum;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1012,20,30,40,503};
		System.out.println(largest(arr));

	}

}
