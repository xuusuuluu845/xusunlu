package u1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDome {
	@SuppressWarnings("unused")
	private void textConnection() {
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//创建数据库连接字符串
			String dbURL="jdbc:mysql://localhost:3306/text";
			//建立数据库连接
			try {
				Connection connection=(Connection )DriverManager.getConnection(dbURL,"root","root");
				
	        }
			catch (SQLException e) {
	        	e.printStackTrace();
	        	}
				// TODO: handle exception
			}
			
			 catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		
		}
	public static void main() {
		JDBCDome jdbcDome = new JDBCDome();
		jdbcDome.textConnection();
		
	}
	}
					


