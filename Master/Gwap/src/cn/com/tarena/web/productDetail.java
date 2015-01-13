package cn.com.tarena.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import cn.com.tarena.pojo.Product;
import cn.com.tarena.service.ProductList;
import cn.com.tarena.service.impl.productServiceImpl;

public class productDetail extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 
		try{
			//String s=req.getQueryString();
			//String[] s1 = s.split("=");
			
			String s=req.getParameter("id");
			String productid = s;
			 //System.out.print("1");
			// System.out.print(s);
			 //System.out.print("2");
			ProductList productService = new productServiceImpl();
						
			List productDetailList = productService.getProductList();
			 
			toproductDetail(resp, productDetailList, productid);
		} catch (Exception e){
			toError(resp,e.getMessage());
		}
	}
	private void toError(HttpServletResponse resp, String message) throws IOException {
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Error</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h2 align=\"center\">Error</h2>");
		out.println("	<hr>");
		out.println("	System Error," + message + "!");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	private void toproductDetail(HttpServletResponse resp, List productList,String productid)
			throws IOException {
		int pid=0;
		try{
			pid = Integer.parseInt(productid);
		} 
		catch(Exception e){
			
		}
		
		resp.setContentType("text/html;charset=UTF-8");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>达内电子商务门户</title>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.println("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.println("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("<!-- Header Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out.println("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.println("			<tr>");
		out.println("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.println("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("						<tr>");
		out.println("							<td width=\"5%\"></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"productList\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"userManager\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"shoppingCart\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"orderList\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"productList\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("						</tr>");
		out.println("					</table>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.println("			<tr>");
		out.println("				<td width=\"65%\"><br>");
		out.println("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.println("				</td>");
		out.println("				<td width=\"35%\" align=\"right\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Header End -->");
		out.println("");
		out.println("");
		out.println("<!-- Body Start -->");
		out.println("");
		out.println("	<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.println("");
		out.println("			<tr>");
		out.println("				<td height=\"25\" valign=\"middle\">");
		out.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.println("					<a href=index.jsp>达内电子商务门户</a> → 产品明细");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("");
		out.println("		<br>");
		out.println("			");
		out.println("		<table cellpadding=\"3\" cellspacing=\"1\" align=\"center\" class=\"tableborder1\">");
		
		//导入数据库资料
		Product product = null;
		for(int i = 0; i<productList.size() ; i++){
			product = (Product)productList.get(i);
			if(product.getProductid() == pid)
				break;
		}
		
		out.println("			<tr>");
		out.println("				<td  colspan=\"2\" valign=\"middle\" align=\"center\" height=\"25\" background=\"images/bg2.gif\" width=\"100%\">");
		out.println("					<font color=\"#ffffff\">");
		out.println("						<b>"+product.getName()+"</b>");
		out.println("					</font>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"25%\" align=\"center\">");
		out.println("				[ 作 &nbsp者 ]");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		out.println(product.getAuthor());
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"25%\" align=\"center\">");
		out.println("				[ 价 &nbsp格 ]");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		out.println(product.getBasePrice());
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"25%\" align=\"center\">");
		out.println("				[出 版 社]");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		out.println(product.getPublish());
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"25%\" align=\"center\">");
		out.println("				[ 书 &nbsp号 ]");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		out.println(product.getProductid());
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"25%\" align=\"center\">");
		out.println("				[ 页 &nbsp码 ]");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		out.println(product.getPages());
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"25%\" align=\"center\">");
		out.println("				[所属类别]");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		out.println(product.getCategoryid()+"<br>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"top\" width=\"25%\" align=\"center\">");
		out.println("				[ 简 &nbsp介 ]");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		//out.println("				如果说书的结构好比房屋的框架，书的内容则好比房屋的具体组成元素。计算机书的内容的形式分为：文字、 表格、图和范例。为了把某种知识讲清楚，常常需要综合使用这四种形式的元素......<br>　　继《Tomcat 与 Java Web开发技术详解(含光盘)》和《精通Struts：基于MVC的Java Web设计与开发(含光盘)》之后，应广大读者的强烈要求，孙卫琴的又一力作《精通Hibernate：Java对象持久化技术详解》，正处在迎接面市的准备当中。\r\nHibernate是一个基于Java的开放源代码的持久化中间件，它对JDBC作了轻量级封装，不仅提供ORM映射服务，还提供数据查询和数据缓存功能，Java开发人员可以方便的通过Hibernate API来操纵数据库。\r\n现在，越来越多的Java开发人员把Hibernate作为企业应用和关系数据库之间的中间件，以节省和对象持久化有关的30%的JDBC编程工作量。 2005年，Hibernate作为优秀的类库和组件，荣获了第15届Jolt大奖。Hibernate之所以能够流行，归功于它特有的优势。<br>\r\n　　本书结合大量典型的实例，详细介绍了运用目前最成熟的Hibernate2.1版本进行Java对象持久化的技术。Hibernate是连接Java 对象模型和关系数据模型的桥梁，通过本书，读者不仅能掌握用Hibernate工具对这两种模型进行映射的技术，还能获得设计与开发Java对象模型和关系数据模型的先进经验。");
		out.println(product.getDescription());
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"25%\">");
		out.println("				");
		out.println("				</td>");
		out.println("				");
		out.println("				<td class=tablebody1 valign=\"middle\" width=\"75%\">");
		out.println("				&nbsp");
		out.println("				<img src="+product.getImages()+">");
		out.println("				</td>");
		out.println("			</tr>");
		//结束
		out.println("			");
		out.println("			<tr>");
		out.println("			<td colspan=\"2\" class=tablebody2 valign=\"top\" align=\"center\" width=\"100%\" height=\"32\"> ");
		out.println("				<a href=\"shoppingCart\"><img border=\"0\" src=\"images/buycar.gif\" ></a> ");
		out.println("    		</td>");
		out.println("    		</tr>");
		out.println("			");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		<br>");
		out.println("");
		out.println("<!-- Body End -->");
		out.println("");
		out.println("");
		out.println("");
		out.println("<!-- Footer Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.println("			<tr>");
		out.println("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("			<tr>");
		out.println("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.println("					<p align=\"center\">");
		out.println("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out.println("					</p>");
		out.println("				</td>");
		out.println("");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Footer End -->");
		out.println("	</body>");
		out.println("</html>");
		
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

}
