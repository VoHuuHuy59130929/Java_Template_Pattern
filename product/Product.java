package product;

public class Product {
  private String name;
  private int price, quantity;

  public Product() {
  }

  public Product(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", price='" + getPrice() + "'" +
      ", quantity='" + getQuantity() + "'" +
      "}";
  }

}