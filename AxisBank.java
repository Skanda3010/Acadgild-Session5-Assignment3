
public class AxisBank extends Bank{
	
	//Overriding the rate of Interest method for Axis Bank
	
	@Override
	public void getRateOfInterest(int rateOfInterest) {
		// TODO Auto-generated method stub
		System.out.println("This is Axis Bank.");
		super.getRateOfInterest(rateOfInterest);
	}

}
