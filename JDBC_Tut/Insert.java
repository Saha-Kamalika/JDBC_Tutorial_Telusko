import java.sql.*;
public class Insert {
	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/mydata", uname="root",pass="********";
		int studentId=3;
		String studentName="Kamalika";
		String query="insert into students values("+ studentId+",'" +studentName+ "')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		int c=st.executeUpdate(query);
		System.out.println(c+" row/s affected");
		st.close();
		con.close();
	}
}
