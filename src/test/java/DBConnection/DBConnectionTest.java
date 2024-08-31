package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Define the SQL Server class
		Class.forName("com.mysql.jdbc.Driver");
		
		String dbURL ="";
		String userName = "";
		String password ="";
		
		//Pass the DB URL , User name and password in DriverManager.getConnection
		Connection con = DriverManager.getConnection(dbURL,userName,password);
		
		//call the createStatement
		Statement statement = con.createStatement();
		
		//pass the sql query in  execute Query  function 
		ResultSet result = statement.executeQuery("Select * from employee;");
		while(result.next())
		{
			System.out.println(result.getString(1));
		}
	}

}
