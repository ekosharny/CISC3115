import java.io.*;
import java.util.*;

public class PhoneNumber{
  public PhoneNumber(String number){
    this.number = number;
  }
  
  public String getAreaCode(){return number.substring(1,4);}
  public String getExchange(){return number.substring(5,8);}
  public String getLineNumber(){return number.substring(9,13);}
  
  public boolean isTollFree(){
    if((number.charAt(1) != '8')){return false;}
    else
      return true;
  }
  
  public boolean equals(PhoneNumber other) {return number.equals(other.number);}

  public String toString() {return number;}

  public static PhoneNumber read(Scanner scanner) throws IOException{
  if (!scanner.hasNext()) return null;
  String number = scanner.next();
  return new PhoneNumber(number);
 }
  
  private String number;
  
  public static void main(String [] args)throws Exception{
    Scanner scanner = new Scanner(new File("numbers.txt"));
    
    int count=0;
    String pnumber = "";

    PhoneNumber number = read(scanner);
    while(number != null){
      if(pnumber.equals(number.toString())){
        System.out.println("Duplicate phone number \"" + number.toString() + "\" discovered");
      }
      else{
      System.out.println("phone number: " + number.toString());
      System.out.println("area code: " + number.getAreaCode());
      System.out.println("exchange: " + number.getExchange());
      System.out.println("line number: " + number.getLineNumber());
      System.out.println("is toll free: " + number.isTollFree());
      System.out.println();
      }
      
      count++;
      pnumber = number.toString();
      number = read(scanner);
    }
    System.out.println("---");
    System.out.println(count + " phone numbers processed.");
  }
      
}