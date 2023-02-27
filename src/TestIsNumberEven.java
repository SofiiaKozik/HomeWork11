import java.util.ArrayList;

public class TestIsNumberEven {
    int index;

    public String changeFormat(ArrayList<String> text) {
        if (index++ % 2 != 0) {
            return index-1 + ". " + text.get(index-1);
        }
        return null;
    }


}
