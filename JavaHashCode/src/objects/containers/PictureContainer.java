package objects.containers;

import objects.imageObj.Picture;
import objects.imageObj.PictureHorizontal;
import objects.imageObj.PictureVertical;

import java.util.ArrayList;
import java.util.List;

public abstract class PictureContainer {

    public static List<Picture> horizontalPictureList = new ArrayList<>();

    public static List<Picture> verticalPictureList = new ArrayList<>();

    public static void addPicture(Picture picture) {
        if (picture instanceof PictureHorizontal)
            horizontalPictureList.add((PictureHorizontal) picture);
        else
            verticalPictureList.add((PictureVertical) picture);
    }


    public static List<Picture> getHorizontalPictureList() {
        return horizontalPictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.horizontalPictureList = pictureList;
    }

    public static void setHorizontalPictureList(List<Picture> horizontalPictureList) {
        PictureContainer.horizontalPictureList = horizontalPictureList;
    }

    public static List<Picture> getVerticalPictureList() {
        return verticalPictureList;
    }

    public static void setVerticalPictureList(List<Picture> verticalPictureList) {
        PictureContainer.verticalPictureList = verticalPictureList;
    }
}
