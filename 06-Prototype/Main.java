import framework.*;

public class Main{
  public static void main(String[] args) {
    Manager manager = new Manager();
    MessageBox mbox = new MessageBox('*');
    manager.register("warning box", mbox);

    Product p1 = manager.create("warning box");
    p1.use("Hello World !");
  }
}
