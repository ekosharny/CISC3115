import java.io.*;
import java.util.*;

public class PhonebookEntry{
  
  private static Name name;
  private static PhoneNumber phoneNumber;
  
  public PhonebookEntry(Name name, PhoneNumber phonenumber){
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
  
  public Name getName(){return name;}
  public PhoneNumber getPhoneNumber(){return phoneNumber;}
  
  public static void call(){
    if(phoneNumber.isTollFree()==true){
      System.out.println("Dialing (toll-free) " + name + ": " + phoneNumber);
    }
    else System.out.println("Dialing " + name + ": " + phoneNumber);
  }
  
  public boolean equals(PhonebookEntry other) {return name.equals(other.name) &&
    phoneNumber.equals(other.phoneNumber);}

  public String toString() {return name + ": " + phoneNumber;}

  public static PhonebookEntry read(Scanner scanner) throws IOException {
  if (!scanner.hasNext()) return null;
  name = Name.read(scanner);
  phoneNumber = PhoneNumber.read(scanner);
  
  return new PhonebookEntry(name, phoneNumber);
 }
  
  public static void main(String [] args)throws Exception{
    
    Scanner infile = new Scanner(new File("phonebook.txt"));
    
    int count=0;
    String pname = "";
    String pentry = "";
    
    PhonebookEntry entry = read(infile);
    
    while(entry != null){
      if(pentry.equals(entry.toString())){
        System.out.println("Duplicate phone book entry: \"" + entry.toString() + "\" discovered");
      }
      else if(pname.equals(name.toString())){
        System.out.println("Warning duplicate name \"" + entry.toString() + "\" discovered");
        System.out.println("phone book entry: " + entry.toString());
        PhonebookEntry.call();
        System.out.println();
      }
      else{
         
    System.out.println("phone book entry: " + entry.toString());
    PhonebookEntry.call();
    System.out.println();
      }
    
    count++;
    pname = name.toString();
    pentry = entry.toString();
    entry = read(infile);
    }
    
    System.out.println("---");
    System.out.println(count + " phone numbers processed.");
  }
}