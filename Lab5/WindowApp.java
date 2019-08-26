import java.util.*;
import java.io.*;
public class WindowApp{
  public static void main(String[] args){
    Window [] array = new Window(25);
    Scanner scanner = new Scanner(new File("window.data"));
    String header = "";
    ColoredWindow cw = new ColoredWindow(
    
    for(int i=0; i<array.length; i++){
      header = scanner.next();
      if(header=="C")
        
    
  }
}