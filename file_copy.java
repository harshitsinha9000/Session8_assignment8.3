//assignment 8.3

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class file_copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> cmd = new ArrayList<String>();
		cmd.add("Notepad.exe");
		cmd.add("c:\\java\\copyofreadfile.txt");
		//cmd.add("c:\\java\\readfile.txt");
		
		ProcessBuilder pb = new ProcessBuilder(cmd); 
		int i ;
		FileReader fr =  new FileReader("c:\\java\\readfile.txt");
		FileWriter fw =  new FileWriter("c:\\java\\copyofreadfile.txt");
		while((i=fr.read())!=-1)
			{
			  fw.write((char)i);
			}
		fr.close();
		fw.close();
		
		pb.start();
	}

}
