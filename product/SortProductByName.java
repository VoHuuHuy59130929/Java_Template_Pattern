package product;

import java.util.List;

public class SortProductByName extends SortCollection<Product> {
  public SortProductByName () {}
  @Override
  public int compare(Product t1, Product t2) {
    return t1.getName().compareTo(t2.getName());
  }
  @Override
  public void sort(List<Product> list) {
    Product tmp;
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (compare(list.get(i), list.get(j)) > 0) {
          tmp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, tmp);
        }
      }
    }
  }
}