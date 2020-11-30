package chap12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllBobsCustomers {
	public static void main(String[] args) {

		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection connection = DriverManager.getConnection(URL, userName, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM Customer");
			while (rs.next()) {
				System.out.print(rs.getInt("CustomerID") + " ");
				System.out.print(rs.getString("firstname") + " ");
				System.out.print(rs.getString("lastname") + " ");
				System.out.print(rs.getString("email") + " ");
				System.out.println(rs.getString("phone") + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
