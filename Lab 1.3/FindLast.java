import java.util.Scanner;
import java.io.*;

public class FindLast{
  public static void main(String[] args)throws IOException{
    Scanner input = new Scanner(System.in);

    int index = 0;
    int number=0;
    
    System.out.print("Enter a number: ");
    while(input.hasNextInt()){
      number = input.nextInt();
      index = findLast(number);
      
      if(index!=0)
        System.out.println(number + " last appears in the file at position " + index);
      else
        System.out.println(number+ " does not appear in the file");
      System.out.print("Enter a number: ");
    }
                                 
  }
  
  public static int findLast(int val)throws IOException{
    Scanner infile = new Scanner(new File("numbers.txt"));
   
    int position =0;
 
    for(int i=0; i<12; i++){
      int numbers = infile.nextInt();
      
      if(val == numbers)
        position = i+1;
    }
    return position;
  }
}