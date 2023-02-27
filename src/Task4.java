import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public Stream<Long> generator(Long a, Long c, Long m) {
        Stream<Long> stream = Stream.<Long>iterate(1L, x -> (a * x + c) % m);
        stream
                .limit(20)
                .collect(Collectors.toList());
        return stream;
    }
}
