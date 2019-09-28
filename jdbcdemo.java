package jdbc;

import java.sql.*;
import java.util.*;
public class jdbcdemo {
	static Connection conn;
	static Statement stm;
	static ResultSet rs;
    jdbcdemo() throws SQLException{
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
    	stm=conn.createStatement();
    }
    void displayinfo() throws SQLException
    {
    	String s="SELECT * FROM accounts";
    	rs=stm.executeQuery(s);
    	while(rs.next())
    	{
    		System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
    	}
    }
    void insertinfo() throws SQLException
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter accountno");
    	int rno=s.nextInt();
    	System.out.println("Enter name");
    	Scanner s1=new Scanner(System.in);
    	String name=s1.nextLine();
    	try{
    		String st="insert into accounts values("+rno+",'"+name+"');";
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
    		System.out.println("Enter accountno");
    		int rno1=r1.nextInt();
        	String s2="DELETE FROM accounts WHERE accno="+rno1;
        	stm.executeUpdate(s2);
        	System.out.println("deleted");
    	}
    	void closeon() throws SQLException
    	{
    		rs.close();
    		stm.close();
    	conn.close();	
    	}
    	
    
	public static void main(String[] args) throws SQLException {
	boolean f=true;
	jdbcdemo db=new jdbcdemo();
	while(f)
	{
		System.out.println("1:insert 2:delete 3:display 4:exit");
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
		case 4:f=false;
		
		}
		}
	db.closeon();
	}
	}


