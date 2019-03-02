package objects.imageObj;

import java.util.Set;

public class PictureHorizontal extends Picture {
    public PictureHorizontal() {
        super.type = "Horizontal";
    }

    public PictureHorizontal(Set<String> stringSet) {
        this();
        setTags(stringSet);
    }
}
