package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.Warehouse;

/**
 *
 */
public final class UseWarehouse {

    private UseWarehouse() { }

    /**
     * @param args
     *            unused
     */
    public static void main(final String[] args) {
        final Product p1 = new ComparableProduct("Apple", 100);
        final Product p2 = new ComparableProduct("Banana", 30);
        final Product p3 = new ComparableProduct("Watermelon", 10);

        final Warehouse w = new OrderedWarehouse();
        w.addProduct(p3);
        w.addProduct(p1);
        w.addProduct(p2);

        System.out.println(w.allNames());
        System.out.println(w.allProducts());

        // Changes to the returned set should not affect the warehouse
        final var modifiedProductSet = w.allProducts();
        modifiedProductSet.remove(p1);

        System.out.println(w.allNames());
        System.out.println(w.allProducts());
        System.out.println(modifiedProductSet);
    }

}
