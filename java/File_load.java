import java.io.*;

class File_load{
	public static void main(String [] args){
		try{
			File f = new File("D:\\MCA DATA\\JAVA\\javaprect\\abc.txt");
			
			if(!f.exists()){
				System.out.println("File not found");
				System.exit(0);
			}
						
			FileReader fr = new FileReader(f);
			
			int c=0;
			while((c=fr.read())!=-1){
				System.out.print("" + (char)c);
			}
			fr.close();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();			
		}catch(IOException ioe){
			ioe.printStackTrace();			
		}
	}
}