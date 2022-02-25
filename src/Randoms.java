import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final IntStream stream;

    public Randoms(int min, int max) {
        this.random = new Random();
        stream = random.ints((max - min), min, max + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return stream.iterator();
    }
}



