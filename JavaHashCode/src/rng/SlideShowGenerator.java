package rng;

import objects.AllPictures;
import objects.Picture;
import objects.Slide;
import objects.SlideShow;

import java.math.BigInteger;
import java.util.Random;

import static objects.AllPictures.getVerticalPictureList;

public class SlideShowGenerator {

    public static Random rng = new Random();
    public static SlideShow generateSlideShow(int n) {
        SlideShow slideShow = new SlideShow();


        for (int i = 1; i <= n; i++) {
            Slide aSlide = generateSlide(slideShow);
            if (aSlide == null)
                i = i;
            else {
                BigInteger initial = slideShow.getPictureNumber();


                if (aSlide.getFirst() == null)
                    return slideShow;
                BigInteger position = new BigInteger(String.valueOf(1 << (aSlide.getFirst().getPictureId())));
                slideShow.setPictureNumber(initial.or(position));

                if (aSlide.getSecond() != null) {
                    BigInteger initial1 = slideShow.getPictureNumber();
                    BigInteger newPosition = BigInteger.valueOf(1 << aSlide.getSecond().getPictureId());
                    slideShow.setPictureNumber(initial1.or(newPosition));
                    aSlide.setVertical(true);
                }


                slideShow.addSlide(aSlide);
            }
        }
        return slideShow;
    }

    public static Slide generateSlide(SlideShow slideShow) {
        if (random(2) == 1 && AllPictures.getHorizontalPictureList().size() > 0) {
            return randomHorizontal(slideShow);
        }
        if (getVerticalPictureList().size() > 0) {
            return randomVertical(slideShow);
        }

        return null;
    }

    public static Slide randomHorizontal(SlideShow slideShow) {
        Slide resultSlide = new Slide();

        for (int i = 1; i <= 100; i++) {
            int position;
            if (AllPictures.getHorizontalPictureList().size() == 1)
                position = 0;
            else
                position = random(AllPictures.getHorizontalPictureList().size() - 1);

            //poza nu exista deja in slideshow
            BigInteger initial = slideShow.getPictureNumber();
            BigInteger bg = new BigInteger(String.valueOf(1 << position));
            BigInteger zero = new BigInteger(String.valueOf(0));
            if (initial.and(bg).equals(zero)) {
                resultSlide.setFirst(AllPictures.getHorizontalPictureList().get(position));

                AllPictures.horizontalPictureList.remove(position);
                return resultSlide;
            }
        }
        return null;
    }

    public static Slide randomVertical(SlideShow slideShow) {
        Slide resultSlide = new Slide();

        BigInteger firstId = new BigInteger("0");
        for (int i = 1; i <= 10; i++) {
            int position;
            if (getVerticalPictureList().size() == 1)
                position = 0;
            else {

                position = random(getVerticalPictureList().size() - 1);
            }

            //poza nu exista deja in slideshow
            BigInteger initialSlideShowNumber = slideShow.getPictureNumber();

            BigInteger pictureId = new BigInteger(String.valueOf(1 << getVerticalPictureList().get(position).getPictureId()));

            BigInteger zero = new BigInteger("0");
            if (initialSlideShowNumber.and(pictureId).equals(zero)) {
                resultSlide.setFirst(getVerticalPictureList().get(position));
                AllPictures.verticalPictureList.remove(position);
                firstId = pictureId;
                break;
            }

        }


        for (int i = 1; i <= 10; i++) {
            int position;

            if (getVerticalPictureList().size() == 0)
                return null;
            if (getVerticalPictureList().size() == 1)
                position = 0;
            else {
                position = random(getVerticalPictureList().size() - 1);
            }


            BigInteger initialSlideShowNumber = slideShow.getPictureNumber();

            BigInteger pictureId = new BigInteger("1");
            pictureId = pictureId.shiftLeft(getVerticalPictureList().get(position).getPictureId());

            BigInteger zero = new BigInteger("0");
            //poza nu exista deja in slideshow
            if (initialSlideShowNumber.and(pictureId).equals(zero) && !firstId.equals(pictureId)) {
                resultSlide.setFirst(getVerticalPictureList().get(position));
                AllPictures.horizontalPictureList.remove(position);
                firstId = pictureId;
                break;
            }
        }

        return null;
    }


    public static int random(int x) {

        return rng.nextInt(x)%x;
    }

}
