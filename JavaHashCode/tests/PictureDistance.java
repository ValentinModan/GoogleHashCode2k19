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
    
    @Test
    public void name1() {
        Set<String> a_tag = new HashSet<>();
        a_tag.add("love");
        a_tag.add("hate");

        Set<String> b_tag = new HashSet<>();
        b_tag.add("hate");
        b_tag.add("garden");
        b_tag.add("hello");
        b_tag.add("pizza");
        Picture a = new Picture(false,a_tag);

        Picture b = new Picture(false, b_tag);

        assertEquals(a.getDistance(b.getTags()),1);
    }
    
    @Test
    public void name2() {
        Set<String> a_tag = new HashSet<>();
        a_tag.add("love");
        a_tag.add("hate");

        Set<String> b_tag = new HashSet<>();
        b_tag.add("food");
        b_tag.add("garden");
        b_tag.add("hello");
        b_tag.add("pizza");
        Picture a = new Picture(false,a_tag);

        Picture b = new Picture(false, b_tag);

        assertEquals(a.getDistance(b.getTags()),0);
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
        Picture a = new Picture(false,a_tag);

        Picture b = new Picture(false, b_tag);

        assertEquals(a.getDistance(b.getTags()),0);
    }
}
