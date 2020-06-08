package main;

import product.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<Product> listProduct = new ArrayList<Product>();
    listProduct.add(new Product("Máy Quạt", 80000, 4));
    listProduct.add(new Product("Máy Bom Nước", 200000, 2));
    listProduct.add(new Product("Máy Xay Lúa", 5000000, 1));
    listProduct.add(new Product("Máy Tính", 15000000, 5));
    listProduct.add(new Product("Máy Cày", 12000000, 7));
    SortCollection sortName = new SortProductByName();
    SortCollection sortPrice = new SortProductByPrice();
    sortName.sort(listProduct);
    System.out.println("Sắp xếp theo tên: \n");
    for (Product p: listProduct) {
      System.out.println(p.toString() + "\n");
    }
    sortPrice.sort(listProduct);
    System.out.println("Sắp xếp theo giá: \n");
    for (Product p: listProduct) {
      System.out.println(p.toString() + "\n");
    }
  }
}
