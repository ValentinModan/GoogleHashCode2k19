package objects.imageObj;

import java.util.HashSet;
import java.util.Set;

public abstract class Slide {

    protected Set<String> hashTags = new HashSet<>();

    protected Set<Integer> integerHashSet;

    public Slide() {
    }

    public Set<Integer> getIntegerHashSet() {
        return integerHashSet;
    }

    public void setIntegerHashSet(Set<Integer> integerHashSet) {
        this.integerHashSet = integerHashSet;
    }

    public void addPictureToIntegerHashSet(PictureOld pictureOld) {
        integerHashSet.add(pictureOld.getPictureId());
    }

    public Set<String> getHashTags() {
        return hashTags;
    }

    public void setHashTags(HashSet<String> hashTags) {
        this.hashTags = hashTags;
    }

    public void addTagSet(Set<String> hashTags) {
        for (String tag : hashTags)
            addTags(tag);
    }

    public void addTags(String tag) {
        hashTags.add(tag);
    }
}
