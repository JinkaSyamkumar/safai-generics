package shopping;

// class specs come first, if you have any :)
public class ClothingPair<E extends Object & Sized & Colored/*, String*/> extends Pair<E> {
//  private java.lang.String x = "Hello";

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public static <E extends Sized & Colored> boolean matches(E left, E right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }

//  public static <E, F extends E> void doStuff() {}

  public boolean matched() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
