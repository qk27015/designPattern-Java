package game;
import java.util.*;

public class Gamer{
  private int money;
  private List fruits = new ArrayList();
  private Random random = new Random();
  private static String[] fruitsname = {
    "リンゴ", "ぶどう", "バナナ", "みかん",
  };

  public Gamer(int money){
    this.money = money;
  }

  public int getMoney(){ return money; }
  private String getFruit(){
    String prefix ="";
    if(random.nextBoolean()){
      prefix = "おいしい";
    }
    return prefix + fruitsname[random.nextInt(fruitsname.length)];
  }
  public String toString(){
    return "[money = " + money + ", fruits = " + fruits + "]";
  }

  public void bet(){ // 賭ける、ゲームの進行
    int dice = random.nextInt(6) + 1;
    if(dice == 1){
      money += 100;
      System.out.println("所持金が増えました");
    }else if(dice == 2){
      money /= 2;
      System.out.println("所持金が半分になりました");
    }else if(dice == 6){
      String f = getFruit();
      System.out.println("フルーツ(" + f + ")をもらいました。");
    }else{
      System.out.println("何も起こりませんでした");
    }
  }
  public Memento createMemento(){ // スナップショットを撮る
    Memento m = new Memento(money);
    Iterator it = fruits.iterator();
    while(it.hasNext()){
      String f = (String)it.next();
      if(f.startsWith("おいしい")){
        m.addFruit(f);
      }
    }
    return m;
  }
  public void restoreMemento(Memento memento){ // アンドゥ
    this.money = memento.money;
    this.fruits = memento.getFruits();
  }
}
