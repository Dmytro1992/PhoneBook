package phoneBook.PhoneBook.execute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import phoneBook.PhoneBook.execute.impl.OptionsImpl;
import phoneBook.PhoneBook.model.User;
import phoneBook.PhoneBook.util.HibernateUtil;

public class Main {
private static Map<Integer,String> command;
	
	static {
		command = new HashMap<>();
		command.put(1, "add");
		command.put(2, "remove");
		command.put(3, "showAllUser");
		command.put(4, "searchByFirstName");
		command.put(5, "searchByLastName");
		command.put(6, "searchBySurname");
		command.put(7, "searchByNumber");
		command.put(8, "searchByAddress");
		command.put(9, "Exit");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cmd;
		Options options = new OptionsImpl();
		System.out.println(command);
		while(true) {
			cmd = sc.nextInt();
			sc.nextLine();
		if(cmd == 1) {
			User user = new User();
			System.out.println("Enter firstName");
			user.setFirstName(sc.nextLine());
			System.out.println("Enter lastName");
			user.setLastName(sc.nextLine());
			System.out.println("Enter surname");
			user.setSurname(sc.nextLine());
			System.out.println("Enter number");
			user.setNumber(sc.nextLine());
			System.out.println("Enter address");
			user.setAddress(sc.nextLine());
			options.add(user);
		}else if(cmd == 2) {
			System.out.println("Enter phone number");
			options.removeByPhonenumber(sc.nextLine());
		}else if(cmd == 3) {
			List<User>users = options.showAllUser();
			for (User user : users) {
				System.out.println(user.toString());
			}
		}else if(cmd == 4) {
			System.out.println("Enter firstName");
			System.out.println(options.searchByFirstName(sc.nextLine()));
		}else if(cmd == 5) {
			System.out.println("Enter lastName");
			System.out.println(options.searchByLastName(sc.nextLine()));
		}else if(cmd == 6) {
			System.out.println("Enter surname");
			System.out.println(options.searchBySurname(sc.nextLine()));
		}else if(cmd == 7) {
			System.out.println("Enter number");
			System.out.println(options.searchByNumber(sc.nextLine()));
		}else if(cmd == 8) {
			System.out.println("Enter address");
			System.out.println(options.searchByAddress(sc.nextLine()));
		}else if(cmd == 9) {
			HibernateUtil.closeSession();
			break;
		}
		}

	}

}
