package objects;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SlideShow {


    private static List<Picture> pictureList;
    private static List<Slide> slideList;

    private List<Picture> pictureList;
    public List<Slide> slideList = new ArrayList<>();


    public void addSlide(Slide slide) {
        slideList.add(slide);
    }

    private BigInteger pictureNumber = new BigInteger(String.valueOf(0));

    public BigInteger getPictureNumber() {
        return pictureNumber;
    }

    public void setPictureNumber(BigInteger pictureNumber) {
        this.pictureNumber = pictureNumber;
    }

    public SlideShow(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public SlideShow() {

    }

    public static List<Slide> getSlideList() {
        return slideList;
    }

    public static List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }


    public void addPicture(Picture picture, int position) {

        pictureList.add(picture);
        pictureNumber = pictureNumber.or(BigInteger.valueOf(1 << position));
    }

    public void displaySlideShow() {
        System.out.println(slideList.size());

        for (Slide slide : slideList) {

            System.out.println(slide);

        }
    }

    public int computeSum() {
        int sum = 0;
        for (int i = 0; i < slideList.size() - 1; i++) {
            if (!slideList.get(i).isVertical) {
                if (!slideList.get(i + 1).isVertical) {
                    sum += slideList.get(i).first.getDistance(slideList.get(i + 1).first.getTags());
                } else {
                    Set<String> firstSet = slideList.get(i + 1).first.getTags();
                    Set<String> secondSet = slideList.get(i + 1).second.getTags();

                    firstSet.addAll(secondSet);
                    sum += slideList.get(i).first.getDistance(firstSet);
                }
            } else {
                if (!slideList.get(i + 1).isVertical) {
                    Set<String> firstSet = slideList.get(i).first.getTags();
                    Set<String> secondSet = slideList.get(i).second.getTags();

                    firstSet.addAll(secondSet);
                    sum += slideList.get(i + 1).first.getDistance(firstSet);
                } else {
                    Set<String> firstSet = slideList.get(i + 1).first.getTags();
                    Set<String> secondSet = slideList.get(i + 1).second.getTags();

                    firstSet.addAll(secondSet);

                    Set<String> firstISet = slideList.get(i).first.getTags();
                    Set<String> secondISet = slideList.get(i).second.getTags();

                    firstISet.addAll(secondISet);

                    Picture aux = new Picture();
                    aux.setTags(firstSet);

                    sum += aux.getDistance(firstISet);


                }

            }
        }
        return sum;
    }
}
