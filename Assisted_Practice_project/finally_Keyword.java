package Assisted_Practice_project;

public class finally_Keyword {

	public static void main(String[] args) {
		
		int a=68,b=0,rs=0;
		try {
			rs=a/b;
		} catch (Exception e) {
			System.out.println("\n\tError : "+e.getMessage());
		}
		finally {
			System.out.println("\n\tThe result is :"+rs);
		}

	}
}
