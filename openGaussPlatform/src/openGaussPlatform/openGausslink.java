package openGaussPlatform;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class openGausslink {
	//创建数据库连接
		public Connection GetConnection(String username, String passwd) {
		String driver = "org.postgresql.Driver";
		String sourceURL = "jdbc:postgresql://192.168.237.128:15400/db_tpcc";
		Connection conn = null;
		try {
		  //加载数据库驱动
		  Class.forName(driver).newInstance();
		} catch (Exception e) {
		  e.printStackTrace();
		  return null;
		}
		 
		try {
		  //创建数据库连接
		  conn = DriverManager.getConnection(sourceURL, username, passwd);
		  System.out.println("Connection succeed!");
		} catch (Exception e) {
		  e.printStackTrace();
		  return null;
		}
		 
		return conn;
		};
		
		public void closeconnection(Connection conn) {
			try {
				  conn.close();
				} catch (SQLException e) {
				  e.printStackTrace();
				}
		};
		
		public void insert(Connection conn,String sql) throws SQLException {
			PreparedStatement preparedStatement=conn.prepareStatement(sql);
			preparedStatement.executeUpdate();
		}
		
		public void add(Connection conn,String sql) throws SQLException{
			PreparedStatement preparedStatement=conn.prepareStatement(sql);
			preparedStatement.execute();
			preparedStatement.close();
			conn.close();
		}
	    public String query1(String sql,String code,String pass,Connection conn) throws SQLException
	    {
	    	PreparedStatement preparedStatement=conn.prepareStatement(sql);
	        ResultSet rs=preparedStatement.executeQuery();
	         String s="false";
	         while(rs.next())
	         {
	             String code1=rs.getString("code");
	             String pass1=rs.getString("password");
	             if(code.equals(code1)&&pass.equals(pass1))
	             {
	                 s=rs.getString("code1");
	                 break;
	             }
	         }
	         preparedStatement.close();
	         conn.close();
	         rs.close();
	         return s;
	    }
	    
}
