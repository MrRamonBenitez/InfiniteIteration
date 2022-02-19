import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected List<Integer> list;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.list = random.ints((max - min), min, max + 1)
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int nextItem = 0;

            @Override
            public boolean hasNext() {
                return nextItem < list.size();
            }

            @Override
            public Integer next() {
                if (nextItem < list.size()) {
                    int element = list.get(nextItem);
                    nextItem++;
                    return element;
                } else { return null; }
            }

        };
    }
}



