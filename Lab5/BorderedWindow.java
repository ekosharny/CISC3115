import java.io.*;
import java.util.*;
public class BorderedWindow extends Window{
  private int width;
  private int height;
  public BorderedWindow(int width, int height){
    super(width, height);
  }
  public int getWidth(){
    return width+2;
  }
  public int getHeight(){
    return height+2;
  }
  
  public void resize(int x, int y){
    width=x;
 height=y;
  }
  
  public String toString(){
    return "a " + super.getWidth() + "x" + super.getHeight() + " window with a border";
  }
  
  public void displayNormal(){ 
    System.out.print("+");
    for(int i=0; i<super.getWidth(); i++){
      System.out.print("-");
    }
    System.out.println("+");
    for(int k=0; k<super.getHeight(); k++){
      System.out.print("|");
      for(int j=0; j<super.getWidth(); j++){
        System.out.print(" ");
      }
  System.out.println("|");
    }
    System.out.print("+");
    for(int x=0; x<super.getWidth(); x++){
      System.out.print("-");
    }
    System.out.println("+");
  }
  
  public static BorderedWindow read(Scanner scanner){
    if(!scanner.hasNext()) return null;
    int width = scanner.nextInt();
    int height = scanner.nextInt();
    return new BorderedWindow(width, height);
  }
}