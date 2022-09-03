package Week1.day1;
public class Mobile {
	
	public void sendSms(){
	
	System.out.println("Send an sms to a friend");
	}
	public void takeSnapshot(){
		System.out.println("Take a snapshot of the image");
	}
	public static void main(String[] args) {
		System.out.println();
		Mobile obj = new Mobile();
		obj.sendSms();
		obj.takeSnapshot();	
	}
}
