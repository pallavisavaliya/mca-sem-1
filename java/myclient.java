import java.io.*;
import java.net.*;
public class myclient
{
	public static void main(String args[])
	{
		try
		{
		     Socket s = new Socket("localhost",6666);
			 DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			 dos.writeUTF("Janvi");
			 DataInputStream dis = new DataInputStream(s.getInputStream());
			 String str = (String)dis.readUTF();
			 
			 System.out.println("2: " +str);
			dos.flush();
			dos.close();
			s.close();
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}