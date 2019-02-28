package geo;

public class Apples {
    public static void readData() {

        ReadFromFile r = new ReadFromFile();
        r.openFile();
        r.readFile();
        r.closeFile();

    }

}
