package openGaussjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
public class Gaussjdbc {
	//�������ݿ����ӡ�
	public static Connection GetConnection(String username, String passwd) {
	String driver = "org.postgresql.Driver";
	String sourceURL = "jdbc:postgresql://192.168.237.128:15400/db_tpcc";
	Connection conn = null;
	try {
	  //�������ݿ�������
	  Class.forName(driver).newInstance();
	} catch (Exception e) {
	  e.printStackTrace();
	  return null;
	}
	 
	try {
	  //�������ݿ����ӡ�
	  conn = DriverManager.getConnection(sourceURL, username, passwd);
	  System.out.println("Connection succeed!");
	} catch (Exception e) {
	  e.printStackTrace();
	  return null;
	}
	 
	return conn;
	};
	
//	//ִ����ͨSQL��䣬����customer_t1��
//	public static void CreateTable(Connection conn) {
//	Statement stmt = null;
//	try {
//	  stmt = conn.createStatement();
//	 
//	  //ִ����ͨSQL��䡣
//	  int rc = stmt
//	      .executeUpdate("CREATE TABLE customer_t1(c_customer_sk INTEGER, c_customer_name VARCHAR(32));");
//	 
//	  stmt.close();
//	} catch (SQLException e) {
//	  if (stmt != null) {
//	    try {
//	      stmt.close();
//	    } catch (SQLException e1) {
//	      e1.printStackTrace();
//	    }
//	  }
//	  e.printStackTrace();
//	}
//	}
//	 
//	//ִ��Ԥ������䣬�����������ݡ�
//	public static void BatchInsertData(Connection conn) {
//	PreparedStatement pst = null;
//	 
//	try {
//	  //����Ԥ������䡣
//	  pst = conn.prepareStatement("INSERT INTO customer_t1 VALUES (?,?)");
//	  for (int i = 0; i < 3; i++) {
//	    //��Ӳ�����
//	    pst.setInt(1, i);
//	    pst.setString(2, "data " + i);
//	    pst.addBatch();
//	  }
//	  //ִ��������
//	  pst.executeBatch();
//	  pst.close();
//	} catch (SQLException e) {
//	  if (pst != null) {
//	    try {
//	      pst.close();
//	    } catch (SQLException e1) {
//	    e1.printStackTrace();
//	    }
//	  }
//	  e.printStackTrace();
//	}
//	}
//	 
//	//ִ��Ԥ������䣬�������ݡ�
//	public static void ExecPreparedSQL(Connection conn) {
//	PreparedStatement pstmt = null;
//	try {
//	  pstmt = conn
//	      .prepareStatement("UPDATE customer_t1 SET c_customer_name = ? WHERE c_customer_sk = 1");
//	  pstmt.setString(1, "new Data");
//	  int rowcount = pstmt.executeUpdate();
//	  pstmt.close();
//	} catch (SQLException e) {
//	  if (pstmt != null) {
//	    try {
//	      pstmt.close();
//	    } catch (SQLException e1) {
//	      e1.printStackTrace();
//	    }
//	  }
//	  e.printStackTrace();
//	 }
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ݿ����ӡ�
		Connection conn = GetConnection("jack", "Aowei103");
		 
//		//������
//		CreateTable(conn);
//		 
//		//�������ݡ�
//		BatchInsertData(conn);
//		 
//		//ִ��Ԥ������䣬�������ݡ�
//		ExecPreparedSQL(conn);
		 
		//�ر����ݿ����ӡ�
		try {
		  conn.close();
		} catch (SQLException e) {
		  e.printStackTrace();
		}
	}

}
