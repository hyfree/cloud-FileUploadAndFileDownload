package Dao;

import java.sql.*;

public class ConnectionUtils {

	public static void main(String[] args){
		getConnection();

	}
	
	/**
	 * 连接数据库的共通文件
	 */
	public static Connection getConnection(){
		
		Connection conn=null;
		try {
			//1.加载驱动
			//Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("com.mysql.jdbc.Driver");
			//2.建立连接
			//jdbc:mysql://"+serverIP+":"+port+"/"+server
			conn=DriverManager.getConnection("jdbc:mysql://120.25.193.111:3306/mypet","admin","aK20Oz0tcSS5j30b");
			//conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle2","scott","tiger");
			//conn=DriverManager.getConnection("","","");
			if(conn!=null){
				
				 System.out.println("连接成功");
			}
			
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	//释放资源(查询):逆序释放
	public static void close(ResultSet rs,Statement st,Connection conn){
		
			try {
				if(rs!=null){
					rs.close();
				}
				if(st!=null){
					st.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
	
}
