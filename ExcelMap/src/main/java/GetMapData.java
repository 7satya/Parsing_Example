import java.io.IOException;

public class GetMapData {
    public static void main(String[] args) throws IOException {
        StoredataMap v = new StoredataMap();
        String val = v.getMapData("101");

        System.out.println(val);
    }
}
