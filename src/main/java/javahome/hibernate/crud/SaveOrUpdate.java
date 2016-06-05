package javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveOrUpdate {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {

			Transaction tx = session.beginTransaction();

			Student s1 = new Student();
			s1.setStdId(5);
			s1.setName("siva prasad");
			s1.setMail("siva@javahome.in");
			session.saveOrUpdate(s1);
			tx.commit();
		}
	}
}