package geo;
import java.io.*;
import java.util.*;

public class readfromfile {

	private Scanner s;

	public void openFile() {
	try {
		s = new Scanner(new File("data_in.txt"));
	}
	catch(Exception e) {
		System.out.println("could not find file");
	}
	}
	
	public void readFile() {
		while (s.hasNext()) {
			String a = s.next();
			String b = s.next();
			String c = s.next();
			
			System.out.printf("%s %s %s\n", a, b, c);
		}
	}
	
	public void closeFile() {
		s.close();
	}
}