package objects;

import objects.imageObj.PictureOld;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class AllPicturesOld {

    public static List<PictureOld> horizontalPictureOldList = new ArrayList<>();

    public static List<PictureOld> verticalPictureOldList = new ArrayList<>();

    public static List<PictureOld> horizontalPictureOldListAuxes = new ArrayList<>();

    public static List<PictureOld> verticalPictureOldListAuxes = new ArrayList<>();

    private static int pictureNumber;

    public static void copy()
    {
        horizontalPictureOldList = horizontalPictureOldListAuxes;
        verticalPictureOldList = verticalPictureOldListAuxes;
    }

    public static int getPictureNumber() {
        return pictureNumber;
    }

    public static void setPictureNumber(int pictureNumber) {
        AllPicturesOld.pictureNumber = pictureNumber;
    }

    public static void addHorizontalPicture(PictureOld pictureOld) {
        horizontalPictureOldList.add(pictureOld);
    }

    public static void addVerticalPicture(PictureOld pictureOld) {
        verticalPictureOldList.add(pictureOld);
    }

    public static void displayAllPictures() {
        System.out.println("Horizotal pictures:");
        for (PictureOld x : horizontalPictureOldList) {
            System.out.println(x);
        }

        System.out.println("Vertical pictures:");
        for(PictureOld y: verticalPictureOldList) {
            System.out.println(y);
        }
    }

    public static List<PictureOld> getHorizontalPictureOldList() {
        return horizontalPictureOldList;
    }

    public static void setHorizontalPictureOldList(List<PictureOld> horizontalPictureOldList) {
        AllPicturesOld.horizontalPictureOldList = horizontalPictureOldList;
    }

    public static List<PictureOld> getVerticalPictureOldList() {
        return verticalPictureOldList;
    }

    public static void setVerticalPictureOldList(List<PictureOld> verticalPictureOldList) {
        AllPicturesOld.verticalPictureOldList = verticalPictureOldList;
    }
}
