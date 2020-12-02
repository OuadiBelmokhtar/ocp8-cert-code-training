package chap12;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBookTable {
	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			out.println("Connected to the PostgreSQL server successfully.");
			Statement stmt = conn.createStatement();
			String query = "CREATE TABLE Book(\n" + "ISBN INTEGER PRIMARY KEY,\n" + "Title TEXT,\n" + "PubDate DATE,\n"
					+ "Format TEXT,\n" + "UnitPrice NUMERIC(4,2)\n" + ");";
			// For DDL queries(CREATE, DROP) the return value is 0.
			int result = stmt.executeUpdate(query);
			out.println("Result of executing query is: " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
