package tw.shawn.apps;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tw.shawn.model.Course;
import tw.shawn.model.Cust;
import tw.shawn.model.Gift;
import tw.shawn.model.Member;
import tw.shawn.model.MemberInfo;
import tw.shawn.model.Order;
import tw.shawn.model.Student;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration config = new Configuration();
				config.configure("hibernate.cfg.xml");
				
				config.addAnnotatedClass(Member.class);
				config.addAnnotatedClass(MemberInfo.class);
				config.addAnnotatedClass(Gift.class);
				config.addAnnotatedClass(Cust.class);
				config.addAnnotatedClass(Order.class);
				config.addAnnotatedClass(Student.class);
				config.addAnnotatedClass(Course.class);
				
				sessionFactory = config.buildSessionFactory();
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return sessionFactory;
	}
}