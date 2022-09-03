package Week1.day1;
//Assignment 2:
public class MobileNew {
	public void makeCall() {
		String mobileModel="Iphone 12 Pro";
		float mobileWeight=6.66f;
		System.out.println("Make a call to father");
	}
	public void sendMsg() 
	{
		boolean fullCharged = true ;
		int mobileCost= 75000;
		System.out.println("Send a message to friend");
	}

	public static void main(String[] args) {
		
		MobileNew obj = new MobileNew();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my iphone");

	}

}
