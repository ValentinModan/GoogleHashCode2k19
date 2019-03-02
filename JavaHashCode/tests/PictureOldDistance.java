import controller.PictureController;
import objects.imageObj.Picture;
import objects.imageObj.PictureHorizontal;
import objects.imageObj.PictureOld;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class PictureOldDistance {

    public Picture createPicture(List<Picture> pictureList) {
        Set<String> a_tag = new HashSet<String>(pictureList);

        Picture picture = new Picture();
    }

    @Test
    public void name() {
        Set<String> a_tag = new HashSet<>(Arrays.asList("selfie", "qte"));
        Set<String> b_tag = new HashSet<>(Arrays.asList("selfie", "pizza"));
        Picture a = new Picture(a_tag);
        Picture b = new Picture(b_tag);

        assertEquals(PictureController.picturesDistance(a, b), 1);
    }

    @Test
    public void name1() {
        Set<String> a_tag = new HashSet<>(Arrays.asList("love", "hate"));
        Set<String> b_tag = new HashSet<>(Arrays.asList("hate", "garden", "hello", "pizza"));

        Picture a = new Picture(a_tag);
        Picture b = new Picture(b_tag);

        assertEquals(a.getDistance(b.getTags()), 1);
    }

    @Test
    public void name2() {
        Set<String> a_tag = new HashSet<>();
        a_tag.add("love");
        a_tag.add("pizza");

        Set<String> b_tag = new HashSet<>();
        b_tag.add("food");
        b_tag.add("garden");
        b_tag.add("hello");
        b_tag.add("pizza");
        PictureOld a = new PictureOld(false, a_tag);

        PictureOld b = new PictureOld(false, b_tag);

        assertEquals(a.getDistance(b.getTags()), 1);
    }

    @Test
    public void name3() {
        Set<String> a_tag = new HashSet<>();
        a_tag.add("garden");
        a_tag.add("hate");
        a_tag.add("hello");
        a_tag.add("pizza");

        Set<String> b_tag = new HashSet<>();
        b_tag.add("hate");
        b_tag.add("garden");
        b_tag.add("hello");
        b_tag.add("pizza");
        PictureOld a = new PictureOld(false, a_tag);

        PictureOld b = new PictureOld(false, b_tag);

        assertEquals(a.getDistance(b.getTags()), 0);
    }

    @Test
    public void name4() {
        Set<String> a_tag = new HashSet<>();
        a_tag.add("c");
        a_tag.add("hate");
        a_tag.add("hello");
        a_tag.add("b");

        Set<String> b_tag = new HashSet<>();
        b_tag.add("hate");
        b_tag.add("b");
        b_tag.add("hello");
        b_tag.add("a");
        PictureOld a = new PictureOld(false, a_tag);

        PictureOld b = new PictureOld(false, b_tag);

        assertEquals(a.getDistance(b.getTags()), 1);
    }

}
