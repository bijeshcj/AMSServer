package com.ams.authentications;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ams.models.Admin;

/**
 * Servlet implementation class LoginAuthentication
 */
@WebServlet("/LoginAuthentication")
public class LoginAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAuthentication() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html><head><title>Login Authentication</title></head><body>");
		
		if(isValidUser(getAdmin(request.getParameter("admin"), request.getParameter("password"))))
		 out.println("<p> Successfully logged in buddy!!!! </body></html>");
		 else
			 out.println("<p> Invalid user credentials Check your admin name or password </body></html>");
	}
	
	private Admin getAdmin(String admin,String password){
		return new Admin(admin,password);
	}
	
	private boolean isValidUser(Admin admin){
		boolean retFlag = false;
		if((admin.getAdminName() != null && admin.getPassword() != null) && (admin.getAdminName().equals("admin") && admin.getPassword().equals("password"))){
			retFlag = true;
		}
		return retFlag;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
