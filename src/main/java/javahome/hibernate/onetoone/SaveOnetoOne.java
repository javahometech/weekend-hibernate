package javahome.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javahome.hibernate.crud.HibUtil;

public class SaveOnetoOne {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Passport p = new Passport();
		p.setPassportId("500GH12A");
		p.setName("Ravi");
		
		Employee e = new Employee();
		e.setEmail("ravi@javahome.in");
		e.setPhone("9999999999");
		e.setPassport(p);
		
		session.save(p);
		session.save(e);
		
		tx.commit();
		
	}
}
