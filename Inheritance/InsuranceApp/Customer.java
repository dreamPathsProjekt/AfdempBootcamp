/**
 *
 * @author dreamPathsProjekt
 */

public class Customer {
	private static int countCustomers=0;
	public static Customer [] customerArray=new Customer [10];
	private final int  customerId;
	private String name;
	private int yearOfBirth; 
	private String sex;
	
	public Customer(String name,int yearOfBirth,String sex){
		//auto-increment id
		countCustomers++;
		this.customerId=countCustomers;
		
		
		this.name=name;
		this.yearOfBirth=yearOfBirth;
		this.sex=sex;
		//store instance in array of Customers
		Customer.customerArray[this.customerId]=this;
	}
	
	public int getCustomerId(){
		return this.customerId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getYoB(){
		return this.yearOfBirth;
	}
	
	public void setYoB(int year){
		this.yearOfBirth=year;
	}
	
	public String getSex(){ //You never get sex anyway.
		return sex;
	}
	
	public void setSex(String sex){
		this.sex=sex;
	}
	
	@Override
	public String toString(){
		return("id="+customerId+" | "+"name="+name+" | "+"year of birth="+yearOfBirth+" | "+"sex="+sex);
	}
}
