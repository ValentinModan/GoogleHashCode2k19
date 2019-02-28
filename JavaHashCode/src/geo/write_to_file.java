package geo;
import java.util.*;

import objects.Slide;
import objects.SlideShow;


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
			x.format("%d\n", SlideShow.getPictureList().size());
			
			//for (int i = 0; i <3; i++)
			//x.format("%s%s%s", "ala", " bala", " portocala\n");
			
			Iterator<Slide> it = SlideShow.getSlideList().iterator();
			while(it.hasNext()) {
				Slide currentSlide = it.next();
				
				if(currentSlide.isVertical() == true) {
					x.format("%d ", currentSlide.getFirst().getPictureId());
					x.format("%d\n", currentSlide.getSecond().getPictureId());
				}
				else
					x.format("%d\n", currentSlide.getFirst().getPictureId());
			}
			
		}
		
		public void closeFile() {
			x.close();
		}
}
