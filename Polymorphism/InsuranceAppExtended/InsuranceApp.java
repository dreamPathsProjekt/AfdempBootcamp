import java.util.Scanner;


public class InsuranceApp {

	public static void main(String[] args) {
		String input="N/A";
		int insideInput;
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
		Scanner scanner3 = new Scanner(System.in);
		
		while(!input.equals("0")){
			
			System.out.println("***** Menu *****");
			System.out.println("1. Print all Insurances");
			System.out.println("2. Search insurances by customer code");
			System.out.println("3. Search insurances by insurance code");
			System.out.println("4. Create Insurance");			
			System.out.println("--------------------------------------");
			System.out.println("0. Exit");
			
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
			case "4":
				insideInput=Integer.parseInt("-1"); //If you exit sub-menu insideInput !remains==0 for next turn.
				while(insideInput!=0){
				System.out.println("*****Create Insurance*****");
				System.out.println("1. Create Life insurance for a customer code (id)");
				System.out.println("2. Create Life insurance for a new customer");
				System.out.println("3. Create Health insurance for a customer code (id)");
				System.out.println("4. Create Health insurance for a new customer");				
				System.out.println("--------------------------------------------");
				System.out.println("0. Go Back to main menu");
				
				insideInput=Integer.parseInt(scanner3.nextLine());	
					switch(insideInput){
					case 1:
						System.out.println("Please enter customer code (id)");
						custid=Integer.parseInt(scanner3.nextLine());
						if(Insurance.getInsuranceByCustomerId(custid) instanceof Insurance||Customer.customerArray[custid] instanceof Customer){
							try{
							System.out.println("The Customer :");							
							System.out.println(Insurance.getInsuranceByCustomerId(custid).getCustomer().toString());
							System.out.println("Already has insurance: ");
							Insurance.printInsuranceByCustomerId(custid);
							System.out.println("Create new Life insurance? (Y)/(N)");
							}
							catch(NullPointerException nPExc){
								System.out.println(Customer.customerArray[custid].toString());
								System.out.println("Create new Life insurance? (Y)/(N)");
							}
							String inputYN=scanner3.nextLine(); //use next-line to avoid invalid line break on nextInt.
							switch(inputYN.toLowerCase()){
							case "y":
								int inputDuration;								
								System.out.println("Enter duration of contract in years: (numbers only)");
								inputDuration=Integer.parseInt(scanner3.nextLine());
								
								
								int inputAmInv;
								System.out.println("Enter Amount to Invest in euros: (numbers only)");
								inputAmInv=Integer.parseInt(scanner3.nextLine());
								
								Life lifeCache=new Life(inputDuration,Customer.customerArray[custid],inputAmInv); 
								System.out.println("Life insurance "+ lifeCache.toString() +"saved successfully");
								break;
							case "n":
								System.out.println("Exiting...\n\n");
								break;
							default:
								System.out.println("You are retarded \n\n");
							}
						}
						break;
					case 2:
						System.out.println("Create new customer");
						System.out.println("----------------------------");

						System.out.println("Please enter customer name: ");
						String custName=scanner3.nextLine();
						
						System.out.println("Please enter Year of Birth (YYYY): ");
						int custYoB=Integer.parseInt(scanner3.nextLine());
						
						System.out.println("Please enter sex (male)/(female): ");
						String custSex=scanner3.nextLine();
						
						Customer custCache=new Customer(custName,custYoB,custSex); 
						System.out.println("Customer "+ custCache.toString() +"saved successfully");
						
						//new insurance for created customer.
						System.out.println("Create new Life insurance? (Y)/(N)");

						String inputYN=scanner3.nextLine(); //use next-line to avoid invalid line break on nextInt.
						switch(inputYN.toLowerCase()){
						case "y":
							int inputDuration;								
							System.out.println("Enter duration of contract in years: (numbers only)");
							inputDuration=Integer.parseInt(scanner3.nextLine());
							
							
							int inputAmInv;
							System.out.println("Enter Amount to Invest in euros: (numbers only)");
							inputAmInv=Integer.parseInt(scanner3.nextLine());
							
							Life lifeCache=new Life(inputDuration,custCache,inputAmInv); 
							System.out.println("Life insurance "+ lifeCache.toString() +"saved successfully");
							break;
						case "n":
							System.out.println("Exiting...\n\n");
							break;
						default:
							System.out.println("You are retarded \n\n");
						
						}
						break;
					case 3:
						System.out.println("Please enter customer code (id)");
						custid=Integer.parseInt(scanner3.nextLine());
						if(Insurance.getInsuranceByCustomerId(custid) instanceof Insurance||Customer.customerArray[custid] instanceof Customer){
							try{
							System.out.println("The Customer :");
							System.out.println(Insurance.getInsuranceByCustomerId(custid).getCustomer().toString());
							System.out.println("Already has insurance: ");
							Insurance.printInsuranceByCustomerId(custid);
							System.out.println("Create new Health insurance? (Y)/(N)");
							}
							catch(NullPointerException nPExc){
								System.out.println(Customer.customerArray[custid].toString());
								System.out.println("Create new Health insurance? (Y)/(N)");
							}
							inputYN=scanner3.nextLine();
							switch(inputYN.toLowerCase()){
							case "y":
								int inputDuration;								
								System.out.println("Enter duration of contract in years: (numbers only)");
								inputDuration=Integer.parseInt(scanner3.nextLine());
								
								
								int inputAmInv;
								System.out.println("Enter medical Expense in euros: (numbers only)");
								inputAmInv=Integer.parseInt(scanner3.nextLine());
								
								Health healthCache=new Health(inputDuration,Customer.customerArray[custid],inputAmInv); 
								System.out.println("Health insurance "+ healthCache.toString() +" saved successfully");
								
								break;
							case "n":
								System.out.println("Exiting...\n\n");
								break;
							default:
								System.out.println("You are retarded \n\n");
							}
						}
						break;
					case 4:
						System.out.println("Create new customer");
						System.out.println("----------------------------");
						//vars named with extension 2 to avoid duplicate values in current scope.
						System.out.println("Please enter customer name: ");
						String custName2=scanner3.nextLine();
						
						System.out.println("Please enter Year of Birth (YYYY): ");
						int custYoB2=Integer.parseInt(scanner3.nextLine());
						
						System.out.println("Please enter sex (male)/(female): ");
						String custSex2=scanner3.nextLine();
						
						Customer custCache2=new Customer(custName2,custYoB2,custSex2); 
						System.out.println("Customer "+ custCache2.toString() +"saved successfully");
						
						//new insurance for created customer.
						System.out.println("Create new Health insurance? (Y)/(N)");

						String inputYN2=scanner3.nextLine(); //use next-line to avoid invalid line break on nextInt.
						switch(inputYN2.toLowerCase()){
						case "y":
							int inputDuration;								
							System.out.println("Enter duration of contract in years: (numbers only)");
							inputDuration=Integer.parseInt(scanner3.nextLine());
							
							
							int inputMedExp;
							System.out.println("Enter Medical Expense in euros: (numbers only)");
							inputMedExp=Integer.parseInt(scanner3.nextLine());
							
							Health healthCache=new Health(inputDuration,custCache2,inputMedExp); 
							System.out.println("Life insurance "+ healthCache.toString() +"saved successfully");
							break;
						case "n":
							System.out.println("Exiting...\n\n");
							break;
						default:
							System.out.println("You are retarded \n\n");
						
						}
						break;						
					case 0:
						break;
					default:
						System.out.println("Not a valid option.Please type again.");
							
					}
				}
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
