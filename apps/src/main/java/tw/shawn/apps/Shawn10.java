package tw.shawn.apps;

import java.util.Date;

import tw.shawn.dao.CustDao;
import tw.shawn.model.Cust;
import tw.shawn.model.Order;

public class Shawn10 {

	public static void main(String[] args) {
		CustDao custDao = new CustDao();
		
		Cust cust = new Cust();
		cust.setName("brad1");
		cust.setBirthday("1999-01-02");
		cust.setTel("1234567");
		
		Order order1 = new Order();
		order1.setOrderDate(new Date());
		
		Order order2 = new Order();
		order2.setOrderDate(new Date());
		
		cust.addOrder(order1);
		cust.addOrder(order2);
		
		custDao.save(cust);
	}

}