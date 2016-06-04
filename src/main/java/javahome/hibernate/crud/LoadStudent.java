package javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoadStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Student std = session.load(Student.class, 1);
		session.delete(std);
		tx.commit();
	}
}
