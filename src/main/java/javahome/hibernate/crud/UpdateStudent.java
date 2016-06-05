package javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		Student std = session.load(Student.class, 2);
		std.setName("rama");
		std.setMail("rama@javahome.in");
		session.update(std);
		
		Student s2 = new  Student();
		s2.setStdId(2);
		session.merge(s2);
		tx.commit();
	}
}
