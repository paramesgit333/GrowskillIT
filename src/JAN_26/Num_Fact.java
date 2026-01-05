package JAN_26;

public class Num_Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12;
		for(int fact =1; fact <=num;fact++)
		{
			if(num % fact ==0)
				System.out.println(fact+" ");
		}
	}

}
