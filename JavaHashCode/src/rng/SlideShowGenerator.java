package rng;

import java.util.Random;

public class SlideShowGenerator {

    public static Random rng = new Random();
    /*@Deprecated
    public static SlideShowOld generateSlideShow(int n) {
        SlideShowOld slideShowOld = new SlideShowOld();


        for (int i = 1; i <= n; i++) {
            SlideVertical aVerticalSlide = generateSlide(slideShowOld);
            if (aVerticalSlide == null)
                i = i;
            else {
                BigInteger initial = slideShowOld.getPictureNumber();


                if (aVerticalSlide.getFirst() == null)
                    return slideShowOld;
                BigInteger position = new BigInteger(String.valueOf(1 << (aVerticalSlide.getFirst().getPictureId())));
                slideShowOld.setPictureNumber(initial.or(position));

                if (aVerticalSlide.getSecond() != null) {
                    BigInteger initial1 = slideShowOld.getPictureNumber();
                    BigInteger newPosition = BigInteger.valueOf(1 << aVerticalSlide.getSecond().getPictureId());
                    slideShowOld.setPictureNumber(initial1.or(newPosition));
                    aVerticalSlide.setVertical(true);
                }


                slideShowOld.addSlide(aVerticalSlide);
            }
        }
        return slideShowOld;
    }*/

    /*public static SlideVertical generateSlide(SlideShowOld slideShowOld) {
        if (random(2) == 1 && AllPicturesOld.getHorizontalPictureOldList().size() > 0) {
            return randomHorizontal(slideShowOld);
        }
        if (getVerticalPictureOldList().size() > 0) {
            return randomVertical(slideShowOld);
        }

        return null;
    }*/

    /*public static SlideVertical randomHorizontal(SlideShowOld slideShowOld) {
        SlideVertical resultVerticalSlide = new SlideVertical();

        for (int i = 1; i <= 100; i++) {
            int position;
            if (AllPicturesOld.getHorizontalPictureOldList().size() == 1)
                position = 0;
            else
                position = random(AllPicturesOld.getHorizontalPictureOldList().size() - 1);

            //poza nu exista deja in slideshow
            BigInteger initial = slideShowOld.getPictureNumber();
            BigInteger bg = new BigInteger(String.valueOf(1 << position));
            BigInteger zero = new BigInteger(String.valueOf(0));
            if (initial.and(bg).equals(zero)) {
                resultVerticalSlide.setFirst(AllPicturesOld.getHorizontalPictureOldList().get(position));

                AllPicturesOld.horizontalPictureOldList.remove(position);
                return resultVerticalSlide;
            }
        }
        return null;
    }*/

    /*public static SlideVertical randomVertical(SlideShowOld slideShowOld) {
        SlideVertical resultVerticalSlide = new SlideVertical();

        BigInteger firstId = new BigInteger("0");
        for (int i = 1; i <= 10; i++) {
            int position;
            if (getVerticalPictureOldList().size() == 1)
                position = 0;
            else {

                position = random(getVerticalPictureOldList().size() - 1);
            }

            //poza nu exista deja in slideshow
            BigInteger initialSlideShowNumber = slideShowOld.getPictureNumber();

            BigInteger pictureId = new BigInteger(String.valueOf(1 << getVerticalPictureOldList().get(position).getPictureId()));

            BigInteger zero = new BigInteger("0");
            if (initialSlideShowNumber.and(pictureId).equals(zero)) {
                resultVerticalSlide.setFirst(getVerticalPictureOldList().get(position));
                AllPicturesOld.verticalPictureOldList.remove(position);
                firstId = pictureId;
                break;
            }

        }


        for (int i = 1; i <= 10; i++) {
            int position;

            if (getVerticalPictureOldList().size() == 0)
                return null;
            if (getVerticalPictureOldList().size() == 1)
                position = 0;
            else {
                position = random(getVerticalPictureOldList().size() - 1);
            }


            BigInteger initialSlideShowNumber = slideShowOld.getPictureNumber();

            BigInteger pictureId = new BigInteger("1");
            pictureId = pictureId.shiftLeft(getVerticalPictureOldList().get(position).getPictureId());

            BigInteger zero = new BigInteger("0");
            //poza nu exista deja in slideshow
            if (initialSlideShowNumber.and(pictureId).equals(zero) && !firstId.equals(pictureId)) {
                resultVerticalSlide.setFirst(getVerticalPictureOldList().get(position));
                AllPicturesOld.horizontalPictureOldList.remove(position);
                firstId = pictureId;
                break;
            }
        }

        return null;
    }*/


    public static int random(int x) {

        return rng.nextInt(x)%x;
    }

}
