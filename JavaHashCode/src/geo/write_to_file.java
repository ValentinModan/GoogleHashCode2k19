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
		
		/*public void addRecords(SlideShowOld SlideShowOld) {
			x.format("%d\n", SlideShowOld.getPictureOldList().size());
			
			//for (int i = 0; i <3; i++)
			//x.format("%s%s%s", "ala", " bala", " portocala\n");
			
			Iterator<SlideVertical> it = SlideShowOld.getVerticalSlideList().iterator();
			while(it.hasNext()) {
				SlideVertical currentVerticalSlide = it.next();
				
				if(currentVerticalSlide.isVertical() == true) {
					x.format("%d ", currentVerticalSlide.getFirst().getPictureId());
					x.format("%d\n", currentVerticalSlide.getSecond().getPictureId());
				}
				else
					x.format("%d\n", currentVerticalSlide.getFirst().getPictureId());
			}
			
		}*/
		
		public void closeFile() {
			x.close();
		}
}
