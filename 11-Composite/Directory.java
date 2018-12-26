import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry{
  private String name;
  private ArrayList directory = new ArrayList();

  public Directory(String name){ this.name = name; }

  public String getName(){ return name; }
  public int getSize(){
    int size = 0;
    Iterator it = directory.iterator();
    while(it.hasNext()){
      Entry e = (Entry)it.next();
      size += e.getSize(); // fileでもディレクトリでも再帰的に取得
    }
    return size;
  }

  public Entry add(Entry entry){
    directory.add(entry);
    return this;
  }

  protected void printList(String prefix){
    System.out.println(prefix + "/" + this);
    Iterator it = directory.iterator();
    while(it.hasNext()){
      Entry e = (Entry)it.next();
      e.printList(prefix + "/" + name);
    }
  }
}
