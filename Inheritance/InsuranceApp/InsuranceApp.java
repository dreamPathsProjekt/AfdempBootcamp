/**
 *
 * @author dreamPathsProjekt
 */

import java.util.Scanner;

public class InsuranceApp {

	public static void main(String[] args) {
		String input="N/A";
		int custid;
		int insid;
		
		
		
		//For testing
		Customer cust1 = new Customer("giannis",1983,"male");
		Customer cust2 = new Customer("nikos",1990,"male");
		Customer cust3 = new Customer("maria",1976,"female");
		//Insurance ins1 = new Insurance(1280,cust1);
		Life life1 = new Life(10,cust2,50);
		Life life2 = new Life(5,cust2,10);
		Health health1 = new Health(10,cust1,100);
		Health health2 = new Health(20,cust3,200);
		//end test
		 
		 
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		while(!input.equals("0")){
			
			System.out.println("***** Menu *****");
			System.out.println("1. Print all Insurances");
			System.out.println("2. Search insurances by customer code");
			System.out.println("3. Search insurances by insurance code");
			System.out.println("--------------------------------------");
			System.out.println("0.Exit");
			
			input=scanner1.nextLine();
			switch(input){
			case "1":
				Insurance.printEmAll();
				break;
			case "2":
				System.out.println("Please enter customer code (id)");
				custid=scanner2.nextInt();
				Insurance.printInsuranceByCustomerId(custid);
				break;
			case "3":
				System.out.println("Please enter insurance code (id)");
				insid=scanner2.nextInt();
				if(Insurance.getInsuranceById(insid)!=null){
					Insurance.printInsuranceById(insid); 
				}
				else System.out.println("The insurance code: "+insid+" is not valid.\nPlease enter new insurance code (id)");
				break;
			case "0":
				System.out.println("Thanks for using Insurance App.");
				break;
			default:
				System.out.println("Not a valid option.Please type again.");	
			}
			
		}

	}

}
