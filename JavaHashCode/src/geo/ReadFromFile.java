package geo;

import objects.AllPicturesOld;
import objects.imageObj.PictureOld;

import java.io.*;
import java.util.*;

public class ReadFromFile {

    private Scanner s;
    private ArrayList<String> tags = new ArrayList();

    public void openFile() {
        try {
            s = new Scanner(new File("b_lovely_landscapes.txt"));
        } catch (Exception e) {
            System.out.println("could not find file");
        }
    }

    public void readFile() {
        if (s.hasNext()) {
            String num1 = s.next();
            int num = Integer.parseInt(num1);


            //set picture number
            AllPicturesOld.setPictureNumber(num);


            for (int i = 0; i < num; i++) {

                PictureOld pictureOld = new PictureOld();


                String position = s.next();

                String no_of_tags1 = s.next();


                int no_of_tags = Integer.parseInt(no_of_tags1);
                for (int j = 0; j < no_of_tags; j++) {
                    try {
                        String crttag = s.next();
                        tags.add(crttag);

                        pictureOld.addTag(crttag);


                    } catch (Exception ex) {
                    }


                }


                //add pictureOld id
                pictureOld.setPictureId(i);

                if(position.equals("H"))
                {
                    pictureOld.setHorizontal(true);
                    AllPicturesOld.addHorizontalPicture(pictureOld);
                }
                else{
                    pictureOld.setHorizontal(false);
                    AllPicturesOld.addVerticalPicture(pictureOld);
                }
            }

            //Iterator<String> it = tags.iterator();
            //	while(it.hasNext()) {
            //	System.out.println(it.next());
        }
    }


    public void closeFile() {
        s.close();
    }
}