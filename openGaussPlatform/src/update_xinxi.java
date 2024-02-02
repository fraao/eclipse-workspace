

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import openGaussPlatform.openGausslink;

/**
 * Servlet implementation class update_xinxi
 */
@WebServlet("/update_xinxi")
public class update_xinxi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update_xinxi() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        	String code=request.getParameter("id");
            if(code.charAt(0)=='Y')
            {    
                HttpSession session=request.getSession();
                String sql="delete from users where code='"+code.substring(1)+"';";
                openGausslink obj=new openGausslink();
            	Connection con= obj.GetConnection("jack", "Aowei103");
            	PreparedStatement preparedStatement=con.prepareStatement(sql);
            	preparedStatement.executeUpdate();
                request.getRequestDispatcher("xinxi_guanli.jsp").forward(request,response);
            }
            else if(code.charAt(0)=='X')
            {
                HttpSession session=request.getSession();
                session.setAttribute("当前操作用户",code.substring(1));
                request.getRequestDispatcher("pass_update1.jsp").forward(request, response);
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
