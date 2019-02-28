package objects;

public class Slide {
    boolean isVertical;

    Picture first;
    Picture second;


    public Slide() {
    }

    public boolean isVertical() {
        return isVertical;
    }

    public void setVertical(boolean vertical) {
        isVertical = vertical;
    }

    public Picture getFirst() {
        return first;
    }

    public void setFirst(Picture first) {
        this.first = first;
    }

    public Picture getSecond() {
        return second;
    }

    public void setSecond(Picture second) {
        this.second = second;
    }
}
