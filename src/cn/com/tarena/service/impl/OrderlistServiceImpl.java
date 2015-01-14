package cn.com.tarena.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.tarena.pojo.Orders;
import cn.com.tarena.service.orderListService;

public class OrderlistServiceImpl implements orderListService {

	@Override
	public List getOrderList() {
List orderList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from orders");
			
			while(rs.next()){
				Orders order = new Orders();
				
				order.setOrderid(Integer.parseInt(rs.getString("orderid")));//Float.parseFloat(string)
				order.setName(rs.getString("name"));
				order.setCost(Float.parseFloat(rs.getString("cost")));
				order.setUserid(rs.getString("userid"));
				order.setPaywayid(Integer.parseInt(rs.getString("paywayid")));
				order.setStatusid(Integer.parseInt(rs.getString("statusid")));
				orderList.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying students ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying students ",e);
			}
		}

		return orderList;
	}


}
