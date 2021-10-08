package oopintro;

import java.util.ArrayList;

public class AccountManager {
	
	void add(Account account, ArrayList<Account> database, Logger[] loggers) {
		
		String message = account.owner.getCustomerType() ? 
		"A new customer has been added to DB as an individual customer --> " + account.owner.getName() + " " + 
	account.owner.getSurname() + ", " + account.getId() : 
		"A new customer has been added to DB as a corporate customer --> " + account.owner.getName() + " " + 
			account.owner.getSurname() + ", " + account.getId();
		
		database.add(account);
		
		for(Logger logger : loggers)
			logger.log(message);
	}
	void delete(Account account, ArrayList<Account> database, Logger[] loggers) {
		String message = "A customer has been deleted from DB --> " + account.owner.getName() + " " + 
	account.owner.getSurname() + ", " + account.getId();
					
		database.remove(account.getId()-1);
					
		for(Logger logger : loggers)
			logger.log(message);
	}
	void edit(Account account, ArrayList<Account> database, Logger[] loggers) {
		String message = "A customer changed its preferences --> " + account.owner.getName() + " " + 
				account.owner.getSurname() + ", " + account.getId();
					
		for(Logger logger : loggers)
			logger.log(message);
	}

}
