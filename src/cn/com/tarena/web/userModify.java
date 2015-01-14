package cn.com.tarena.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.tarena.pojo.Contactinfo;
import cn.com.tarena.pojo.Product;
import cn.com.tarena.pojo.users;
import cn.com.tarena.service.contactInfoService;
import cn.com.tarena.service.userListService;
import cn.com.tarena.service.impl.ContactInfoServiceImpl;
import cn.com.tarena.service.impl.UserServiceImpl;




public class userModify extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userid=req.getParameter("id");
		resp.setContentType("text/html;charset=UTF-8");
		
		List usersList = (List)req.getAttribute("usersList");
		List contactInfoList = (List)req.getAttribute("contactInfoList");
				
		PrintWriter out = resp.getWriter();
		//����ʹ������
		Contactinfo contactinfo  = null;
		users user = null;
		for(int i = 0; i<usersList.size() ; i++){
			user = (users)usersList.get(i);
			if(user.getUserName().equals(userid))
				break;
		}
		for(int i = 0; i<contactInfoList.size() ; i++){
			contactinfo = (Contactinfo)contactInfoList.get(i);
			if(contactinfo.getUserid().equals(userid))
				break;
		}
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>���ڵ��������Ż�</title>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.println("		<meta name=\"description\" content=\"���ڵ��������Ż�\">");
		out.println("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("");
		out.println("<!-- Header Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">��</td>");
		out.println("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.println("");
		out.println("			<tr>");
		out.println("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.println("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("						<tr>");
		out.println("							<td width=\"5%\"></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"toproductList.asp\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"touserManager.asp\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"shoppingCart\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"toorderList.asp\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("");
		out.println("							");
		out.println("          <td width=\"10%\"><a href=\"toproductList.asp\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("						</tr>");
		out.println("					</table>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.println("			<tr>");
		out.println("				<td width=\"65%\"><br>");
		out.println("");
		out.println("					>> ��ӭ���� <b>���ڵ��������Ż�</b>");
		out.println("				</td>");
		out.println("				<td width=\"35%\" align=\"right\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("</html>");
		out.println("<!-- Header End -->");
		out.println("<!-- Body Start -->");
		//����userid
		out.println("<form method=\"post\" name=\"reg\"  action=\"/ecport/user/modify.do\">");
		out.println("	<input type=\"hidden\" name=\"userid\" value=\""+contactinfo.getUserid()+"\"/>");
		out.println("");
		//����contactid
		out.println("	<input type=\"hidden\" name=\"contactid\" value=\""+contactinfo.getContactid()+"\"/>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.println("");
		out.println("			<tr>");
		out.println("				<td height=\"25\" valign=\"middle\">");
		out.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.println("					<a href=index.jsp>���ڵ��������Ż�</a> ���û���Ϣ�޸�");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder1\">");
		out.println("			<tr>");
		out.println("				 <td colspan=\"2\" align=\"center\" valign=\"middle\" background=\"images/bg2.gif\" width=\"60%\"> &nbsp;&nbsp;<font><b>�û���Ϣ�޸�</b></font> ");
		out.println("   				 </td>");
		out.println("			</tr>");
		
		//�����������
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>�û���</b>��<br>Ӣ����ĸ�����֣���󳤶�Ϊ8λ</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("				<input type=\"text\" maxLength=\"12\" size=\"32\"  value=\""+contactinfo.getUserid()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("				<font color=\"#FF0000\">*</font></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>����</b>��<br>���֣�6��8λ</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("				<input type=\"password\" maxLength=\"12\" size=\"32\" name=\"password\" value=\""+user.getPassword()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("				<font color=\"#FF0000\">*</font></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>ȷ������</b>��<br>���֣�6��8λ</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("				<input type=\"password\" maxLength=\"12\" size=\"32\" name=\"password2\" value=\""+user.getPassword()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("				<font color=\"#FF0000\">*</font></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>���ڵ���</b>��</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("					<select name=\"country\" onchange=\"javascript:initProvince(this.value)\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\">");
		out.println("    						<option value=\"0\"  selected>"+contactinfo.getCountry()+"</option>");
		out.println("    						<option value=\"1\"  >�й�</option>");
		out.println("    						<option value=\"2\" >�й����</option>");
		out.println("    						<option value=\"3\" >�й�̨��</option>");
		out.println("					</select>");
		out.println("					<select name=\"province\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\">");
		out.println("               		  	");
		out.println("	    					<option value=\"0\"  selected>"+contactinfo.getCity()+"</option>");
		out.println("	    					<option value=\"1\" >����</option>");
		out.println("	    					<option value=\"2\" >����</option>");
		out.println("	    					<option value=\"3\" >����</option>");
		out.println("	    					<option value=\"4\" >����</option>");
		out.println("	    					<option value=\"5\" >�㶫</option>");
		out.println("	    					<option value=\"6\" >����</option>");
		out.println("	    					<option value=\"7\" >����</option>");
		out.println("	    					<option value=\"8\" >����</option>");
		out.println("	    					<option value=\"9\" >����</option>");
		out.println("	    					<option value=\"10\" >����</option>");
		out.println("	    					<option value=\"11\" >�ӱ�</option>");
		out.println("	    					<option value=\"12\" >����</option>");
		out.println("	    					<option value=\"13\" >���</option>");
		out.println("	    					<option value=\"14\" >������</option>");
		out.println("	    					<option value=\"15\" >����</option>");
		out.println("	    					<option value=\"16\" >����</option>");
		out.println("	    					<option value=\"17\" >����</option>");
		out.println("	    					<option value=\"18\" >����</option>");
		out.println("	    					<option value=\"19\" >����</option>");
		out.println("	    					<option value=\"20\" >����</option>");
		out.println("	    					<option value=\"21\" >���ɹ�</option>");
		out.println("	    					<option value=\"22\" >����</option>");
		out.println("	    					<option value=\"23\" >�ຣ</option>");
		out.println("	    					<option value=\"24\" >�Ĵ�</option>");
		out.println("	    					<option value=\"25\" >ɽ��</option>");
		out.println("	    					<option value=\"26\" >�Ϻ�</option>");
		out.println("	    					<option value=\"27\" >����</option>");
		out.println("	    					<option value=\"28\" >ɽ��</option>");
		out.println("	    					<option value=\"29\" >���</option>");
		out.println("	    					<option value=\"30\" >̨��</option>");
		out.println("	    					<option value=\"31\" >�½�</option>");
		out.println("	    					<option value=\"32\" >����</option>");
		out.println("	    					<option value=\"33\" >����</option>");
		out.println("	    					<option value=\"34\" >�㽭</option>");
		out.println("	    					<option value=\"35\" >����</option>");
		out.println("	    					<option value=\"36\" >�й����</option>");
		out.println("	    					<option value=\"37\" >�й�̨��</option>");		
		out.println("				</select>ʡ");
		out.println("				<input type=\"text\" size=\"8\" name=\"city\" value=\"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>��/��</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>��ϵ��ַ1</b>��</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"64\" maxlength=\"32\" name=\"street1\" value=\""+contactinfo.getStreet1()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>��ϵ��ַ2</b>��</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"64\" maxlength=\"32\" name=\"street2\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>�ʱ�</b>��</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"8\" name=\"zip\" value=\""+contactinfo.getZip()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>��ͥ�绰</b>��</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"16\" name=\"homephone\" value=\""+contactinfo.getHomephone()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>�칫�ҵ绰</b>��</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"16\" name=\"officephone\" value=\""+contactinfo.getOfficephone()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>�ֻ�</b>��</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"16\" name=\"officephone\" value=\""+contactinfo.getCellphone()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("");
		out.println("			<td class=\"tablebody1\"><b>Email��ַ</b>��<br>	��������Ч���ʼ���ַ</td>");
		out.println("			<td class=\"tablebody1\">");
		out.println("			<input maxLength=\"50\" size=\"32\" maxlength=\"32\" name=\"email\" value=\""+contactinfo.getEmail()+"\" style=\"font-family: Tahoma,Verdana,����; font-size: 12px; line-height: 15px; color: #000000\"/></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("			<td class=\"tablebody2\" valign=\"middle\" colspan=\"2\" align=\"center\">");
		out.println("			<input type=\"button\" value=\"��&nbsp;��\" onclick=\"javascript:checkReg()\"/>");
		out.println("			</td>");
		out.println("		</tr>");
		//����
		out.println("		</table>");
		out.println("</form>");
		out.println("<html>");
		out.println("	<body>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.println("		  <tr>");
		out.println("");
		out.println("		    <td height=\"17\" background=\"/ecport/images/bot_bg.gif\"></td>");
		out.println("		  </tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("		  <tr>");
		out.println("		    <td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.println("			<p align=\"center\">");
		out.println("				Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\">");
		out.println("");
		out.println("				<b><font face=\"Verdana,\">Tarena</font></b>");
		out.println("				<font color=#CC0000>.com.cn</font>");
		out.println("			</a></p><br>");
		out.println("		    </td>");
		out.println("		  </tr>");
		out.println("		</table>");
		out.println("	</body>");
		out.println("</html>");
		out.println("");
		
		out.close();
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}

}