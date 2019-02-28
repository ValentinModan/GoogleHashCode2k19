package objects;

import java.math.BigInteger;
import java.util.List;

public class SlideShow {

    private List<Picture> pictureList;
    private List<Slide> slideList;

    public void addSlide(Slide slide)
    {
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

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Picture> pictureList) {
        this.pictureList = pictureList;
    }

    public void addPicture(Picture picture,int position){
        pictureList.add(picture);
        pictureNumber = pictureNumber.or(BigInteger.valueOf(1<<position));
    }

    
}
