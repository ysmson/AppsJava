package tw.shawn.apps;

import java.util.Date;

import tw.shawn.dao.CustDao;
import tw.shawn.model.Cust;
import tw.shawn.model.Order;

public class Shawn11 {

	public static void main(String[] args) {
		CustDao custDao = new CustDao();
		Cust cust = custDao.getById(1);
		if (cust != null) {
			//System.out.println(cust.getOrders().size());
			Order order1 = new Order();
			order1.setOrderDate(new Date());
			
			Order order2 = new Order();
			order2.setOrderDate(new Date());
			
			cust.addOrder(order1);
			cust.addOrder(order2);
			
			custDao.update(cust);
		}else {
			System.out.println("NOT FOUND");
		}
	}

}