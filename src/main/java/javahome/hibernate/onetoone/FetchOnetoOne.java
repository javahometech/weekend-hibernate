package javahome.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javahome.hibernate.crud.HibUtil;

public class FetchOnetoOne {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp.getPhone());
		System.out.println(emp.getEmail());
		
		Passport ppt = emp.getPassport();
		System.out.println(ppt.getName());
		System.out.println(ppt.getPassportId());
		
		tx.commit();
		
	}
}
