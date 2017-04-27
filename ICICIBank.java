
public class ICICIBank extends Bank{
	
	//Overriding the rate of Interest method for ICICI Bank
	
	@Override
	public void getRateOfInterest(int rateOfInterest) {
		// TODO Auto-generated method stub
		System.out.println("This is ICICI Bank.");
		super.getRateOfInterest(rateOfInterest);
	}

}
