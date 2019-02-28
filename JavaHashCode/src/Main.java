import geo.Apples;
import geo.ReadFromFile;
import objects.AllPictures;
import objects.Picture;
import objects.SlideShow;
import rng.SlideShowGenerator;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        Apples.readData();

        //AllPictures.displayAllPictures();


        System.out.println("Displaying slides");

        SlideShow slideShowFinal = new SlideShow();
        int finalSum = 0;

        for(int i=1;i<=100;i++) {
            SlideShow slideShow = SlideShowGenerator.generateSlideShow(10000);
            int sum = slideShow.computeSum();

            if(sum>=finalSum)
            {
                if(slideShowFinal.slideList.size()<slideShow.slideList.size())
                slideShowFinal = slideShow;
                finalSum = sum;
            }

            AllPictures.copy();

        }

        slideShowFinal.displaySlideShow();

        System.out.println(slideShowFinal.computeSum());
    }
}
