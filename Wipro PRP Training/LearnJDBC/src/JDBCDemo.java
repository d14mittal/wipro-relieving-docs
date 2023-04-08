import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String args[]) {
		String url="jdbc:mysql://localhost:3307/employees_database";
		try {
			//establish conn object
			Connection con=DriverManager.getConnection(url,"root", "DhruvMittal@99");
			//statement obj to send to the database
			Statement st= con.createStatement();
			//execute the statement obj
			int row=st.executeUpdate("update employees_tbl set salary=10000 where id=700;");
//			while(resultset.next()) {
//				System.out.println(resultset.getString("salary"));
//			}
			System.out.println("Insert executed "+row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while Insertion");
		}
	}
}
