import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public List<Integer> getNumbers(String[] mass) {
        List<String> list = List.of(mass);
        return list.stream()
                .map(str -> List.of(str.split(", ")))
                .flatMap(Collection::stream)
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());

    }
}
