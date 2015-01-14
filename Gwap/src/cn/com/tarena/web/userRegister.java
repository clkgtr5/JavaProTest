package cn.com.tarena.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class userRegister extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
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
		out.println("		<script language=\"javascript\" src=\"uservalidate.js\">");
		out.println("	       </script>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("");
		out.println("<!-- Header Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
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
		out.println("          <td width=\"10%\"><a href=\"toshoppingCart.asp\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
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
		out.println("");
		out.println("			<tr>");
		out.println("				<td width=\"65%\"><br>");
		out.println("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.println("				</td>");
		out.println("				<td width=\"35%\" align=\"right\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("");
		out.println("<!-- Header End -->");
		out.println("<!-- Body Start -->");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.println("			<tr>");
		out.println("				<td height=\"25\" valign=\"middle\">");
		out.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.println("					<a href=index.jsp>达内电子商务门户</a> → 用户注册");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		<form method=\"post\" name=\"reg\" onsubmit=\"return validate(this)\" action=\"productList\">");
		out.println("			<table class=\"tableborder1\" id=\"table1\" align=\"center\" cellpadding=\"3\" cellspacing=\"1\">");
		out.println("			<tbody>");
		out.println("			<tr>");
		out.println("				<td colspan=\"2\" align=\"center\" background=\"images/bg2.gif\" height=\"25\" valign=\"middle\">");
		out.println("				<font color=\"#ffffff\"><b>新用户注册</b></font></td>");
		out.println("");
		out.println("			</tr>");
		out.println("");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\" width=\"40%\"><b>用户名</b>:<br>");
		out.println("				英文字母或数字,最大长度8位</td>");
		out.println("				<td class=\"tablebody1\" width=\"60%\">");
		out.println("				<input maxlength=\"12\" size=\"32\" name=\"userid\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.println("				<font color=\"#ff0000\">*</font></td>");
		out.println("");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\" width=\"40%\"><b>密码</b>:<br>");
		out.println("				数字,6到8位");
		out.println("				</td>");
		out.println("				<td class=\"tablebody1\" width=\"60%\">");
		out.println("				<input maxlength=\"12\" size=\"32\" name=\"password\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"password\">");
		out.println("				<font color=\"#ff0000\">*</font></td>");
		out.println("");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\" width=\"40%\"><b>确认密码</b>:<br>");
		out.println("				数字,6到8位");
		out.println("				</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input maxlength=\"12\" size=\"32\" name=\"password2\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"password\">");
		out.println("				<font color=\"#ff0000\">*</font></td>");
		out.println("");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>所在地区</b>：</td>");
		out.println("				<td class=\"tablebody1\"> ");
		out.println("  			");
		out.println("				<select name=\"country\" onchange=\"javascript:initProvince(this.value)\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\">");
		out.println("					<option value=\"-1\">-----请选择(国家)-----</option>");
		out.println("					<option value=\"1\">中国</option>");
		out.println("");
		out.println("					<option value=\"2\">中国香港</option>");
		out.println("					<option value=\"3\">中国台湾</option>");
		out.println("				</select>");
		out.println("				<select name=\"province\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\">");
		out.println("					<option value=\"-1\">-----请选择(省)-----</option>");
		out.println("					<option value=\"1\">安徽</option>");
		out.println("					<option value=\"2\">北京</option>");
		out.println("");
		out.println("					<option value=\"3\">重庆</option>");
		out.println("					<option value=\"4\">福建</option>");
		out.println("					<option value=\"5\">广东</option>");
		out.println("					<option value=\"6\">甘肃</option>");
		out.println("					<option value=\"7\">广西</option>");
		out.println("					<option value=\"8\">贵州</option>");
		out.println("");
		out.println("					<option value=\"9\">河南</option>");
		out.println("					<option value=\"10\">湖北</option>");
		out.println("					<option value=\"11\">河北</option>");
		out.println("					<option value=\"12\">海南</option>");
		out.println("					<option value=\"13\">香港</option>");
		out.println("					<option value=\"14\">黑龙江</option>");
		out.println("");
		out.println("					<option value=\"15\">湖南</option>");
		out.println("					<option value=\"16\">吉林</option>");
		out.println("					<option value=\"17\">江苏</option>");
		out.println("					<option value=\"18\">江西</option>");
		out.println("					<option value=\"19\">辽宁</option>");
		out.println("					<option value=\"20\">澳门</option>");
		out.println("");
		out.println("					<option value=\"21\">内蒙古</option>");
		out.println("					<option value=\"22\">宁夏</option>");
		out.println("					<option value=\"23\">青海</option>");
		out.println("					<option value=\"24\">四川</option>");
		out.println("					<option value=\"25\">山东</option>");
		out.println("					<option value=\"26\">上海</option>");
		out.println("");
		out.println("					<option value=\"27\">陕西</option>");
		out.println("					<option value=\"28\">山西</option>");
		out.println("					<option value=\"29\">天津</option>");
		out.println("					<option value=\"30\">台湾</option>");
		out.println("					<option value=\"31\">新疆</option>");
		out.println("					<option value=\"32\">西藏</option>");
		out.println("");
		out.println("					<option value=\"33\">云南</option>");
		out.println("					<option value=\"34\">浙江</option>");
		out.println("					<option value=\"35\">其它</option>");
		out.println("				</select>");
		out.println("				<input size=\"8\" name=\"city\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">市/区/县</td>");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("");
		out.println("				<td class=\"tablebody1\"><b>联系地址1</b>:</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input size=\"64\" maxlength=\"32\" name=\"street1\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>联系地址2</b>:</td>");
		out.println("");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input size=\"64\" maxlength=\"32\" name=\"street2\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>邮编</b>:</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input size=\"32\" maxlength=\"8\" name=\"zip\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.println("");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>家庭电话</b>:</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input size=\"32\" maxlength=\"16\" name=\"homephone\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.println("				</td>");
		out.println("");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>办公室电话</b>:</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input size=\"32\" maxlength=\"16\" name=\"officephone\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("");
		out.println("				<td class=\"tablebody1\"><b>手机</b>:</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input size=\"32\" maxlength=\"16\" name=\"cellphone\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\" type=\"text\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>Email地址</b>:<br>");
		out.println("");
		out.println("				请输入有效的邮件地址</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input size=\"32\" maxlength=\"50\" name=\"email\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: rgb(0, 0, 0);\"></td>");
		out.println("			</tr>");
		out.println("			");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody2\" colspan=\"2\" align=\"center\" valign=\"middle\">");
		out.println("				<input value=\"注 册\" type=\"submit\" onclick=\"productList\">&nbsp;&nbsp;");
		out.println("				<input value=\"清 除\" type=\"reset\"></td>");
		out.println("");
		out.println("			</tr>");
		out.println("			</tbody>");
		out.println("			</table>");
		out.println("		</form>");
		out.println("<!-- Body End -->");
		out.println("<!-- Footer Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.println("			<tr>");
		out.println("				<td height=\"17\" background=\"images/bot_bg.gif\">");
		out.println("				</td>");
		out.println("");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("			<tr>");
		out.println("				<td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.println("					<p align=\"center\">");
		out.println("						Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\"><b>Tarena</b><font color=\"red\">.com.cn</font></a>");
		out.println("");
		out.println("					</p>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("<!-- Footer End -->");
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