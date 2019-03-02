package objects.imageObj;

public class SlideVertical extends Slide{

    private PictureOld second;
    private PictureOld first;

    public SlideVertical(PictureOld first, PictureOld second) {
        this.first = first;
        this.second = second;

        //creade common hashTags for picture
        addTagSet(first.getTags());
        addTagSet(second.getTags());

        //create IntegerSet for all pictures in slide
        addPictureToIntegerHashSet(first);
        addPictureToIntegerHashSet(second);
    }

    public SlideVertical() {
    }

    public SlideVertical(PictureOld second) {
        this.second = second;
    }

    public PictureOld getSecond() {
        return second;
    }

    public void setSecond(PictureOld second) {
        this.second = second;
    }




}
