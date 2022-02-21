import java.nio.file.Files;

public class ThankSharatForHisKindness {
	
	public static void main(String[] args) {
		
		StringBuffer myLaptopMsg = new StringBuffer();
		myLaptopMsg.append("Thank you for your kindness Sharat. \n");
		myLaptopMsg.append("Can't wait for the upgrade! \n");
		myLaptopMsg.append("If you have something to wear I'll be grateful to you. \n");
		myLaptopMsg.append("Have a good week.");
		System.console().writer().println(myLaptopMsg);
			
	}
}
