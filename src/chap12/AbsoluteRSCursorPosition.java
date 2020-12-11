package chap12;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbsoluteRSCursorPosition {

	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			out.println("Connected to the PostgreSQL server successfully.");
			// Statement cree via la config desiree
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT firstname FROM Customer");
			int i = 1;
			// afficher tte les lignes, 8 en total
			while (rs.next()) {
				out.println(i + " " + rs.getObject("firstname").toString());
				i++;
			}
			// essayer de postionner le curseur à 10>nbrLigneTotal
			if (rs.absolute(10)) { // va se postionner sur la ligne apres 8. Va retourner false
				out.println("======"); // n est pas affichee
				int p = rs.getRow();
				out.println(p + ": " + rs.getObject("firstname").toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
