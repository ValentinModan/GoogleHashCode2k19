package objects;

import java.util.ArrayList;
import java.util.List;

public class AllPictures {

    private static List<Picture> horizontalPictureList = new ArrayList<>();

    private static List<Picture> verticalPictureList = new ArrayList<>();

    private static int pictureNumber;

    public static int getPictureNumber() {
        return pictureNumber;
    }

    public static void setPictureNumber(int pictureNumber) {
        AllPictures.pictureNumber = pictureNumber;
    }

    public static void addHorizontalPicture(Picture picture) {
        horizontalPictureList.add(picture);
    }

    public static void addVerticalPicture(Picture picture) {
        verticalPictureList.add(picture);
    }

    public static void displayAllPictures() {
        System.out.println("Horizotal pictures:");
        for (Picture x : horizontalPictureList) {
            System.out.println(x);
        }

        System.out.println("Vertical pictures:");
        for(Picture y: verticalPictureList) {
            System.out.println(y);
        }
    }

    public static List<Picture> getHorizontalPictureList() {
        return horizontalPictureList;
    }

    public static void setHorizontalPictureList(List<Picture> horizontalPictureList) {
        AllPictures.horizontalPictureList = horizontalPictureList;
    }

    public static List<Picture> getVerticalPictureList() {
        return verticalPictureList;
    }

    public static void setVerticalPictureList(List<Picture> verticalPictureList) {
        AllPictures.verticalPictureList = verticalPictureList;
    }
}
