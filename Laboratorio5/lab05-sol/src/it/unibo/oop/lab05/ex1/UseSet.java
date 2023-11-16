package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Set<String> set = new TreeSet<String>();
        /*
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         */
        for (int i = 1; i <= ELEMS; i++) {
            set.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println("Initial set: " + set);
        /*
         * 4) Removes all those strings whose represented number is divisible by
         * three
         */
        final var iter = set.iterator();
        while (iter.hasNext()) {
            if (Integer.parseInt(iter.next()) % 3 == 0) {
                iter.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each costruct
         */
        for (final String str: set) {
            System.out.print(str + " ");
        }
        System.out.println();
        /*
         * 6) Verifies if all the numbers left in the set are even
         */
        final Set<String> set2 = new TreeSet<>();
        for (int i = 2; i <= ELEMS; i += 2) {
            set2.add(Integer.toString(i));
        }
        System.out.println("Even elements: " + set2);
        System.out.println(set2.containsAll(set));

    }
}
