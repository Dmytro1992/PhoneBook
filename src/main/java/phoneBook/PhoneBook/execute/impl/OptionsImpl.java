package phoneBook.PhoneBook.execute.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import phoneBook.PhoneBook.execute.Options;
import phoneBook.PhoneBook.model.User;
import phoneBook.PhoneBook.util.HibernateUtil;

public class OptionsImpl implements Options {
	private static Session session = HibernateUtil.getSession();
	private static List<User> users;
	
	public void add(User user) {
		try {
			session = HibernateUtil.getSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeByPhonenumber(String phonenumber) {
		users = searchByNumber(phonenumber);
		session.beginTransaction();
		session.delete(users.get(0));
		session.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<User> showAllUser() {
		users = null;
		try {
			session.beginTransaction();
			users =session.createQuery("FROM User").list();
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@SuppressWarnings("unchecked")
	public List<User> searchByFirstName(String firstName) {
		users = null;
		try {
			session.beginTransaction();
			users = session.createQuery("FROM User WHERE firstname =" +"'"+firstName+"'").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@SuppressWarnings("unchecked")
	public List<User> searchByLastName(String lastName) {
		users = null;
		try {
			session.beginTransaction();
			users = session.createQuery("FROM User WHERE lastName =" +"'"+lastName+"'").list();
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@SuppressWarnings("unchecked")
	public List<User> searchBySurname(String surname) {
		users = null;
		try {
			session.beginTransaction();
			users = session.createQuery("FROM User WHERE surname =" +"'"+surname+"'").list();
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@SuppressWarnings("unchecked")
	public List<User> searchByNumber(String number) {
		users = null;
		try {
			session.beginTransaction();
			users = session.createQuery("FROM User WHERE number =" +"'"+number+"'").list();
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@SuppressWarnings("unchecked")
	public List<User> searchByAddress(String address) {
		users = null;
		try {
			session.beginTransaction();
			users = session.createQuery("FROM User WHERE address =" +"'"+address+"'").list();
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

}
