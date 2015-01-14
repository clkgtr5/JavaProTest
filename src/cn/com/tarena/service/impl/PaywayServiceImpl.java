package cn.com.tarena.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.tarena.pojo.Payway;
import cn.com.tarena.pojo.users;
import cn.com.tarena.service.ProductListService;
import cn.com.tarena.service.payWayService;

public class PaywayServiceImpl implements payWayService {

	@Override
	public List getpayWayList() {
	List paywayList = new ArrayList();
	
	Connection conn = null;
	
	Statement stmt = null;
	
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
		
		stmt = conn.createStatement();
		
		rs = stmt.executeQuery("select * from users");
		
		while(rs.next()){
			Payway way = new Payway();
			
			way.setPaywayid(Integer.parseInt(rs.getString("paywayid")));
			way.setPaystyle(rs.getString("paystyle"));
			paywayList.add(way);
		}
	} catch (Exception e) {
		e.printStackTrace();
		
		throw new RuntimeException("error when querying ",e);
	} finally {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying ",e);
		}
	}

	return paywayList;
}


}
