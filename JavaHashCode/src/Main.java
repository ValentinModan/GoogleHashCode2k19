import controller.PictureController;
import geo.Apples;
import objects.containers.PictureContainer;

public class Main {

    public static void main(String[] args) {


        Apples.readData("a_example.txt");

        PictureController.displayAllPictures();

    }
}
