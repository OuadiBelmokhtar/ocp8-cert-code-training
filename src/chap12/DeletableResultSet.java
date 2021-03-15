package chap12;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletableResultSet {

	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			out.println("Connected to the PostgreSQL server successfully.");
			// using an UPDATABLE RS
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("SELECT ISBN, title, unitprice FROM book");
			
			out.println("## All books");
			while (rs.next()) {
				out.println(rs.getString("title") + " " + rs.getFloat("unitprice"));
			}
			// positionner le curseur surla ligne 2
			rs.absolute(2);
			// supprimer la ligne courante
			rs.deleteRow();
			
			// reinitialiser la position du curseur
			rs.beforeFirst();
			// Afficher ttes les lignes
			out.println("\n## All books after update");
			while (rs.next()) {
				out.println(rs.getString("title") + " " + rs.getFloat("unitprice"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
