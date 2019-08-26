import java.io.*;
import java.util.*;

public class PhonebookEntry2{
  private Name name;
  private static ArrayList<ExtendedPhoneNumber> numbers = new ArrayList<ExtendedPhoneNumber>();
  
  public PhonebookEntry2(Name name, ArrayList<ExtendedPhoneNumber> numbers){
    this.name=name;
    this.numbers=numbers;
  }
  public Name getName(){return name;}
  public String getPhoneNumber(){return numbers.toString();}
  public String toString() {return name + "'s phone numbers: [" + numbers + "]";}
  
  public static PhonebookEntry2 read(Scanner scanner) throws IOException{
    if (!scanner.hasNext()) return null;
      Name name = Name.read(scanner);
      int header = scanner.nextInt();
      for(int i=0; i<header; i++){
        numbers.add(i, ExtendedPhoneNumber.read(scanner));
      }
  
    return new PhonebookEntry2(name, numbers);
  }
}