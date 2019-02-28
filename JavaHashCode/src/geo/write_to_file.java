package geo;
import java.util.*;


public class write_to_file {
		private Formatter x; 
		public void openFile() {
			try {
				x = new Formatter("data_out.txt");
			}
			catch(Exception e) {
				System.out.println("You have errr");
		    }
	   }
		
		public void addRecords() {
			for (int i = 0; i <3; i++)
			x.format("%s%s%s", "ala", " bala", " portocala\n");
		}
		
		public void closeFile() {
			x.close();
		}
}
