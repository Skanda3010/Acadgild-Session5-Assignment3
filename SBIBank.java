
public class SBIBank extends Bank{
	
	//Overriding the rate of Interest method for SBI Bank
	
	@Override
	public void getRateOfInterest(int rateOfInterest) {
		// TODO Auto-generated method stub
		System.out.println("This is SBI Bank");
		super.getRateOfInterest(rateOfInterest);
		
	}

}
