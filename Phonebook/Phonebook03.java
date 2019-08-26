import java.io.*;
import java.util.*;

public class Phonebook03{
  Map<Name, PhonebookEntry2> map = new TreeMap<Name, PhonebookEntry2>();
  
  public Phonebook03(String filename)throws Exception{
    Scanner scanner = new Scanner(new File(filename));
    
    while(scanner.hasNext()){
      PhonebookEntry2 entry = PhonebookEntry2.read(scanner);
      Name name = entry.getName();
      map.put(name, entry);
      
    }
  }
  
  public boolean lookup(String first, String last){
    Name fullname = new Name(last, first);
    if(map.containsKey(fullname))
      return true;
    else
      return false;
    /**for(Iterator iter = map.keySet().iterator(); iter.hasNext();){
      fullname = (Name)iter.next();
      System.out.println(map.get(fullname).toString());
    }
    **/
  }
    
}