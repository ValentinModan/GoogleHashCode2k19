package rng;

import objects.AllPictures;
import objects.Slide;
import objects.SlideShow;

import java.math.BigInteger;
import java.util.Random;

public class SlideShowGenerator {


    public static SlideShow generateSlideShow(int n)
    {
        SlideShow slideShow = new SlideShow();


        for(int i=1;i<=n;i++)
        {
            Slide x = generateSlide(slideShow);
            if(x==null)
                return slideShow;

            slideShow.setPictureNumber(slideShow.getPictureNumber().or(BigInteger.valueOf(x.getFirst().getPictureId())));
            if(x.getSecond()!=null)
            {
                slideShow.setPictureNumber(slideShow.getPictureNumber().or(BigInteger.valueOf(x.getSecond().getPictureId())));
            }
        }
        return slideShow;
    }

    public static Slide generateSlide(SlideShow slideShow)
    {
        if(random(2)==1)
        {
            return randomHorizontal(slideShow);
        }
        else
        {
            return randomVertical(slideShow);
        }
    }

    public static Slide randomHorizontal(SlideShow slideShow)
    {
        Slide resultSlide = new Slide();

        for(int i=1;i<=1000;i++)
        {
            int position = random(AllPictures.getHorizontalPictureList().size());

            //poza nu exista deja in slideshow
            if(slideShow.getPictureNumber().and(new BigInteger(String.valueOf(position)))==new BigInteger(String.valueOf(0)))
            {
                resultSlide.setFirst(AllPictures.getHorizontalPictureList().get(position));
                return resultSlide;
            }
        }
        return null;
    }

    public static Slide randomVertical(SlideShow slideShow)
    {
        Slide resultSlide = new Slide();

        for(int i=1;i<=500;i++)
        {
            int position = random(AllPictures.getVerticalPictureList().size());

            //poza nu exista deja in slideshow
            if(slideShow.getPictureNumber().and(new BigInteger(String.valueOf(position))).equals(new BigInteger(String.valueOf(0))))
            {
                resultSlide.setFirst(AllPictures.getVerticalPictureList().get(position));
                return resultSlide;
            }
        }

        for(int i=1;i<=500;i++)
        {
            int position = random(AllPictures.getVerticalPictureList().size());

            //poza nu exista deja in slideshow
            if(slideShow.getPictureNumber().and(new BigInteger(String.valueOf(position))).equals(new BigInteger(String.valueOf(0))))
            {
                resultSlide.setSecond(AllPictures.getVerticalPictureList().get(position));
                return resultSlide;
            }
        }

        return null;
    }


    public static int random(int x)
    {
        Random rng = new Random();

        return rng.nextInt()%x;
    }

}
