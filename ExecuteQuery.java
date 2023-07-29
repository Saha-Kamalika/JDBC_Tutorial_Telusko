
import java.sql.*; //import the package
public class ExecuteQuery {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/mydata", uname="root", pass="kamalika01";
		//String query="select sname from students where sid=1";
		Class.forName("com.mysql.cj.jdbc.Driver"); //load and register the driver
		Connection con = DriverManager.getConnection(url,uname,pass); //build connection
		Statement st=con.createStatement(); //create the statement
		ResultSet rs=st.executeQuery("select * from students"); //execute the query
		while(rs.next()) {
		//String name=rs.getString("sname");  //process the query
		System.out.println(rs.getInt(1)+" "+rs.getString("sname"));
		}
		st.close(); //close
		con.close();
	}
}
