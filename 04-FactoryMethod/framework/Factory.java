package framework;

public abstract class Factory{
  public final Product create(String owner){
    Product p = createProduct(owner);
    registarProduct(p);
    return p;
  }
  protected abstract Product createProduct(String owner);
  protected abstract void registarProduct(Product product);
}
