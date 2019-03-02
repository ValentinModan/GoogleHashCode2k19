package geo;

import controller.PictureConstructor;
import objects.containers.PictureContainer;
import objects.imageObj.Picture;

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {

    private Scanner scanner;

    public void openFile(String fileName) {
        try {
            scanner = new Scanner(new File(fileName));
        } catch (Exception e) {
            System.out.println("Could not find file");
        }
    }

    public void readFile() {
        if (scanner.hasNext()) {
            String num1 = scanner.next();
            int num = Integer.parseInt(num1);

            for (int i = 0; i < num; i++) {

                String pictureType = scanner.next();

                Picture picture = PictureConstructor.buildPicture(pictureType);
                picture.setPictureId(i);

                int tagNumber = Integer.parseInt(scanner.next());
                for (int j = 0; j < tagNumber; j++) {
                    picture.addTag(scanner.next());
                }

                PictureContainer.addPicture(picture);
            }
        }
    }


    public void closeFile() {
        scanner.close();
    }
}