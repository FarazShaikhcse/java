package jdbc;
import java.io.*;
import java.sql.*;
import java.util.*;
public class jdbc2 {
	static Connection conn;
	static Statement stm;
	static ResultSet rs;
	jdbc2() throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://172.16.2.3/student","student", "student");
		}
		catch(ClassNotFoundException cnfex)
    	{
    		System.out.println("Unable to load driver");
    		System.exit(1);
    	}
    	catch(SQLException ex)
    	{
    		System.out.println("cannot connect to database");
    		System.exit(1);
    	}
		stm=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);
	}
	 void displayinfo() throws SQLException
	    {
	    	String s="SELECT * FROM st061";
	    	rs=stm.executeQuery(s);
	    	while(rs.next())
	    	{
	    		System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
	    	}
	    }
	 void insertinfo() throws SQLException
	    {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter rollno");
	    	int rno=s.nextInt();
	    	System.out.println("Enter name");
	    	Scanner s1=new Scanner(System.in);
	    	String name=s1.nextLine();
	    	
	    	try{
	    		String st="insert into st061 values("+rno+",'"+name+"');";
	    		 stm.executeUpdate(st);
	    				}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    	System.out.println("1 row affected");	
	    }
	 void deleteinfo() throws SQLException
 	{
 		Scanner r1=new Scanner(System.in);
 		System.out.println("Enter rollno");
 		int rno1=r1.nextInt();
     	String s2="DELETE FROM st061 WHERE rollno="+rno1;
     	stm.executeUpdate(s2);
     	System.out.println("deleted");
 	}
	 void updateinfo() throws SQLException
	 {
		 Scanner r=new Scanner(System.in);
		 System.out.println("Enter rollno");
		 int no=r.nextInt();
		 Scanner r2=new Scanner(System.in);
		 System.out.println("Enter new name");
		 String name=r2.nextLine();
		 String s3="update st061 set name='"+name+"' where rollno="+no;
	     stm.executeUpdate(s3);
		 System.out.println("Database updated");
	 }
	 void closeon() throws SQLException
 	{
 		rs.close();
 		stm.close();
 	conn.close();	
 	}
	public static void main(String[] args) throws SQLException{
		boolean f=true;
		jdbc2 db=new jdbc2();
		while(f)
		{
			System.out.println("1:insert 2:delete 3:display 4:update 5:exit");
			System.out.println("enter your option");
			Scanner s=new Scanner(System.in);
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:db.insertinfo();
			break;
			case 2:db.deleteinfo();
			break;
			case 3:db.displayinfo();
			break;
			case 4:db.updateinfo();
			break;
			case 5:f=false;
			
			}
			}
		db.closeon();
		}
		}

	