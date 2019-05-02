package nonreifiable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
  public static <E> E[] toArray(List<E> le, Class<E> clazz) {
//    E[] results = (E[])new Object[le.size()]; // Doesn't work properly!!!
    E[] results = (E[])Array.newInstance(clazz, le.size());
    for (int i = 0; i < le.size(); i++) {
      results[i] = le.get(i);
    }
    return results;
  }

  public static void main(String[] args) {
/*
//    String s = new String("Hello");
//    Class sc = s.getClass();
    Class<String> sc = String.class;
//    Class sc = Integer.TYPE;
    System.out.println("name of class is " + sc.getName());
*/

    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
    /*Object*/String[] sa = toArray(ls, String.class);

    Class ca = sa.getClass();
    System.out.println("Class of returned array is: " + ca.getName());
    sa[0] = "Hello";
//    sa[0] = new Object();
  }
}
