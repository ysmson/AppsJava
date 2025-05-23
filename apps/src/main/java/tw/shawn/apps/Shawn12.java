package tw.shawn.apps;

import java.util.Date;

import tw.shawn.dao.CustDao;
import tw.shawn.model.Cust;
import tw.shawn.model.Order;

public class Shawn12 {

	public static void main(String[] args) {
		CustDao custDao = new CustDao();
		custDao.removeOrderFromCust(9, 7);
	}

}