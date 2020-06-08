package product;

import java.util.List;

public abstract class SortCollection<T> {
  abstract public int compare(T t1, T t2);
  abstract public void sort(List<Product> list);
}
