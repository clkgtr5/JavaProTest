package cn.com.tarena.web.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.tarena.service.impl.ContactInfoServiceImpl;
import cn.com.tarena.service.impl.OrderlistServiceImpl;
import cn.com.tarena.service.impl.UserServiceImpl;
import cn.com.tarena.service.impl.productServiceImpl;
import cn.com.tatena.service.ProductListService;
import cn.com.tatena.service.contactInfoService;
import cn.com.tatena.service.orderListService;
import cn.com.tatena.service.userListService;

public class controllerServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String path = req.getServletPath();
		
		 path = path.substring(0,path.indexOf("."));
		
		 if("/touserManager".equals(path)){
			try{
				userListService userService = new UserServiceImpl();
							
				List usersList = userService.getuserList();
	
				req.setAttribute("usersList", usersList);
				
				 getServletContext().getRequestDispatcher("/userManager").forward(req, resp);
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				 getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}
		}
		 else if("/touserModify".equals(path)){
			 try{
				 					 
				 	contactInfoService contactService = new ContactInfoServiceImpl();
					
					List contactInfoList = contactService.getContactInfoList();
					
					userListService userService = new UserServiceImpl();
					
					List usersList = userService.getuserList();
										
					
					req.setAttribute("usersList", usersList);
					
					req.setAttribute("contactInfoList", contactInfoList);
					
					 getServletContext().getRequestDispatcher("/userModify").forward(req, resp);
				} catch (Exception e){
					req.setAttribute("message", e.getMessage());
					
					 getServletContext().getRequestDispatcher("/error").forward(req, resp);
				}
		 }
		 else if("/touserRegister".equals(path)){
			 try{
				 	
					
					 getServletContext().getRequestDispatcher("/userRegister").forward(req, resp);
				} catch (Exception e){
					req.setAttribute("message", e.getMessage());
					
					 getServletContext().getRequestDispatcher("/error").forward(req, resp);
				}
		 }
		 
		 else if("/tologin".equals(path)){
			 try{
				 	
					
					 getServletContext().getRequestDispatcher("/login").forward(req, resp);
				} catch (Exception e){
					req.setAttribute("message", e.getMessage());
					
					 getServletContext().getRequestDispatcher("/error").forward(req, resp);
				}
		 }
		 else if("/toproductList".equals(path)){ 
				try{ 
		 				ProductListService productService = new productServiceImpl(); 
					 
		 				List productList = productService.getProductList(); 
		 				 
		 				
		 				
		 				req.setAttribute("productList", productList); 
		 				 
		 			getServletContext().getRequestDispatcher("/productList").forward(req, resp); 
		 			 
				} catch (Exception e){ 
		 			req.setAttribute("message", e.getMessage()); 
		 			 
					getServletContext().getRequestDispatcher("/error").forward(req, resp); 
		 		}			 
		 	} 
			else if("/toorderList".equals(path)){ 
				try{ 
		 				orderListService orderService = new OrderlistServiceImpl(); 
					 
		 				List orderList = orderService.getOrderList(); 
		 				 
		 				req.setAttribute("orderList", orderList); 
		 				 
		 			getServletContext().getRequestDispatcher("/orderList").forward(req, resp); 
		 			 
				} catch (Exception e){ 
		 			req.setAttribute("message", e.getMessage()); 
		 			 
					getServletContext().getRequestDispatcher("/error").forward(req, resp); 
		 		}			 
		 	} 
		 	else if("/toorderdetail".equals(path)){ 
				try{ 
					orderListService orderlistserver = new OrderlistServiceImpl();
					contactInfoService contactInfoserver=new ContactInfoServiceImpl();
					
					List productDetailList = orderlistserver.getOrderList();
					List contactInfoList=contactInfoserver.getContactInfoList();
		 				 
		 				req.setAttribute("productDetailList", productDetailList); 
		 				req.setAttribute("contactInfoList", contactInfoList);
		 				 
		 			getServletContext().getRequestDispatcher("/orderDetail").forward(req, resp); 
		 			 
				} catch (Exception e){ 
		 			req.setAttribute("message", e.getMessage()); 
		 			 
					getServletContext().getRequestDispatcher("/error").forward(req, resp); 
		 		}
			}else if("/toproductDetail".equals(path)){ 
				try{ 
					
					String productid=req.getParameter("id");
					
					ProductListService productService = new productServiceImpl();
								
					List productList = productService.getProductList();
					  
					req.setAttribute("productList", productList);
		 			
					getServletContext().getRequestDispatcher("/productDetail").forward(req, resp); 
		 			 
				} catch (Exception e){ 
		 			req.setAttribute("message", e.getMessage()); 
		 			 
					getServletContext().getRequestDispatcher("/error").forward(req, resp); 
		 		}			 
		 }
		 else if("/toshoppingCart".equals(path)){ 
				try{ 
										
					getServletContext().getRequestDispatcher("/shoppingCart").forward(req, resp); 
		 			 
				} catch (Exception e){ 
		 			req.setAttribute("message", e.getMessage()); 
		 			 
					getServletContext().getRequestDispatcher("/error").forward(req, resp); 
		 		}			 
		 } else if("/toorderConfirm".equals(path)){ 
				try{ 
										
					getServletContext().getRequestDispatcher("/orderConfirm").forward(req, resp); 
		 			 
				} catch (Exception e){ 
		 			req.setAttribute("message", e.getMessage()); 
		 			 
					getServletContext().getRequestDispatcher("/error").forward(req, resp); 
		 		}			 
		 } 		
		 else {
			  resp.sendError(resp.SC_NOT_FOUND);
		 }
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
