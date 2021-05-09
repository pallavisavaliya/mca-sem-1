//progrramme 17
import java.net.*;
import java.io.*;

class ArithmeticServer_17{
	public static void main(String [] args){
		
		try{
				
				ServerSocket ss = new ServerSocket(50001);
				while(true){			
					
					Socket s  = ss.accept();
					InputStream is = s.getInputStream();
					OutputStream os = s.getOutputStream();
					
					
					DataInputStream dis=new DataInputStream(is);
							
					double d1  = Double.parseDouble(dis.readUTF());
					double d2  = Double.parseDouble(dis.readUTF());
					String op  = dis.readUTF();
					
					DataOutputStream dos=new DataOutputStream(os);  
					
					if(d1>d2){
						dos.writeUTF("maximum number is" + d1);
						
					}else {
						dos.writeUTF("maximum number is" + d2);
					}
										
					
					
					dos.flush();
									
					
					s.close();		
				}
		}catch(UnknownHostException unhe){
			unhe.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
}