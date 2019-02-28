package geo;

public class apples {
	public static void main (String[] args) {
		write_to_file m = new write_to_file();
		m.openFile();
		m.addRecords();
		m.closeFile();
		
		
		readfromfile r = new readfromfile();
		r.openFile();
		r.readFile();
		r.closeFile();
		
	}

}
