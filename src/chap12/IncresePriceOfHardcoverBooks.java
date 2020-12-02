package chap12;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IncresePriceOfHardcoverBooks {
	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			out.println("Connected to the PostgreSQL server successfully.");
			Statement stmt = conn.createStatement();
			String query = "UPDATE Book SET UnitPrice=8.95 WHERE UnitPrice<13 AND Format='Hardcover'";
			// returns nbr of rows updated
			int nbrAffectedRows = stmt.executeUpdate(query);
			out.println(nbrAffectedRows + " rows was successfuly updated: ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
