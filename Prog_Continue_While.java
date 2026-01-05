package day1;

public class Prog_Continue_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		
		int num =0;
		while(num<=9)
		{
			num++;
			if(num==5)
				continue;
			System.out.println(num+ " ");
		}
		System.out.println("\nBye");
}
}

