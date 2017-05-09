/**
 *
 * @author dreamPathsProjekt
 */
public class Life extends Insurance {
	private static int countLife=0; //for array use only
	private final int lifeId; //for array use only
	private static Life [] lifeArray=new Life [10];
	private int amountInvest;
	
	public Life(int duration,Customer customer,int amountInvest){
		super(duration,customer);
		this.amountInvest=amountInvest;
		countLife++;
		this.lifeId=countLife;
		
		Life.lifeArray[this.lifeId]=this; //separate array -- insurance array gets updated by super() constructor
	}
	
	@Override
	public int getInsuranceId(){
		return super.getInsuranceId();
	}
	@Override
	public int getDuration(){
		return super.getDuration();
	}
	
	@Override
	public void setDuration(int duration){
		super.setDuration(duration);	
	}

	@Override
	public Customer getCustomer(){
		return super.getCustomer();
	}

	@Override
	public void setCustomer(Customer customer){
		super.setCustomer(customer);
	}
	
	@Override
	public String toString(){
		return super.toString()+" | "+"type=Life"+" | "+"amount to invest="+this.amountInvest+" | "+"cost="+this.calculateCost();
	}
	
	@Override
	public double calculateCost(){
		double cost=super.calculateCost()+(5*super.getDuration()+(5.0/100*amountInvest));
		return cost;
	}
	
}
