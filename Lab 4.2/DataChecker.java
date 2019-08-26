import java.util.Scanner;
import java.io.*;

public class DataChecker{
  public static void main(String [] args)throws Exception{
    Scanner infile = new Scanner(new File("numbers.txt"));
    
    int count=0;
    int count2=0;
    int count3=0;
    
    while(infile.hasNextLine()){
      
      String line = infile.nextLine();
      
     // double average = averages(line);
      count++;
      try{
      System.out.println("The average of the values on line " + count + " is " + 
                         averages(line));
      }catch(Exception e) {
        System.out.println("***Error (line " + count + ")" + e.getMessage());
      }
    }
    
  }
  
  static double averages(String numbers)throws Exception{
    Scanner scanner = new Scanner(numbers);
    int header=1;
    int sum=0;
    int integers=0;
    if(!scanner.hasNext())throw new Exception(" Line is empty - average can't be taken");
    while(scanner.hasNext()){
      header = scanner.nextInt();
      if(header==0)throw new Exception(" Header value of 0 - average can't be taken");
      if(header<0)throw new Exception(" Corrupt line - negative header value");
      for(int i=1; i<=header; i++){
        integers = scanner.nextInt();
        sum+=integers;
      }
    }
    
    double average = (double)(sum)/header;
    return average;
  }
}