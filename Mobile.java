package week1.day1;

public class Mobile {
	
	String mobilemodel = "OPPO";
	int mobileweight = 2;
	boolean mobile1stcharge = true;
	double mobileprice = 20000.999;
	
	
	
	
	public void makeCall() {
		System.out.println("Call Vicky");
		
	

	}
	private void sendSms() {
		System.out.println("send sms to vicky");

	}
	
	public static void main(String[] args) {
		
		Mobile Mob = new Mobile ();
		System.out.println(Mob.mobilemodel);
		System.out.println(Mob.mobileweight);
		System.out.println(Mob.mobileprice);
		System.out.println(Mob.mobile1stcharge);
		
		Mob.makeCall();
		Mob.sendSms();
		
		
	}
		
	

		
}
