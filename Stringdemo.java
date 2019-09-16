import java.util.Scanner;
public class Stringdemo {
public static void main(String args[])
{
	StringBuffer sd=new StringBuffer(40);
	sd.insert(0,"hello");
	System.out.println("String is "+sd);
	System.out.println("Length="+sd.length());
	System.out.println("Capacity="+sd.capacity());
	System.out.println("Reverse="+sd.reverse());
	sd.reverse();
	System.out.println("Character at 1 Before setCharAt(1):"+sd.charAt(1));
	sd.setCharAt(1, 'i');
	System.out.println("Character at 1 Before setCharAt(1):"+sd.charAt(1));
	char[] txt= new char[10];
	sd.getChars(0,2,txt,0);
	String txt1=String.valueOf(txt); 
	System.out.println("copied string is:"+txt1);
	sd.delete(2,5);
	System.out.println("String after deleting:"+sd);
	sd.insert(2,"how are you");
	System.out.println(sd);
	sd.replace(2,4,txt1);
	System.out.println("String after replacing:"+sd);
	
	
	
}
}
