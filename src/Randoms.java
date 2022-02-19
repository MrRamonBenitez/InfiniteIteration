import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Collectors;

public class Randoms implements Iterable<Integer>{
    protected Random random;

    public Randoms(int min, int max) {
        new ArrayList<>(new Random().ints(min, max)
                .boxed()
                .collect(Collectors.toList()));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };

    }
}
