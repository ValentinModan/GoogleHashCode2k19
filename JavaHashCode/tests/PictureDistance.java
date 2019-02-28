import objects.Picture;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PictureDistance {

    @Test
    public void name() {
        Set<String> a_tag = new HashSet<>();
        a_tag.add("selfie");
        a_tag.add("qte");

        Set<String> b_tag = new HashSet<>();
        b_tag.add("selfie");
        b_tag.add("pizza");
        Picture a = new Picture(false,a_tag);

        Picture b = new Picture(false, b_tag);

        assertEquals(a.getDistance(b.getTags()),1);
    }
}
