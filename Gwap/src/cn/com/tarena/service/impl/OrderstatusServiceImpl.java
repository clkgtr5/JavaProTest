package cn.com.tarena.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.tarena.pojo.Orderstatus;
import cn.com.tatena.service.orderStatusService;

public class OrderstatusServiceImpl implements orderStatusService {

	@Override
	public List getOrderStatusList() {
List orderstatusList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from orderstatus");
			
			while(rs.next()){
				Orderstatus status = new Orderstatus();
				
				status.setStatusid(Integer.parseInt( rs.getString("statusid")));//Float.parseFloat(string)
				status.setName(rs.getString("name"));
				status.setDescription(rs.getString("description"));
				orderstatusList.add(status);
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

		return orderstatusList;
	}

}
