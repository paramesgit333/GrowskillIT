package dec31;

public class prog_passByValue {
	static int incByFive(int num2)
	{
		int ans = num2+5;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num =10;
      int result = incByFive(num);
      System.out.println(result);
      System.out.println(num);
 
	}

}
