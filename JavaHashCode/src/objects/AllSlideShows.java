package objects;

import java.util.ArrayList;
import java.util.List;

public class AllSlideShows {

    private List<SlideShow> slideShowList = new ArrayList<>();

    public AllSlideShows() {
    }


    public void addSlideShow(SlideShow slideShow)
    {
        slideShowList.add(slideShow);
    }
}
