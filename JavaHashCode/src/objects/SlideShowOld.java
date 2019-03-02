package objects;

import objects.imageObj.PictureOld;
import objects.imageObj.SlideVertical;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SlideShowOld {


    private static List<PictureOld> pictureOldList;

    public static List<SlideVertical> verticalSlideList = new ArrayList<>();

    public static List<SlideVertical> getVerticalSlideList() {
        return verticalSlideList;
    }

    public void setSlideList(List<SlideVertical> verticalSlideList) {
        this.verticalSlideList = verticalSlideList;
    }

    public void addSlide(SlideVertical verticalSlide) {
        verticalSlideList.add(verticalSlide);
    }

    private BigInteger pictureNumber = new BigInteger(String.valueOf(0));

    public BigInteger getPictureNumber() {
        return pictureNumber;
    }

    public void setPictureNumber(BigInteger pictureNumber) {
        this.pictureNumber = pictureNumber;
    }

    public SlideShowOld(List<PictureOld> pictureOldList) {
        this.pictureOldList = pictureOldList;
    }

    public SlideShowOld() {

    }


    public static List<PictureOld> getPictureOldList() {
        return pictureOldList;
    }

    public void setPictureList(List<PictureOld> pictureOldList) {
        this.pictureOldList = pictureOldList;
    }


    public void addPicture(PictureOld pictureOld, int position) {

        pictureOldList.add(pictureOld);
        pictureNumber = pictureNumber.or(BigInteger.valueOf(1 << position));
    }

    public void displaySlideShow() {
        System.out.println(verticalSlideList.size());

        for (SlideVertical verticalSlide : verticalSlideList) {

            System.out.println(verticalSlide);

        }
    }

    /*public int computeSum() {
        int sum = 0;
        for (int i = 0; i < verticalSlideList.size() - 1; i++) {
            if (!verticalSlideList.get(i).isVertical) {
                if (!verticalSlideList.get(i + 1).isVertical) {
                    sum += verticalSlideList.get(i).first.getDistance(verticalSlideList.get(i + 1).first.getTags());
                } else {
                    Set<String> firstSet = verticalSlideList.get(i + 1).first.getTags();
                    Set<String> secondSet = verticalSlideList.get(i + 1).second.getTags();

                    firstSet.addAll(secondSet);
                    sum += verticalSlideList.get(i).first.getDistance(firstSet);
                }
            } else {
                if (!verticalSlideList.get(i + 1).isVertical) {
                    Set<String> firstSet = verticalSlideList.get(i).first.getTags();
                    Set<String> secondSet = verticalSlideList.get(i).second.getTags();

                    firstSet.addAll(secondSet);
                    sum += verticalSlideList.get(i + 1).first.getDistance(firstSet);
                } else {
                    Set<String> firstSet = verticalSlideList.get(i + 1).first.getTags();
                    Set<String> secondSet = verticalSlideList.get(i + 1).second.getTags();

                    firstSet.addAll(secondSet);

                    Set<String> firstISet = verticalSlideList.get(i).first.getTags();
                    Set<String> secondISet = verticalSlideList.get(i).second.getTags();

                    firstISet.addAll(secondISet);

                    PictureOld aux = new PictureOld();
                    aux.setTags(firstSet);

                    sum += aux.getDistance(firstISet);


                }

            }
        }
        return sum;
    }*/
}
