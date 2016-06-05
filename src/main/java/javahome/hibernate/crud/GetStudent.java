package javahome.hibernate.crud;

import org.hibernate.Session;

public class GetStudent {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std = session.get(Student.class, 3);// gets data here
		Student std2 = session.get(Student.class, 3);
		System.out.println(std);
	}
}
