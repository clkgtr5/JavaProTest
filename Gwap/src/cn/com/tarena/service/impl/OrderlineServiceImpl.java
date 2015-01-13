package cn.com.tarena.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.tarena.pojo.Orderline;
import cn.com.tatena.service.orderLineService;

public class OrderlineServiceImpl implements orderLineService {

	@Override
	public List getOrderLineList() {
        List orderlineList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from product");
			
			while(rs.next()){
				Orderline orderline = new Orderline();
				
				orderline.setLineid(Integer.parseInt(rs.getString("lineid")));
				orderline.setOrderid(Integer.parseInt(rs.getString("orderid")));
				orderline.setProductid(Integer.parseInt(rs.getString("productid")));
				orderline.setAmount(Float.parseFloat(rs.getString("amount")));
				orderlineList.add(orderline);
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

		return orderlineList;
	}


}
