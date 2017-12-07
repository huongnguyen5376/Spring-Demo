package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.UserInfoDAO;
import model.UserInfo;


@WebServlet("/AuthenticationUser")
public class AuthenticationUser extends HttpServlet {
  
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter writer = response.getWriter();
	    String userName = request.getParameter("userName");
	    String password = request.getParameter("passWord");
	    UserInfo info = UserInfoDAO.getUserInfo(userName, password);
	    if (info != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userName", userName);
			session.setAttribute("passWord", password);
      writer.println("<script type=\"text/javascript\">");
      writer.println("alert('Đăng nhập thành công');");
      writer.println("location='index.jsp';");
      writer.println("</script>");
		} 
	    else {
	    	writer.println("<script type=\"text/javascript\">");
	    	writer.println("alert('Đăng nhập thất bại ! Chuyển sang trang đăng kí');");
	    	writer.println("location='signup.jsp';");
	    	writer.println("</script>");	    	
	    	//request.getRequestDispatcher("index.jsp").include(request, response);  
		}
	}
}
