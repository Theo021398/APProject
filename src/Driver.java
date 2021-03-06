

import java.sql.*;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
			String url = "idbc:mysql://localhost:3306/";
			Connection myConn = null;
			
			try {
				myConn = DriverManager.getConnection(url, "teacher","pssword");
				
				if (myConn != null) {
					JOptionPane.showMessageDialog(null, "Connectes to local Server", "JDBC Connection Status", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}

	}
}
