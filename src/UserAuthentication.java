import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserAuthentication {
	
	public static void main(String args[]) throws IOException
	    {
		 
		 	MainMenu();
		 
	    }
	 
	private static void MainMenu() throws IOException {
		
		Scanner choice = new Scanner(System.in);
	 	CustomerAuth Employee = new CustomerAuth(); 
	 	
	 	System.out.println("\t\t Welcome to Micro-Star CableVision.\n");
	 	System.out.println("Please Specify whether you are a:");
	 	System.out.println("Enter choices : \"1\", \"2\" or \"3\"\n\n");
	 	
	 	System.out.println("1. Customer.");
	 	System.out.println("2. Representative.");
	 	System.out.println("3. Tecnician.\n");

	 	System.out.println("Choice here:");
	 	
		int ans = choice.nextInt();

		try {
			if (ans == 1) {
				try {
					CustomerMenu();
				} catch (IOException e) {
					System.out.println("\nError in accepting choice.");
				}
			}else if(ans == 2){
				RepresentativeMenu();
			}else {
				TechnicianMenu();
			}
		}catch (InputMismatchException e) {
			System.out.println("\nPlease input a valid choice:");
			MainMenu();
		}
		
	}
	 
	public static void CustomerMenu() throws IOException {
		  
		  CustomerAuth customer = new CustomerAuth();
		    char ans;
		    
		    while(true) {
		    		
			    
		    		
			        if(CustomerInput().equals(customer.username) && CustomerInput().equals(customer.password))
			        {
			            System.out.println("Authentication Successful");
			        }
			        else
			        {
			        	
			            System.out.println("\t\tWrong Password or Username. \n\tWould you like to go again [Y/N].");
			            
			            ans = ' ';
						while(ans == 'y' && ans == 'Y') {
							CustomerMenu();
							}
						System.out.println(" ");
						if(ans == 'n' || ans == 'N') {
							MainMenu();
							//break;
						}	
					}
		    }
		    


	}//end of Customer Menu 
	private static Object CustomerInput(String u, String p) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String CustomerInput() {
		System.out.println("\t Micro-Star CableVision thank you so much for your continued serivces.\n ");
	    System.out.println("As our valued customer please specify how we can serve you best.");
	    String UName, Pass;
	 	Scanner s = new Scanner(System.in);
        System.out.print("Please enter Username:");
        UName = s.nextLine();
        System.out.print("Please enter password:");
        Pass = s.nextLine();
		
        return Pass + UName;
        
	}

	private static void RepresentativeMenu() {
			System.out.println("");
				
	  }//end of Representative 

	private static void TechnicianMenu() {
			
			
	}//end of Technician menus
}


