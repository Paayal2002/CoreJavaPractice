import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");

			Statement st = con.createStatement();

			st.executeUpdate("insert into employee values(5,'Raam',45000)");

			System.out.println("Data Inserted");

			con.close();

		} catch (Exception e) {

			System.out.println(e);

		}
	}
}
