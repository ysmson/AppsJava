package tw.shawn.apps;

import java.lang.reflect.Member;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;


public class Shawn02 {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction transaction = session.beginTransaction();
			
			String sql = "INSERT INTO member (account,passwd,cname)" + 
						" VALUES (:account, :passwd, :cname)";
			NativeQuery<Member> query =
				session.createNativeQuery(sql, Member.class);
			query.setParameter("account", "test111");
			query.setParameter("passwd", "test222");
			query.setParameter("cname", "test333");
			
			int n = query.executeUpdate();
			
			transaction.commit();
			
			System.out.println(n);
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}