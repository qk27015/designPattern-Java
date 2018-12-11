import framework.*;
import idcard.*;

public class Main{
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("QK27015");
    card1.use();
  }
}
