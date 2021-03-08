package driver;


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
				
				//public static void executeStatement(Connection con){
				
				//result set is created by calling the executeQuery method of the SQLServerStatement 
				//class. Data from the result set is then displayed by using the getString method of 
				//the SQLServerResultSet class.
				    try(Statement stmt = myConn.createStatement();) {
				        String SQL = "SELECT TOP 10 * FROM Person.Contact";
				        ResultSet rs = stmt.executeQuery(SQL);

				        while (rs.next()) {
				            System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
				        }
				    }
				    // Handle any errors that may have occurred.
				    catch (SQLException e) {
				        e.printStackTrace();
				    }
				//}
			}catch (Exception e) {
				e.printStackTrace();
			}

	}
}
