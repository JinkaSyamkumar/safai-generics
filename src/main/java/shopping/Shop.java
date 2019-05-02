package shopping;

import java.time.LocalDate;

public class Shop {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Hello", "Goodbye");
    System.out.println(p);
//    p.matched();

//    ClothingPair<String> cps;
    ClothingPair<Shoe> ps =
        new ClothingPair<>(new Shoe(44, "Brown"), new Shoe(45, "Brown"));
    System.out.println("shoes match ? " + ps.matched());
    ClothingPair<Shoe> ps2 =
        new ClothingPair<>(new Shoe(40, "Red"), new Shoe(40, "Green"));
    System.out.println("other shoes match ? " + ps2.matched());
    System.out.println("Shoes match? "
        + ClothingPair./*<Shoe>*/matches(new Shoe(40, "Red"), new Shoe(40, "Green")));
  }
}
