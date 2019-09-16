package files;
import java.io.*;
import java.util.*;
public class file1 {
public static void main(String args[]) throws FileNotFoundException
{
	boolean i;
	System.out.println("Enter file1 name");
	Scanner r1=new Scanner(System.in);
	String f1=r1.nextLine();
	Scanner file1=new Scanner(new File(f1));
	

	System.out.println("Enter file2 name");
	Scanner r2=new Scanner(System.in);
	String f2=r2.nextLine();
	Scanner file2=new Scanner(new File(f2));
	System.out.println("Enter file3 name");
	Scanner r3=new Scanner(System.in);
	String f3=r3.nextLine();
	PrintWriter file3=new PrintWriter(new File(f3));;

	FileInputStream f11=new FileInputStream(f1);
	while(file1.hasNext())
	{
		String m=file1.nextLine();
		file3.println(m);
	}
	while(file2.hasNext())
	{
		String m=file2.nextLine();
		file3.println(m);
	}
	file1.close();
	file2.close();
	file3.close();
	
}
}
