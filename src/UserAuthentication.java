import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class UserAuthentication {
	
	public static void main(String args[]) throws IOException
	    {
		 
		 	MainMenu();
		 
	    }
	 
	private static void MainMenu() throws IOException {
		
		Scanner choice = new Scanner(System.in);
		UserCredentials USER = new UserCredentials(); 
	 	
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
					CustomerMenu(USER);
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
	 
	public static void CustomerMenu(UserCredentials credential) throws IOException {

		    while(true) {
		    		
			        if(CustomerInput().equals(credential.username) && CustomerInput().equals(credential.password))
			        {
			            System.out.println("Authentication Successful");
			            
			        
			        }
			        else
			        {
			        	
			        	try {
			        		
			        		Scanner choice = new Scanner(System.in);
			        		String ans;
			        		System.out.println("\n\n\n\t\tWrong Password or Username. \n\tWould you like to go again [Y/N].");
				            
				            ans = choice.nextLine();
				            
							if(ans.equals('y') || ans.equals('Y')) {
								UserCredentials c = new UserCredentials();
								CustomerMenu(c);
								//System.in('cls');
								}
							System.out.println(" ");
							if(ans.equals('n')|| ans.equals('N')) {
								MainMenu();
								//break;
							}	
			        	}catch (InputMismatchException e) {
			        		System.out.println("Wrong input, go again!");
			        	}
			        	
					}
		    }
	}
		    

	private static String CustomerInput() {
		//change array size soon
		List<UserCredentials> List = new ArrayList<UserCredentials>(20);
		
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


