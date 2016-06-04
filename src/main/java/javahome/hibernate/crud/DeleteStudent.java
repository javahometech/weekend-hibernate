package javahome.hibernate.crud;

import org.hibernate.Session;

public class DeleteStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std = session.load(Student.class,11);
		System.out.println(std);
	}
}
