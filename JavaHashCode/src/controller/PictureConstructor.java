package controller;

import objects.imageObj.Picture;
import objects.imageObj.PictureHorizontal;
import objects.imageObj.PictureVertical;

public abstract class PictureConstructor {

    public static Picture buildPicture(String s)
    {
        if(s.equals("H"))
            return new PictureHorizontal();
        return new PictureVertical();
    }
}
