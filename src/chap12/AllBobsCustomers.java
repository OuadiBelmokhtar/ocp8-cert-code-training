package chap12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.lang.System.*;

public class AllBobsCustomers {
	public static void main(String[] args) {

		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			out.println("Connected to the PostgreSQL server successfully.");
			Statement stmt = conn.createStatement();
			String query="SELECT * FROM Customer";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				out.print(rs.getInt("CustomerID") + " ");
				out.print(rs.getString("firstname") + " ");
				out.print(rs.getString("lastname") + " ");
				out.print(rs.getString("email") + " ");
				out.println(rs.getString("phone") + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
