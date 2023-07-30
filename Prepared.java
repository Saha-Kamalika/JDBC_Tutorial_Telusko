import java.sql.*;
public class Prepared {
	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/mydata", uname="root", pass="kamalika01";
		String query="insert into students values (?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,4);
		st.setString(2, "Srijit");
		int c = st.executeUpdate();
		System.out.println(c+" row/s affected");
		st.close();
		con.close();
	}
}
