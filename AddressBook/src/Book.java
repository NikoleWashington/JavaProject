import java.util.ArrayList;
import java.util.List;



public class Book {
	
	
	List<Entry> entries = new ArrayList<>();
	
//Add an entry
	public void addEntry(Entry newEntry){
		entries.add(newEntry);
		System.out.println("You've added a new entry:\n" + newEntry.toString());
		System.out.println();
	}
	
//Remove an entry
	public void removeEntry(String removeEmail) {
		for(int i = 0; i<entries.size(); i++) {
			Entry result = entries.get(i);
			if(result.getEmail().equals(removeEmail)) {
				entries.remove(i);
				System.out.println("You've deleted the following entry:/n " + result);
			} else if (!result.getEmail().equals(removeEmail)) {
				System.out.println("Entry not found");
			}
		}
		
//		for(Entry entry : entries) {
//			if(entry.getEmail().equals(removeEmail )) {
//				entry.remove(removeEmail);
//				System.out.println("You've deleted: \n" + entry);
//			}else {
//				System.out.println("Sorry, no such entry was found!\n");
//			}
//		}
	}
//Search an entry by searching for everything - first name, last name, email or phone#
// I also made it to where it doesn't matter if it's lowercase, uppercase or partial search
	public void searchEntry(String searchTerm) {
		boolean found = false;
		for(Entry entry : entries) { 
			if(entry.toString().toLowerCase().contains(searchTerm.toLowerCase())) {
				found=true;
				System.out.println(entry);
				System.out.println();
			}
		}
		 if(!found) {
			System.out.println("Sorry, no such entry was found!");
			System.out.println();
		}
	}
	
//Print Address Book
	public void printAddressBook() {
		boolean checkBookEntries = entries.isEmpty();
		for(Entry print : entries) 
			if(checkBookEntries == false) {
				System.out.println(print);
			}if(checkBookEntries == true){
				System.out.println("Sorry, no entries in address book!");
		}
		
	}
//Delete contents in address book
	public void deleteAddressBook() {
		entries.clear();
		System.out.println("The address book has been cleared!");
		System.out.println();
	}


}
