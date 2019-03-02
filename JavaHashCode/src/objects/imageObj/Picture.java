package objects.imageObj;

import java.util.HashSet;
import java.util.Set;

public abstract class Picture {

    private Set<String> tags = new HashSet<>();

    private int pictureId;

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
