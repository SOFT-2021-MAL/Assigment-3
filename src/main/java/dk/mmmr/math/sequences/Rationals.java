package dk.mmmr.math.sequences;

import java.util.Iterator;


public class Rationals implements Iterable {

    long startValue;
    long endValue;
    long current;

    public Rationals(long start, long end) {
        this.startValue = start;
        this.endValue = end;
        this.current = start;

    }

    long ln(long n) {
        return (long) Math.floor((-1 + (Math.sqrt(1 + 8 * n))) / 2);
    }

    long sn(long n) {
        long ln = ln(n);
        return (ln * (ln + 1)) / 2;
    }

    long numerator(long n) {
        long sn = sn(n);
        return (n - sn) + 1;
    }

    long denominator(long n) {
        long ln = ln(n);
        long sn = sn(n);
        return ln - (n - sn) + 1;
    }

    public String rational(long n) {
        return "" + numerator(n) + "/" + denominator(n);
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                if (current == endValue) return false;
                return true;
            }

            @Override
            public Object next() {
                if (hasNext()) {
                    return current++;
                }
                throw new IndexOutOfBoundsException("fuark");
            }
        };
    }
}
