package tw.shawn.apps;

import tw.shawn.dao.SCDao;
import tw.shawn.model.Student;

public class Shawn13 {

	public static void main(String[] args) {
		SCDao dao = new SCDao();
		Student s1 = new Student("Brad");
		Student s2 = new Student("Andy");
		Student s3 = new Student("Eric");
		Student s4 = new Student("Mark");
		Student s5 = new Student("John");
		
		dao.add(s1);dao.add(s2);
		dao.add(s3);dao.add(s4);
		dao.add(s5);
		
		
		
		
		
	}

}