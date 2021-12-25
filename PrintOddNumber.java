package week1.day1;

public class PrintOddNumber {
	
private void odd() {
	System.out.println("LIST OF ODD NUMBERS");
	// TODO Auto-generated method stub

}
	public static void main(String[] args) 
	{
		PrintOddNumber oddNo = new PrintOddNumber  ();
		oddNo.odd();
		
		for(int i = 1 ; i <= 100 ; i++)
		{ if (i % 2 == 1) {
			System.out.println(i);
			}
		}
	}
}

		
	


