import geo.Apples;
import geo.write_to_file;
import objects.AllPictures;
import objects.SlideShow;
import rng.SlideShowGenerator;

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

        write_to_file wtf = new write_to_file();

        wtf.openFile();
        wtf.addRecords(slideShowFinal);
        wtf.closeFile();
    }
}
