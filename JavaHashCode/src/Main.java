import geo.Apples;
import geo.write_to_file;
import objects.AllPicturesOld;
import objects.SlideShowOld;
import rng.SlideShowGenerator;

public class Main {

    public static void main(String[] args) {


        Apples.readData();

        //AllPicturesOld.displayAllPictures();


        System.out.println("Displaying slides");

        SlideShowOld slideShowOldFinal = new SlideShowOld();
        int finalSum = 0;

        for(int i=1;i<=100;i++) {
            SlideShowOld slideShowOld = SlideShowGenerator.generateSlideShow(10000);
            int sum = slideShowOld.computeSum();

            if(sum>=finalSum)
            {
                if(slideShowOldFinal.verticalSlideList.size()< slideShowOld.verticalSlideList.size())
                slideShowOldFinal = slideShowOld;
                finalSum = sum;
            }

            AllPicturesOld.copy();

        }

        slideShowOldFinal.displaySlideShow();

        System.out.println(slideShowOldFinal.computeSum());

        write_to_file wtf = new write_to_file();

        wtf.openFile();
        wtf.addRecords(slideShowOldFinal);
        wtf.closeFile();
    }
}
