package chap12;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoBookTable {
	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			out.println("Connected to the PostgreSQL server successfully.");
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO Book VALUES(1234,'The Lost Hero','2012-03-02','Paperback',10.95);\n"
					+ "INSERT INTO Book VALUES(343,'The Last Leopard','2008-12-02','Hardcover',16.95);\n"
					+ "INSERT INTO Book VALUES(653,'The Kane','2010-03-02','Hardcover',12.95);\n"
					+ "INSERT INTO Book VALUES(9833,'Survival Guide','2009-12-22','Hardcover',13.95);\n"
					+ "INSERT INTO Book VALUES(2343,'Freaky Monday','2011-01-02','Paperback',14.95);\n"
					+ "INSERT INTO Book VALUES(222,'Chronicles','2010-06-12','Hardcover',10.95);\n"
					+ "INSERT INTO Book VALUES(987,'The House of the Scorpion','2012-03-02','Paperback',6.95);\n"
					+ "INSERT INTO Book VALUES(332,'How to Train Your Dragon','2012-03-02','Hardcover',13.95);";

			// For INSERT, the returned result is 1, qlq soit le nombre de ligne inseres
			int nbrAffectedRows = stmt.executeUpdate(query);
			out.println(nbrAffectedRows + " rows was successfuly inserted: ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
