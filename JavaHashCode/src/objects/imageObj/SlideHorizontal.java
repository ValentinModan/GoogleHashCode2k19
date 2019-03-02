package objects.imageObj;

public class SlideHorizontal extends Slide{
    PictureOld first;

    public SlideHorizontal() {
    }

    public SlideHorizontal(PictureOld first) {
        this.first = first;
        addTagSet(first.getTags());
        addPictureToIntegerHashSet(first);
    }

    public PictureOld getFirst() {
        return first;
    }

    public void setFirst(PictureOld first) {
        this.first = first;
    }
}
