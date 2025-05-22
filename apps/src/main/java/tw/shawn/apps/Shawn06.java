package tw.shawn.apps;

import java.util.List;

import tw.shawn.dao.GiftDao;
import tw.shawn.model.Gift;

public class Shawn06 {

	public static void main(String[] args) {
		GiftDao dao = new GiftDao();
//		List<Gift> gifts = dao.getAll();
//		for (Gift gift: gifts) {
//			System.out.printf("%d, %s : %s\n", 
//				gift.getId(), gift.getName(), gift.getTel());
//		}
		
		// SQL
//		List<Gift> gifts =  dao.getSQL("SELECT * FROM gift WHERE name LIKE '%禮盒%'");
//		for (Gift gift: gifts) {
//			System.out.printf("%d : %s : %s\n", 
//					gift.getId(), gift.getName(), gift.getTel());
//		}
		
		// HQL
		List<Gift> gifts =  dao.getHql("FROM Gift g WHERE g.name LIKE '%禮盒%'");
		for (Gift gift: gifts) {
			System.out.printf("%d : %s : %s\n", 
					gift.getId(), gift.getName(), gift.getTel());
		}
		
		
	}

}