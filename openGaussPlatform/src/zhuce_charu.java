

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import openGaussPlatform.openGausslink;

/**
 * Servlet implementation class zhuce_charu
 */
@WebServlet("/zhuce_charu")
public class zhuce_charu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public zhuce_charu() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException{
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
        	try {
	           String code=request.getParameter("code");
	           String pass=request.getParameter("password");
	           String sql="insert into users values('"
	                  +code+"','"+pass+"','s');";
	           openGausslink obj=new openGausslink();
	           Connection con= obj.GetConnection("jack", "Aowei103");
	           System.out.println(sql);
	           obj.add(con,sql);
	           response.sendRedirect("index.jsp");
            }catch(Exception e) {
        	String wrong=e.getMessage();
        	System.out.println(wrong);
        	String[] temp4;
        	temp4=wrong.split("\n");
        	String[] wrong1=temp4[0].split("]");
        	System.out.println(wrong1[0]);
        	out.print("<script language='javascript'>alert('"+wrong1[1]+"');window.location.href='zhuce.jsp';</script>");
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
