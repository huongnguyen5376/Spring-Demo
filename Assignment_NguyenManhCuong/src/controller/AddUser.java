package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserInfoDAO;
import model.UserInfo;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
  
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    response.setCharacterEncoding("UTF-8");
	    PrintWriter writer = response.getWriter();
	    // parameter trung voi name trong input
	    String userName = request.getParameter("userName");
	    String password = request.getParameter("passWord");
	    String repass = request.getParameter("repass");
	    UserInfo userInfo = new UserInfo();
	    if (!userName.isEmpty() && !password.isEmpty() && !repass.isEmpty()) {
	      if(password.equals(repass)) {
	          userInfo.setUsername(userName);
	          userInfo.setPassword(repass);
	        }
	    }
	    int userID = UserInfoDAO.insertUser(userInfo);
	    if (userID > 0) {
        writer.println("<script type=\"text/javascript\">");
        writer.println("alert('Đăng kí thành công !');");
        writer.println("location='signup.jsp';");
        writer.println("</script>");
	      //request.getRequestDispatcher("index.jsp").forward(request, response);
	    }
	    else {
        writer.println("<script type=\"text/javascript\">");
        writer.println("alert('Đăng kí thất bại !');");
        writer.println("location='signup.jsp';");
        writer.println("</script>");     
	    }
	    writer.close();	    
	}
}
