package JAN_26;

public class GCD_LCM_COPRIME {
	
	int gcd =1;
	int smaller = 0;
	
	if(num1<num2)
		smaller = num1;
	else
		smaller = num2;
	for(jnt i = 1; i<smaller; i++)
	{
		if(num1%==0 && num2%==0)
			gcd=i;
		
	}
	return gcd;
	static int lcm(int num1 ,int num2)
	{
		return (num1*num2)/gcd(num1,num2));
		
	}
	
	static void coPrime(int num1, int num2)
	{
		
		if(gcd(num1 ,num2) ==1)
			System.out.println("CO PRIME");
		else
			System.out.println("NOT A CO PRIME");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =12;
		int num2 = 24;
		System.out.println("GCD " +gcd(num1,num2));
		System.out.println("LCM " +lcm(num1,num2));
		coPrime(num1,num2);
		
		

	}

}
}
