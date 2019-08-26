import java.io.*;
import java.util.*;
public class ColoredWindow extends Window{
  private int width;
  private int height;
  private char bc;
  
  public ColoredWindow(int width, int height, char bc){
    super(width, height);
    this.bc = bc;
  }
  public ColoredWindow(int width, int height){
    this(width, height, '.');
  }
  
  public String toString(){
    return "a " + getWidth() + "x" + getHeight() + " window with background color '" + bc + "' (minimized)";
  }
  
  public char getColor(){
    return bc;
  }
  
  public void setColor(char bc){
    this.bc=bc;
  }
  
  public void displayNormal(){
    for(int i=0; i<=width; i++){
      for(int j=0; j<=height; j++){
        System.out.println(bc);
      }
    }
  }
  
  public static ColoredWindow read(Scanner scanner){
    if(!scanner.hasNext())return null;
    int width = scanner.nextInt();
    int height = scanner.nextInt();
    char bc = scanner.next().charAt(0);
    return new ColoredWindow(width, height, bc);
  }
}


