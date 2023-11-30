# Instructions

`Acceptable` and `Acceptor` are the dual of `Iterable` and `Iterator`: they deal with object producing (rather than consuming) finite sequences of elements.

Create a new class `OneListAcceptable<T> implements Acceptable<T>` with a constructor accepting a `java.util.List<T>`, in such a way that it accepts exactly the sequence of elements contained in the list.

Use the three tests in `AcceptableTest` to better understand the expected behavior of `OneListAcceptable`.