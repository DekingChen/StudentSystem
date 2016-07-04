package entity;



import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import util.HibernateUtil;

public class testStudents {
	
	public static Session session;
	
	@BeforeClass
	public static void before()
	{
		 session = HibernateUtil.getSession();	

	}	
	@Test
	public void test() {
	Student stu = (Student) session.get(Student.class, "S0000001");
	System.out.println(stu.toString());
	}
	
	@Test
	public void testUser(){
		User user = (User) session.get(User.class, 1);
		System.out.println(user.toString());
	}
	
	@AfterClass
	public static void after(){
		HibernateUtil.closeSession(session);
	}
	

}
