

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import openGaussPlatform.openGausslink;

/**
 * Servlet implementation class mingling
 */
@WebServlet("/mingling")
public class mingling extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mingling() {
        super();
        // TODO Auto-generated constructor stub
    }
    @SuppressWarnings("null")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        openGausslink obj=new openGausslink();
        //连接数据库
        Connection con= obj.GetConnection("jack", "Aowei103");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String strinG=request.getParameter("strinG");
            if(!strinG.isEmpty()) {
            String[] temp,temp1;
            strinG=strinG.replace("\n", "").replace("\r", "");//去除换行符
            temp=strinG.split(" ");
            String temp2=temp[0];//获取首个单词
            temp1=strinG.split("");
            String temp3=temp1[temp1.length-1];//获取最后一个字符
            String temp5=temp1[0];//获取第一个字符
            char temp6=temp5.charAt(0);//判断字符合法
            System.out.println(strinG);
            System.out.println(temp2);
            System.out.println(temp3);
            
            HttpSession session=request.getSession();
        	String user=(String)session.getAttribute("当前用户");
        	String sql="insert into history values('"+strinG+"','"+user+"')";
        	obj.insert(con, sql);
        	
        	if((temp6 >= 'a' && temp6 <= 'z') || (temp6 >= 'A' && temp6 <= 'Z')) {
            if(temp3.equals(";")) {//判断语句是否带‘;’  
            	
                try {            
                	PreparedStatement preparedStatement=con.prepareStatement(strinG);
                	if(temp2.equals("create")||temp2.equals("CREATE")) {//创建语句
                		preparedStatement.executeUpdate();
                		out.print("<script language='javascript'>alert('执行成功！已成功创建');window.location.href='main_system.jsp';</script>");
                	}else if(temp2.equals("insert")||temp2.equals("INSERT")) {//插入语句
                		int num=preparedStatement.executeUpdate();
                		out.print("<script language='javascript'>alert('执行成功！已成功插入"+num+"行');window.location.href='main_system.jsp';</script>");
                	}else if(temp2.equals("update")||temp2.equals("UPDATE")) {//更新数据语句
                		int num=preparedStatement.executeUpdate();
                		out.print("<script language='javascript'>alert('执行成功！已成功更新"+num+"行');window.location.href='main_system.jsp';</script>");
                	}else if(temp2.equals("truncate")||temp2.equals("TRUNCATE")) {//删除数据语句
                		preparedStatement.executeUpdate();
                		out.print("<script language='javascript'>alert('执行成功！已成功删除表数据');window.location.href='main_system.jsp';</script>");
                	}else if(temp2.equals("drop")||temp2.equals("DROP")) {//删除语句
                		preparedStatement.executeUpdate();
                		out.print("<script language='javascript'>alert('执行成功！已成功删除');window.location.href='main_system.jsp';</script>");
                	}else if(temp2.equals("alter")||temp2.equals("ALTER")) {//修改表语句
                		preparedStatement.executeUpdate();
                		out.print("<script language='javascript'>alert('执行成功！已成功修改');window.location.href='main_system.jsp';</script>");
                	}else if(temp2.equals("delete")||temp2.equals("DELETE")) {//删除指定数据语句
                		int num=preparedStatement.executeUpdate();
                		out.print("<script language='javascript'>alert('执行成功！已成功删除"+num+"行');window.location.href='main_system.jsp';</script>");
                	}else if(temp2.equals("select")||temp2.equals("SELECT")||temp2.equals("select*")||temp2.equals("SELECT*")||temp2.equals("select*from")||temp2.equals("SELECT*FROM")) {//查询语句
                		ResultSet rs=preparedStatement.executeQuery();
                		ResultSetMetaData md = rs.getMetaData();//获得结果集结构和数据
                		int num=md.getColumnCount();//获得列数
                		session.setAttribute("存在", 1);
                    	session.setAttribute("列数", num);
                    	int sum=0;
                    	String[] str=new String[100],str1=new String[1000];
                        while (rs.next()) {
                			for (int i = 1; i <= num; i++) {
                				str[i]=md.getColumnName(i);
                                str1[sum]=rs.getString(md.getColumnName(i));
                    			sum++;

                            }
                        }
                        session.setAttribute("列表数", sum);
                		session.setAttribute("属性名", str);
                		session.setAttribute("查询数据", str1);
                        out.print("<script language='javascript'>alert('执行成功！已成功查询');window.location.href='main_system.jsp';</script>");
                        rs.close();
                	}
                	else {
                		preparedStatement.executeQuery();
                	}               
                preparedStatement.close();
                con.close();
                }catch(Exception e) {
                	String wrong=e.getMessage();//获取错误信息
                	String[] temp4;
                	temp4=wrong.split("\n");
                	String[] wrong1=temp4[0].split("]");
                	System.out.println(wrong1[0]);
                	String sql1="update history set wrong='"+wrong1[1]+"' where sql='"+strinG+"'";
                	obj.insert(con, sql1);
                	out.print("<script language='javascript'>alert('"+wrong1[1]+"');window.location.href='main_system.jsp';</script>");
                }
            }else {
            	out.print("<script language='javascript'>alert(' ERROR: 句尾应该为分号！');window.location.href='main_system.jsp';</script>");
            	String sql1="update history set wrong=' ERROR: 句尾应该为分号！' where sql='"+strinG+"'";
            	obj.insert(con, sql1);
            }
        	}else {
            	out.print("<script language='javascript'>alert(' ERROR: 输入不合法！');window.location.href='guanli.jsp';</script>");
            	String sql1="update history set wrong=' ERROR: 输入不合法！' where sql='"+strinG+"'";
            	obj.insert(con, sql1);
            }
            }else {
            	out.print("<script language='javascript'>alert(' ERROR: 输入内容不能为空！');window.location.href='guanli.jsp';</script>");
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
