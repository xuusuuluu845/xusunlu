import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JDBCDome {
	private void textConnection() {
		try {
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//�������ݿ������ַ���
			String dbURL="jdbc:mysql://localhost:3306/text";
			//�������ݿ�����
			try {
				Connection connection=(Connection )DriverManager.getConnection(dbURL,"root","root");
				
	        }
			catch (SQLException e) {
	        	e.printStackTrace();
				// TODO: handle exception
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
	}
					
