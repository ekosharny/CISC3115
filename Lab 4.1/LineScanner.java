import java.util.Scanner;
import java.io.*;

public class LineScanner{
  public static void main(String[] args)throws IOException{
    Scanner infile = new Scanner(new File("numbers.txt"));
    
    int count=0;
    int count2=0;
    
    while(infile.hasNextLine()){
      String line = infile.nextLine();
      Scanner lineScanner = new Scanner(line);
      while(lineScanner.hasNext()){ 
        String number = lineScanner.next();
        count++;
      }
      count2++;
      System.out.println("There are " + count + " numbers on line " + count2);
      count=0;
    } 
  }
}