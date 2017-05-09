
public abstract class Insurance {
	private static int countInsurances=0;
	private static Insurance [] insuranceArray=new Insurance [10];
	private final int  insuranceId;
	
	private int duration;
	private Customer customer;
	
	public Insurance(int duration,Customer customer){
		//auto-increment id
		countInsurances++;
		this.insuranceId=countInsurances;
		
		this.duration=duration;
		this.customer=customer;

		//store instance in array of Insurances
		Insurance.insuranceArray[this.insuranceId]=this;
	}
	
	public static Insurance getInsuranceById(int id){
		if(id>=1&&id<Insurance.insuranceArray.length){
			if(insuranceArray[id]!=null){
				return insuranceArray[id];
			}
			return null;
		}
		return null;
	}
	
	public static Insurance getInsuranceByCustomerId(int id){
		boolean hasInsurance=false;
		if(id>=1&&id<Customer.customerArray.length&&Customer.customerArray[id] instanceof Customer){
			
			for(int i=1;i<countInsurances;i++){
				if(insuranceArray[i].getCustomer().getCustomerId()==id){
					hasInsurance=true;
					return (insuranceArray[i]);
					
				}
				
			}
			if(!hasInsurance) {
				System.out.println("The customer with code: "+id+" doesn't have an insurance plan.");
				return null;
			}
		}
		else System.out.println("The customer code: "+id+" is not valid.\nPlease enter new customer code (id)");
		return null;
	}
	
	public static void printInsuranceByCustomerId(int id){
		boolean hasInsurance=false;
		if(id>=1&&id<Customer.customerArray.length&&Customer.customerArray[id]!=null){
			
				for(int i=1;i<countInsurances;i++){
					if(insuranceArray[i].getCustomer().getCustomerId()==id){
						System.out.println(insuranceArray[i].toString());
						hasInsurance=true;
						
					}
					
				}
				if(!hasInsurance) System.out.println("The customer with code: "+id+" doesn't have an insurance plan.");
		}
		else System.out.println("The customer code: "+id+" is not valid.\nPlease enter new customer code (id)");
		
	}
	
	public int getInsuranceId(){
		return this.insuranceId;
	}

	public int getDuration(){
		return this.duration;
	}

	public void setDuration(int duration){
		this.duration=duration;		
	}
	
	public Customer getCustomer(){
		return this.customer;
	}
	
	public void setCustomer(Customer customer){
		this.customer=customer;
	}
	
	@Override
	public String toString(){
		return("id="+insuranceId+" | "+"customer="+customer.toString()+" | "+"duration="+duration+" yrs");
	}
	
	public abstract double calculateCost();

	
	public static void printEmAll(){
		for(int i=1;i<=countInsurances;i++){
			System.out.println(insuranceArray[i].toString());
		}
	}
	
	public static void printInsuranceById(int id){
		System.out.println(insuranceArray[id].toString());
	}
	
	
}
