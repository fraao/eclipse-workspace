

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import openGaussPlatform.openGausslink;

/**
 * Servlet implementation class login_yanzheng
 */
@WebServlet("/login_yanzheng")
public class login_yanzheng extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login_yanzheng() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String code=request.getParameter("code");
            String pass=request.getParameter("pass");
            openGausslink obj=new openGausslink();
            Connection con= obj.GetConnection("jack", "Aowei103");
            String sql="select * from users;";
            String s=obj.query1(sql,code,pass,con);
            if(s.equals("false"))
            {
                out.print("<script language='javascript'>alert('用户信息出错');window.location.href='index.jsp';</script>");
            }
            else if(s.equals("s"))
            {
            	HttpSession session=request.getSession();
            	session.setAttribute("当前用户", code);
                //out.print("<script language='javascript'>alert('登录成功！');window.location.href='main_system.jsp';</script>");
                out.print("<script>window.location.href='main_system.jsp';</script>");
            }else if(s.equals("t")) {
            	HttpSession session=request.getSession();
            	session.setAttribute("当前用户", code);
            	//out.print("<script language='javascript'>alert('登录成功！');window.location.href='guanli.jsp';</script>"); 
            	out.print("<script>window.location.href='guanli.jsp';</script>");
            }
        }
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
