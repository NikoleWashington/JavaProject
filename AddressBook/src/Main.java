import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Book bookEntries = new Book();
		
		
		
//While loop to loop through as long as option 6(Quit) is not selected		
		while(!input.equals(6)) {
			
			System.out.println("Please choose what you'd like to do with the database:");
			System.out.println();
			System.out.println("|1| Add an entry");
			System.out.println("|2| Remove an entry");
			System.out.println("|3| Search for a specific entry");
			System.out.println("|4| Print address book");
			System.out.println("|5| Delete address book");
			System.out.println("|6| Quit");
			System.out.println();
// Try/Catch block to catch if the user doesn't put in a number/option			
			try {
				int selection = input.nextInt();
			
			
			System.out.println();
			
			switch(selection) {
			
			case 1:{
				System.out.println("First Name: ");
				String firstName= input.next();
				System.out.println("Last Name: ");
				String lastName = input.next();
				System.out.println("Phone number: ");
				String phoneNumb = input.next();
				System.out.println("Email address: ");
				String email = input.next();
				bookEntries.addEntry(new Entry((firstName), lastName, phoneNumb, email));
				
				break;
			}
			
			case 2:{
				System.out.println("Enter an entry's email address to remove: ");
				String email = input.next();
				bookEntries.removeEntry(email);
				
				break;
			}
			
			case 3:{
				System.out.println("Please type a first name, last name, phone number or email:");
				String findme = input.next();
				bookEntries.searchEntry(findme);
				
				break;
			}
			
			case 4:{
				bookEntries.printAddressBook();
				
				break;
			}
			
			case 5:{
				bookEntries.deleteAddressBook();
				
				break;
			}
			
			case 6:{
				System.out.println("Have a wonderful day!");
// Always close scanner and make sure to exit program as to not have leaks and take up unnecessary memory/space.				
				input.close();
				System.exit(0);	
			}
			
			
			}
			}catch(InputMismatchException e) {
				if (input.nextLine().equals(6)) {
					System.out.println("Have a wonderful day!");
								
								input.close();
								System.exit(0);	
				}
				else {
					System.out.println("You didn't enter a number from 1-6. Please enter a numerical number.");
					int selection = input.nextInt();
					switch(selection) {
				
				case 1:{
					System.out.println("First Name: ");
					String firstName= input.next();
					System.out.println("Last Name: ");
					String lastName = input.next();
					System.out.println("Phone number: ");
					String phoneNumb = input.next();
					System.out.println("Email address: ");
					String email = input.next();
					bookEntries.addEntry(new Entry((firstName), lastName, phoneNumb, email));
					
					break;
				}
				
				case 2:{
					System.out.println("Enter an entry's email address to remove: ");
					String email = input.next();
					bookEntries.removeEntry(email);
					
					break;
				}
				
				case 3:{
					System.out.println("Please type a first name, last name, phone number or email:");
					String findme = input.next();
					bookEntries.searchEntry(findme);
					
					break;
				}
				
				case 4:{
					bookEntries.printAddressBook();
					
					break;
				}
				
				case 5:{
					bookEntries.deleteAddressBook();
					
					break;
				
				}
				
				case 6:{
					System.out.println("Have a wonderful day!");
					
					input.close();
					System.exit(0);	
				}
				
				
				}
					
				}
				
			}
			
			
			
			
			
			
		}

	}

}
