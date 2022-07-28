import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("The file is opening");
			FileInputStream fin = new FileInputStream("C:\\Users\\ASI54\\Desktop\\Notepad Documents\\PPTtools.txt");
			
			FileInputStream fin1 = new FileInputStream("C:\\Users\\ASI54\\Desktop\\Notepad Documents\\hitoall.txt");
	
			FileInputStream fin2 = new FileInputStream("C:\\Users\\ASI54\\Desktop\\Notepad Documents\\Enhancement.txt");
			System.out.println("The file is opened");
			
			byte a = (byte)fin.read();
			while(a!=-1)
			{
				System.out.print((char)a);
				a = (byte)fin.read();
				Thread.sleep(10);
			}
//			System.out.println("File is trying to close");
			fin.close();
			
			
			byte b = (byte)fin1.read();
			while(b!=-1)
			{
				System.out.print((char)b);
				b = (byte)fin1.read();
				Thread.sleep(10);
			}
//			System.out.println("File is trying to close");
			fin1.close();
			
			
			byte c = (byte)fin2.read();
			while(c!=-1)
			{
				System.out.print((char)c);
				c = (byte)fin2.read();
				Thread.sleep(10);
			}
			System.out.println("File is trying to close");
			fin2.close();
			System.out.println("File is closed");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem1: "+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem2: "+e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem3: "+e.getMessage());
		}

	}

}


/*
 standard input                               standard output
 device 
 |
 System.in                                
 
 
                 Your Java Program
                      |
                Data + function



*/