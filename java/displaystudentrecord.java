//program number 9
import java.sql.*;

class displaystudentrecord
{
	//java-classpath .;mysql-connector-java-5.1.23-bin.jar displaystudentrecord
	
	public static void main(String[] args)
	{	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			Statement st=con.createStatement();			
			String str="select * from stud";
			ResultSet rs=st.executeQuery(str);
			while(rs.next())
			{
				System.out.println(" "+rs.getString("stud_id")+" "+rs.getString("stud_name")+" "+rs.getString("stud_city")+" "
				+rs.getString("stud_add"));
			}
			rs.close();
			st.close();
			con.close();
			System.out.println("successfully display");
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}