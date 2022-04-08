package Week3.day1;

//Assignment:3 override the method deposit in AxisBank

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("AxisBank deposit amount displayed");
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		
	}
}
