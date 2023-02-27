import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task1 {
    public static String sortednames(ArrayList<String> names){
        TestIsNumberEven testIsNumberEven = new TestIsNumberEven();

        return names.stream()
                .map(line -> testIsNumberEven.changeFormat(names))
                .filter(Objects::nonNull)
                .collect(Collectors.joining(", "));
    }

}
