import java.util.*;
import java.io.*;

public class ExtendedPhoneNumber extends PhoneNumber{
  private String description;
  
  public ExtendedPhoneNumber(String number, String description){
    super(number);
    this.description=description;
  }
  
  public static ExtendedPhoneNumber read(Scanner scanner){
    if(!scanner.hasNext()) return null;
    String description = scanner.next();
    String number = scanner.next();
    return new ExtendedPhoneNumber(description, number);
  }
}
