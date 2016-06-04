package javahome.hibernate.crud;

import org.hibernate.Session;

public class GetStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std = session.get(Student.class, 10);// gets data here
		System.out.println(std);
	}
}
