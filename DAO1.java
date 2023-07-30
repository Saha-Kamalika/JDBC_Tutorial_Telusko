import java.sql.*;
public class DAO1 {
	public static void main(String[] args) {
		DetailsDao1 dao=new DetailsDao1();
		Details1 d=new Details1();
		d.id=4;
		d.name="bishtu";
		dao.addDetails(d);
	}
}
class DetailsDao1{
	public void addDetails(Details1 d) {
		try {
			String url="jdbc:mysql://localhost:3306/mydata", uname="root", pass="";
			String query="insert into details values (?,?)";
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			PreparedStatement st=con.prepareStatement(query);
			st.setInt(1, d.id);
			st.setString(2, d.name);
			st.executeUpdate();
			st.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Details1{
	int id;
	String name;
}
