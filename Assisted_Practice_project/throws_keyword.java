package Assisted_Practice_project;

public class throws_keyword {

	void Division() throws ArithmeticException{
		int a=80,b=0,rs;
		rs=a/b;
		System.out.println("\n\tThe result is :"+rs);
	}

	public static void main(String[] args) {
		throws_keyword T = new throws_keyword();
		try {
			T.Division();
		} catch (ArithmeticException e) {
			System.out.println("\n\tError :"+e.getMessage());
		}
		System.out.println("\n\tEnd of program.");
		

	}
}
