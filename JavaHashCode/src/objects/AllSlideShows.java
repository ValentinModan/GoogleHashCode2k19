package objects;

import java.util.ArrayList;
import java.util.List;

public class AllSlideShows {

    private List<SlideShowOld> slideShowOldList = new ArrayList<>();

    public AllSlideShows() {
    }


    public void addSlideShow(SlideShowOld slideShowOld)
    {
        slideShowOldList.add(slideShowOld);
    }
}
