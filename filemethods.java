package files;

import java.util.Scanner;
import java.io.*;
public class methods {
public static void main(String args[]) throws IOException
{
	String fname;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the file or directory");
	fname=input.nextLine();
	while(fname!=null) {
		File fdir=new File(fname);
	if(!fdir.exists()) {
		System.out.println(fname+" does not exist");
		
	}
	System.out.println(fname+ " is a ");
	if(fdir.isFile())
		System.out.println("file");
	else
		System.out.println("directory");
	System.out.print("It is");
	if(!fdir.canRead())
		System.out.println(" not");
	
		System.out.println(" readable");
	System.out.print("It is");
	if(!fdir.canWrite())
		System.out.print(" not");
	
		System.out.println(" writable");
	if(fdir.isDirectory())
	{
		System.out.println("CONTENTS ");
		String[] flist=fdir.list();
		for(int i=0;i<flist.length;i++)
			System.out.println(" "+flist[i]);
	}
	else
	System.out.println("Size of file: "+fdir.length());
	System.out.println("Enter name of next file/directory");
	fname=input.nextLine();
	}}
	
}
