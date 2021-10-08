package oopintro;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
	
		// INPUT DATAS (Start Point)
		// Simulation: User will enter these datas from UI.
		Owner[] owners = new Owner[]{
			new Owner("Eren", "Memis", LocalDate.of(2002, 1, 30), true, 23245889988L),
			new Owner("Ahmet", "Sandik", LocalDate.of(1972, 8, 21), true, 34526789474L),
			new Owner("Davut", "Kel", LocalDate.of(1995, 7, 12), false, 35467964480L),
			new Owner("Engin", "Demirog", LocalDate.of(1998, 3, 15), true, 65439764422L),
			new Owner("Talha", "Kemanci", LocalDate.of(2000, 4, 17), true, 85358974828L),
			new Owner("Ayhan", "Aktas", LocalDate.of(2001, 6, 3), false, 95478964320L)	
		};
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		int i = 1;
		for(Owner owner : owners){	
			accounts.add(new Account(i, owner));
			i++;
		}
		//(End Point)
		
		AccountManager accountManager = new AccountManager();
		ArrayList<Account> database = new ArrayList<Account>();
		
		Logger[] loggers = new Logger[]{ // If we need any logger we can add it here.
				new ConsoleLogger(), new MailLogger()			
				};
		
		
		for(int j = 0; j < accounts.size(); j++) 
			accountManager.add(accounts.get(j), database, loggers); // Adding accounts to our database.
			
			
		// Accounts can be edited if it is necessary.
		accountManager.edit(accounts.get(1), database, loggers);
		accountManager.edit(accounts.get(3), database, loggers);
		
		// Accounts can be deleted.
		for(int j = database.size() - 1; j >= 0; j--)
			accountManager.delete(database.get(j), database, loggers); // Deleting accounts from our database.	
	}
	
	
}
