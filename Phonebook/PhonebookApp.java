import java.io.*;
import java.util.*;

public class PhonebookApp{
public static void main(String [] args) throws Exception {
  final String FILENAME = "phonebook.txt";

  Scanner scanner = new Scanner(System.in);
  
  System.out.print("lookup, quit (l/q)?");
  while(scanner.hasNext()){
    char input = scanner.next().charAt(0);
    if(input!='q'){
      if(input == 'l'){
        System.out.print("last name?");
        String lastname = scanner.next();
        System.out.print("first name?");
        String firstname = scanner.next();
        Phonebook03 pb = new Phonebook03(FILENAME);
        if(pb.lookup(firstname, lastname)){
          System.out.println(pb.toString());
        }
        else
          System.out.println("-- Name not found");
      }
      System.out.print("lookup, quit (l/q)?");
    
    }
    else{
      System.out.println();
    }
  }
}
}