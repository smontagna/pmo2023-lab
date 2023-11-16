package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

/**
 *
 */
public class ComparableProduct extends ProductImpl implements Comparable<Product> {

    /**
     * @param name
     *            the product name
     * @param quantity
     *            the product quantity
     */
    public ComparableProduct(final String name, final double quantity) {
        super(name, quantity);
    }

    /**
     * {@inheritDoc}
     */
    public int compareTo(final Product o) {
        return getName().compareTo(o.getName());
    }

}
