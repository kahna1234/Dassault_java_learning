import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MyfileReader
{
	FileInputStream fin;
	
	MyfileReader(String fileName)
	{
		System.out.println("Trying to open the file");
		try
		{
			fin = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem1: "+e.getMessage());
		}
		System.out.println("File is opened.........");
	}

	void readFileData() {
		try {
		
		byte a = (byte)fin.read();
		while(a!=-1)
		{
			System.out.print((char)a);
			a = (byte)fin.read();
			Thread.sleep(10);
		}
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem2: "+e.getMessage());
    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("Problem3: "+e.getMessage());
	}
		
}
	void fileCloseData()
	{
		System.out.println("The file is closed");
	}
}
