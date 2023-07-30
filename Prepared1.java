import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Prepared1 {
	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		int id,fc=0;
		String name;
		String url="jdbc:mysql://localhost:3306/mydata", uname="root", pass="********";
		String query="insert into students values (?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		System.out.println("Enter the no of entries: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		PreparedStatement st=con.prepareStatement(query);
		System.out.println("Enter student id: ");
		id=sc.nextInt();
		System.out.println("Enter student name: ");
		name=sc.next();
		st.setInt(1,id);
		st.setString(2, name);
		int c = st.executeUpdate();
		fc+=c;
		
		st.close();
		}
		System.out.println(fc+" row/s affected");
		con.close();
	}
}

