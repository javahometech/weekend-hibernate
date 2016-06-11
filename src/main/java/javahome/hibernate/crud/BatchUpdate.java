package javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class BatchUpdate {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {

			Transaction tx = session.beginTransaction();
			int batchCount=1;
			for (int i = 0; i < 100000; i++) {
				Student s1 = new Student();
				s1.setName("siva");
				s1.setMail("siva@javahome.in");
				session.save(s1);
				batchCount++;
				if(batchCount%10000 == 0){
					session.flush();
					session.clear();
				}
			}
			tx.commit();
		}
	}
}