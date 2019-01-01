package game;
import java.util.*;

public class Memento{
  int money;
  ArrayList fruits;

  Memento(int money){
    this.money = money;
    this.fruits = new ArrayList();
  }

  public int getMoney(){ return money; }
  List getFruits(){ return (List)fruits.clone(); }

  void addFruit(String fruit){
    fruits.add(fruit);
  }
}
