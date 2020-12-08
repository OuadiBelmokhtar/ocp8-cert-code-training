/**
 * 
 */
package chap12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import static java.lang.System.out;

/**
 * @author ouadi
 *
 */
public class GetResultSetMetaData {
	public static void main(String[] args) {
		String URL = "jdbc:postgresql://localhost:5432/booksellerdb"; // port is optional
		String userName = "postgres";
		String password = "postgrespass";
		try {
			Connection conn = DriverManager.getConnection(URL, userName, password);
			Statement stmt = conn.createStatement();
			String query = "SELECT CustomerID FROM Customer";
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCount = rsmd.getColumnCount();
			out.println("Columns count: "+colCount); // 1
			for (int i = 1; i <= colCount; i++) {
				out.println(rsmd.getTableName(i));// customer
				out.println(rsmd.getColumnName(i));// customerid
				out.println(rsmd.getColumnTypeName(i));// int4
				out.println(rsmd.getColumnDisplaySize(i));// 11
				out.println(rsmd.getColumnClassName(i));// java.lang.Integer
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
