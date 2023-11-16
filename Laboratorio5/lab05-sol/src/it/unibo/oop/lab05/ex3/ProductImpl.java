package it.unibo.oop.lab05.ex3;

/**
 * Product implementation.
 * 
 */
public class ProductImpl implements Product {

    private final String name;
    private final double quantity;

    /**
     * @param n
     *            the product name
     * @param q
     *            the product quantity
     */
    public ProductImpl(final String n, final double q) {
        super();
        this.name = n;
        this.quantity = q;
    }

    /**
     * {@inheritDoc}
     */
    public final String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    public final double getQuantity() {
        return quantity;
    }

    /**
     * {@inheritDoc}
     */
    public int hashCode() {
        return name.hashCode();
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals(final Object obj) {
        if (obj instanceof Product) {
            final var pr = (Product) obj;
            return name.equals(pr.getName());
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public final String toString() {
        return "ProductImpl [name=" + name + ", quantity=" + quantity + "]";
    }

}
