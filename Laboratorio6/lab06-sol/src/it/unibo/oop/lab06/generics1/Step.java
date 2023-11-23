package it.unibo.oop.lab06.generics1;

import java.util.List;
import java.util.LinkedList;

/**
 * Represents one step of some graph or tree navigation algorithm.
 * A step is a recursive data structure analogous to (single-)linked-lists.
 * It takes into account the previous steps and the final position.
 * The initial position is a step having no previous steps.
 * 
 * Each step can be easily flatten into a list (i.e. path) of visited nodes.
 * 
 * NOTE: such a class is a facility of the {@link GraphImpl#graphSearch} method.
 * It would be great if we could "hide" this class within {@link GraphImpl}
 *
 * @param <N> the type of the nodes of the graph/tree
 */
class Step<N> {
    private final Step<N> prevSteps;
    private final N position;

    /**
     * Creates an initial step on node {@code position} with no previous steps.
     * 
     * @param position is the initial node
     */
    Step(final N position) {
        this(null, position);
    }

    /**
     * Creates a further step reaching node {@code currentPosition} following the steps {@code previousSteps}.
     * 
     * @param currentPosition is the node reached after performing this step
     */
    Step(final Step<N> previousSteps, final N currentPosition) {
        this.prevSteps = previousSteps;
        this.position = currentPosition;
    }

    /**
     * Flattens the step into a path (i.e. a list of nodes), from the initial one to the last one
     * 
     * @return a list of visited nodes
     */
    public List<N> getPath() {
        final List<N> result = new LinkedList<>();
        Step<N> curr = this;
        do {
            result.add(0, curr.position);
            curr = curr.prevSteps;
        } while (curr != null);
        return result;
    }

    public N getPosition() {
        return position;
    }

    @Override
    public String toString() {
        final List<String> elements = new LinkedList<>();
        for (final N node : getPath()) {
            elements.add(node.toString());
        }
        return String.join(" -> ", elements);
    }
}
