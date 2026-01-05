package JAN_26;

public class PrimeNumber {
	
	static void isPrime(int num) 
	{
		if(num ==1)
			System.out.println("Neither prime nor composite");
		else if(num==2)
		    System.out.println("prime");
		else if(num%2==0)
			System.out.println("Not a prime");
		else{
			//odd number to check the number is prime	
			boolean flag = true;
			for(int fact =3; fact <num; fact=fact+2)
			{
				if(num%fact==0)
				{
					flag = false;
					System.out.println("Not a prime");
					break;
				}
			}
		
		if(flag ==true)
		{
			System.out.println("Its a prime");
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      isPrime(24);

	}

}
