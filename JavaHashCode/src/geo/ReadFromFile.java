package geo;

import objects.AllPictures;
import objects.Picture;

import java.io.*;
import java.util.*;

public class ReadFromFile {

    private Scanner s;
    private ArrayList<String> tags = new ArrayList();

    public void openFile() {
        try {
            s = new Scanner(new File("a_example.txt"));
        } catch (Exception e) {
            System.out.println("could not find file");
        }
    }

    public void readFile() {
        if (s.hasNext()) {
            String num1 = s.next();
            int num = Integer.parseInt(num1);
            System.out.println(num);

            //set picture number
            AllPictures.setPictureNumber(num);


            for (int i = 0; i < num; i++) {

                Picture picture = new Picture();


                String position = s.next();
                System.out.print(position + " "); //position means horizotal or vertical



                String no_of_tags1 = s.next();


                int no_of_tags = Integer.parseInt(no_of_tags1);
                System.out.print(no_of_tags + " ");
                for (int j = 0; j < no_of_tags; j++) {
                    try {
                        String crttag = s.next();
                        tags.add(crttag);

                        picture.addTag(crttag);


                        System.out.print(crttag + " ");
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }


                }


                //add picture id
                picture.setPictureId(i);

                if(position.equals("H"))
                {
                    picture.setHorizontal(true);
                    AllPictures.addHorizontalPicture(picture);
                }
                else{
                    picture.setHorizontal(false);
                    AllPictures.addVerticalPicture(picture);
                }

                System.out.println(" ");
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