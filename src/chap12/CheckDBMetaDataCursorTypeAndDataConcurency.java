package chap12;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckDBMetaDataCursorTypeAndDataConcurency {

	public static void main(String[] args) {

		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			out.println("Connected to the PostgreSQL server successfully.");
			DatabaseMetaData dbmd = conn.getMetaData();
			
			if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				out.print("Supports TYPE_FORWARD_ONLY");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					out.println(" and supports CONCUR_UPDATABLE");
				}
			}
			
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				out.print("Supports TYPE_SCROLL_INSENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					out.println(" and supports CONCUR_UPDATABLE");
				}
			}
			
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				out.print("Supports TYPE_SCROLL_SENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					out.println(" and supports CONCUR_UPDATABLE");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
