package it.unibo.oop.lab06.generics1;

import java.util.Deque;

/**
 * Breadth first accumulation.
 * 
 * @param <S>
 *            step type
 */
public final class DepthFirst<S> implements FringeAccumulationStrategy<S> {

    /*
     * Singleton object: since the object is stateless (and purely functional), we
     * don't need more than an instance.
     */
    private static final DepthFirst<?> INSTANCE = new DepthFirst<>();

    private DepthFirst() {
    }

    /**
     * @param <S>
     *            the step type
     * @return an instance of a {@link DepthFirst}.
     */
    @SuppressWarnings("unchecked")
    public static <S> DepthFirst<S> getInstance() {
        /*
         * Safe to cast: the actual generic type is irrelevant, as far as addToFringe is
         * used consistently.
         */
        return (DepthFirst<S>) INSTANCE;
    }

    @Override
    public void addToFringe(final Deque<? super S> fringe, final S step) {
        fringe.addFirst(step);
    }

}
