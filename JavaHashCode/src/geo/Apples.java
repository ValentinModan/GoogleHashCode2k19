package geo;

public class Apples {
    public static void readData(String fileName) {

        ReadFromFile r = new ReadFromFile();
        r.openFile(fileName);
        r.readFile();
        r.closeFile();
    }

}
