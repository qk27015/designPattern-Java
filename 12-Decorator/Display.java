public abstract class Display{
  public abstract int getColumns();
  public abstract int getRows();
  public abstract String getRowText(int row); // row番目の文字列を得る
  
  public final void show(){
    for(int i = 0; i < getRows(); i++){
      System.out.println(getRowText(i));
    }
  }
}
