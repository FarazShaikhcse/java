import java.io.*;
import java.util.*;
public class Ranfile {
	private static final int REC_SIZE = 54;
	private static final int SURNAME_SIZE = 15;
	private static final int NUM_INITS = 6;
	private static long acctNum = 0;
	private static String surname, initials;
	private static float balance;
	public static void main(String[] args) throws IOException{
		RandomAccessFile ranAccts = new RandomAccessFile("accounts.dat", "rw");
		Scanner input = new Scanner(System.in);
		String reply ="y";
		do
		{
		acctNum++;
		System.out.println("\nAccount number " + acctNum + ".\n");
		System.out.print("Surname: "); surname = input.nextLine();
		System.out.print("Initial(s): ");   initials = input.nextLine();
		System.out.print("Balance: ");    balance = input.nextFloat();

		input.nextLine();
		writeRecord(ranAccts); 
		System.out.print("\nDo you wish to do this again (y/n)? ");
		reply = input.nextLine();
		} while (reply.equals("y")||reply.equals("Y"));

		System.out.println();
		showRecords(ranAccts);
		}
	public static void writeRecord(RandomAccessFile file) throws IOException
	{
		long filePos = (acctNum-1) * REC_SIZE; 
		file.seek(filePos); 		          
		file.writeLong(acctNum);
		writeString(file, surname, SURNAME_SIZE);
		writeString(file, initials, NUM_INITS);
		file.writeFloat(balance);
	}
	public static void writeString(RandomAccessFile file, String text, int fixedSize) 			throws IOException
	{
		int size = text.length();
	if (size<=fixedSize)
	{
	file.writeChars(text);
	for (int i=size; i<fixedSize; i++)
		file.writeChar(' ');
	}
	else 		
		file.writeChars(text.substring(0,fixedSize));
	}
	public static void showRecords(RandomAccessFile   file) throws IOException
	{
	long numRecords = file.length()/REC_SIZE;
	file.seek(0);
	for (int   i=0; i<numRecords; i++)
	{
	acctNum = file.readLong();
	surname = readString(file, SURNAME_SIZE);
		initials 	= readString(file, NUM_INITS);
		balance = file.readFloat();
		System.out.printf("" + acctNum+ " " + surname+ " " + initials +  " %.2f %n",balance);
	       }
	}
	public static String readString(RandomAccessFile file, int fixedSize)   throws 			IOException
	{
	String value = ""; 
	for (int i=0; i<fixedSize; i++)
		value+=file.readChar();
	return value;
	}
}
	


