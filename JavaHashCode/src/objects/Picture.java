package objects;

import java.util.HashSet;
import java.util.Set;

public class Picture {

    private boolean isHorizontal;

    private Set<String> tags = new HashSet<>();

    private int pictureId;


    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public Picture() {
    }

    public Picture(boolean isHorisontal, Set<String> tags) {
        this.isHorizontal = isHorisontal;
        this.tags = tags;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }

    public void setHorizontal(boolean horizontal) {
        isHorizontal = horizontal;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag)
    {
        tags.add(tag);
    }

    public int getDistance(Set<String> secondTags)
    {
        int commonSize = commonSize(secondTags);

         int aMinusB= differenceSize(tags, secondTags);
         int bMinusA = differenceSize(secondTags, tags);


        return Math.min(commonSize,Math.min(aMinusB,bMinusA));
    }

    public int commonSize(Set<String> secondTags)
    {
        Set<String> commonTags= new HashSet<>(tags);
        commonTags.retainAll(secondTags);
        return commonTags.size();
    }

    private int differenceSize(Set<String> firstSet, Set<String> secondSet)
    {
        Set<String> x = firstSet;
        x.removeAll(secondSet);
        return x.size();
    }

    @Override
    public String toString() {
        return "Picture{" +
                "isHorizontal=" + isHorizontal +
                ", tags=" + tags +
                ", pictureId=" + pictureId +
                '}';
    }
}
