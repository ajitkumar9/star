import con.Data1;
import java.io.*;
import java.sql.*;
class D1
{

	public static PreparedStatement ps;
	public static ResultSet rs;
	public static Statement stmt;
	public static Connection conn1=Data1.Getconnection();


	void insert()throws Exception
	{
		System.out.println("ajitknfjds");
		String TableName;

		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the table name");

		TableName=in.readLine();
		String q="insert into "+TableName+" values";
		System.out.println(q);
		ps=conn1.prepareStatement("insert into "+TableName+" (username,password) values(?,?)");
		System.out.println("enter the user");
		String u=in.readLine();
		System.out.println("enter look pass");
		System.out.println("ajitkumar");
		
		String p=in.readLine();

		ps.setString(1,u);
		ps.setString(2,p);
		ps.executeUpdate();
		System.out.println("record");
	}
}
class User
{
	public static void main(String args[])throws Exception
	{

		D1 ob=new D1();
		ob.insert();
	}
} 
