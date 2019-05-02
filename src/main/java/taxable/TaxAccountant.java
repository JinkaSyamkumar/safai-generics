package taxable;

import java.util.ArrayList;
import java.util.List;

public class TaxAccountant {
  public static void calculateTaxes(Taxable t) {}
  // called "covariance"

  public static void calculateBulkTaxes(Taxable[] ta) {
    for (Taxable t : ta) {
      calculateTaxes(t);
    }
    ta[0] = new Taxable();
  }

  public static void calculateBulkTaxes(List<? extends Taxable> lt) {
    for (Taxable t : lt) {
      calculateTaxes(t);
    }
//    lt.add(new Taxable());
//    lt.add(new Corporation());
//    lt.add(new Individual());
  }

  // contravariance
  public static void collectIndividualClients(List<? super Individual> li) {
    li.add(new Individual());
//    Individual i = li.get(0);
  }

  public static void main(String[] args) {
    List<Taxable> lt = new ArrayList<>();
    calculateBulkTaxes(lt);

    Individual i = new Individual();
    lt.add(i);
    collectIndividualClients(lt);
    calculateTaxes(i);

    List<Individual> li = new ArrayList<>();
    li.add(new Individual());
    collectIndividualClients(li);
    calculateBulkTaxes(li);

    /*Individual*/Taxable [] ia = { new Individual(), new Individual()};
    calculateBulkTaxes(ia);

  }
}
