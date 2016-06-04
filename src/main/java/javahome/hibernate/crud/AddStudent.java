package javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddStudent {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {

			Transaction tx = session.beginTransaction();

			Student s1 = new Student();
			s1.setStdId(5);
			s1.setName("siva");
			s1.setMail("siva@javahome.in");

			session.save(s1);
			tx.commit();
		}
	}
}