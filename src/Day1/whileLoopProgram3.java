package Day1;

public class whileLoopProgram3 {

	public static void main(String[] args) {
		
		char ch ='A';
		
		while(ch <= 'Z') 
		{
			int asci = (int) ch;
			System.out.println(ch +":" +asci);
			ch++;
		}

}
}

