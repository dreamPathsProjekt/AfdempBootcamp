
public class Health extends Insurance{
	//private static int countHealth=0; //for array use only
	//private final int healthId; //for array use only
	//private static Health [] healthArray=new Health[10];
	private int medicalExpense;
	
	public Health(int duration,Customer customer,int medicalExpense){
		super(duration,customer);
		this.medicalExpense=medicalExpense;
		//countHealth++;
		//this.healthId=countHealth;
		
		//Health.healthArray[this.healthId]=this; //separate array -- insurance array gets updated by super() constructor
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
		return super.toString()+" | "+"type=Health"+" | "+"medical Expense="+this.medicalExpense+" | "+"cost="+this.calculateCost();
	}
	
	
	public int getMedicalExpense() {
		return medicalExpense;
	}

	public void setMedicalExpense(int medicalExpense) {
		this.medicalExpense = medicalExpense;
	}

	public double calculateCost(){
		double cost;
		if(super.getCustomer().getSex().equals("male")){
			cost=80+(7*super.getDuration()+(0.025*medicalExpense)+50);
		}
		else {
			cost=80+(7*super.getDuration()+(0.025*medicalExpense));
		}
		return cost;
	}
}
