import java.util.*;

public class Main{
  public static void main(String[] args){
    BookShelf bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("Around in the world"));
    bookShelf.appendBook(new Book("effective Java"));

    Iterator it = bookShelf.iterator();
    while(it.hasNext()){
      Book book = (Book)it.next();
      System.out.println(book.getName());
    }
  }
}
