package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseCollection {

    private static final int TO_MS = 1_000_000;
    private static final int ELEMS = 100_000;
    private static final int READS = 10_000;
    private static final int START = 1000;
    private static final int END = 2000;
    private static final String NS = "ns (";
    private static final String MS = "ms).";

    private static final long AFRICA_POPULATION = 1_110_635_000L;
    private static final long AMERICAS_POPULATION = 972_005_000L;
    private static final long ANTARCTICA_POPULATION = 0L;
    private static final long ASIA_POPULATION = 4_298_723_000L;
    private static final long EUROPE_POPULATION = 742_452_000L;
    private static final long OCEANIA_POPULATION = 38_304_000L;

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        final List<Integer> al = new ArrayList<>();
        for (int i = START; i < END; i++) {
            al.add(i);
        }
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        final List<Integer> ll = new LinkedList<>(al);
        System.out.println(ll);
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        final int el = al.get(al.size() - 1);
        al.set(al.size() - 1, al.get(0));
        al.set(0, el);
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for (final int i : al) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        long time = System.nanoTime();
        for (int i = 0; i < ELEMS; i++) {
            al.add(0, i);
        }
        time = System.nanoTime() - time;
        System.out.println(
            "Inserting " + ELEMS + " elements as first in an ArrayList took "
            + time + NS + time / TO_MS + MS
        );
        time = System.nanoTime();
        for (int i = 0; i < ELEMS; i++) {
            ll.add(0, i);
        }
        time = System.nanoTime() - time;
        System.out.println("Inserting " + ELEMS + " elements as first in a LinkedList took "
            + time + NS + time / TO_MS + MS
        );
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example PerfTest.java.
         */
        time = System.nanoTime();
        for (int i = 0; i < READS; i++) {
            al.get(al.size() / 2); // Warning OK: we are just benchmarking
        }
        time = System.nanoTime() - time;
        System.out.println(
            "Reading " + READS + " elements in the middle of an ArrayList took "
            + time + NS + time / TO_MS + MS
        );
        time = System.nanoTime();
        for (int i = 0; i < READS; i++) {
            ll.get(ll.size() / 2);
        }
        time = System.nanoTime() - time;
        System.out.println(
            "Reading " + READS + " elements in the middle of a LinkedList took "
            + time + NS + time / TO_MS + MS
        );
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        final Map<String, Long> world = new HashMap<>();
        world.put("Africa", AFRICA_POPULATION);
        world.put("Americas", AMERICAS_POPULATION);
        world.put("Antarctica", ANTARCTICA_POPULATION);
        world.put("Asia", ASIA_POPULATION);
        world.put("Europe", EUROPE_POPULATION);
        world.put("Oceania", OCEANIA_POPULATION);
        /*
         * 8) Compute the population of the world
         */
        long totPop = 0;
        for (final long population : world.values()) {
            totPop += population;
        }
        System.out.println(
            "We are ~" + totPop + " human beings on this pale blue dot"
            + " (enough people to overflow integers :D)."
        );
    }
}
