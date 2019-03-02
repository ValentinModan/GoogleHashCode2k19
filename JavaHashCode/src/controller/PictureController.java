package controller;

import objects.containers.PictureContainer;
import objects.imageObj.Picture;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class PictureController {

    public static void displayAllPictures() {
        displayPictureList(PictureContainer.getHorizontalPictureList());
        displayPictureList(PictureContainer.getVerticalPictureList());
    }

    public static void displayPictureList(List<Picture> pictureList) {
        for (Picture picture : pictureList) {
            System.out.println(picture);
        }
    }

    public static int picturesDistance(Picture firstPicture, Picture secondPicture) {
        return tagsSetDistance(firstPicture.getTags(), secondPicture.getTags());
    }

    public static int tagsSetDistance(Set<String> firstSet, Set<String> secondSet) {
        return Math.min(
                commonTags(firstSet, secondSet).size(),
                Math.min(
                        substractTags(firstSet, secondSet).size(),
                        substractTags(firstSet, secondSet).size()
                )
        );
    }

    private static Set<String> commonTags(Set<String> firstSet, Set<String> secondSet) {
        Set<String> commonTags = new HashSet<>(firstSet);
        commonTags.retainAll(secondSet);
        return commonTags;
    }

    private static Set<String> substractTags(Set<String> firstSet, Set<String> secondSet) {
        Set<String> tags = new HashSet<>(firstSet);
        tags.removeAll(secondSet);
        return tags;
    }
}
