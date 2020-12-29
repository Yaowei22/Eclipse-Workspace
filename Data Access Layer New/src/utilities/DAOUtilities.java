package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtilities {

	/**
	 * This method returns a new connection each time it is called. 
	 * Make sure you have the correct jars for the JDBC driver installed on the Build Path
	 * @return a valid Connection object to the Database
	 * @throws SQLException, typically occurs if the connection URL, username or password are incorrect
	 * @throws ClassNotFoundException, typically occurs is the JDBC jar of the database server that you're using is not installed on the Build path
	 */
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		//The following line loads the JDBC driver for a particular database
		Class.forName("oracle.jdbc.OracleDriver");
		
		//The following variables may change depending on your Database used and credentials
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "revature";
		String password = "password";
		
		return DriverManager.getConnection(url, user, password);
	}
	
	public static void closeConnection(Connection connection) throws SQLException{
		connection.close();
	}
}
