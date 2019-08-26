import java.util.Scanner;
import java.io.*;

public class Averages{
  public static void main(String[] args)throws IOException {
    Scanner infile = new Scanner (new File("numbers.txt"));
    
    int count=0;
    
    while(infile.hasNextInt()) {
    
      int header = infile.nextInt();
      int numbers = 0;
      int sum = 0;
      double avg = 0;
      
      
      System.out.print("The average of the " + header + " integers ");
      
      for(int i=1; i <= header; i++){
        numbers = infile.nextInt();
        System.out.print(numbers + " ");
        sum += numbers;
      }
      count++;
      avg = (double)sum/header;
      
      System.out.println("is " + avg);
    }
    System.out.println(count + " sets of numbers processed");
  }
}
