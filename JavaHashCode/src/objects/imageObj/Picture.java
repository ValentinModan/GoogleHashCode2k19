package objects.imageObj;

import java.util.HashSet;
import java.util.Set;

public class Picture {

    private Set<String> tags = new HashSet<>();

    private int pictureId;

    public String type;

    public Picture(Set<String> tags) {
        this.tags = tags;
    }

    protected Picture() {
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "type='" + type + "\', " +
                "tags=" + tags +
                ", pictureId=" + pictureId +
                '}';
    }
}
