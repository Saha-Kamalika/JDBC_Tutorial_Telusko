import java.sql.*;
public class DAO {
	public static void main(String[] args) {
		DetailsDao dao=new DetailsDao();
		Details d1=dao.getDetails(3);
		System.out.println(d1.name);
	}
}
class DetailsDao{
	public Details getDetails(int id) {
		
		try {
			String url="jdbc:mysql://localhost:3306/mydata", uname="root", pass="";
			String query="select name from details where id="+id;
			Details d=new Details();
			d.id=id;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			d.name=name;
			return d;
	
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
class Details{
	int id;
	String name;
}
