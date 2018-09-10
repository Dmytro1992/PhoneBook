package phoneBook.PhoneBook.execute;

import java.util.List;

import phoneBook.PhoneBook.model.User;

public interface Options {

	void add(User user);
	
	void removeByPhonenumber(String number);
	
	List<User> showAllUser();
	
	List<User> searchByFirstName(String firstName);
	
	List<User> searchByLastName(String lastName);
	
	List<User> searchBySurname(String surname);
	
	List<User> searchByNumber(String number);
	
	List<User> searchByAddress(String address);
}
