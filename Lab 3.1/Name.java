import java.io.*;
import java.util.*;

public class Name implements Comparable<Name>{
 public Name(String last, String first) {
  this.last = last;
  this.first = first;
 }
 public Name(String first) {this("", first);}
 
 public int compareTo(Name name){
   if(first.equals(name.first)&& last.equals(name.last))
     return 1;
   else
     return 0;
 }

 public String getFormal() {return first + " " + last;}
 public String getOfficial() {return last + ", " + first;}
 public String getInitials() {return first.charAt(0) + "." + last.charAt(0) + ".";}

 public boolean equals(Name other) {return first.equals(other.first) && last.equals(other.last);}

 public String toString() {return first + " " + last;}

 public static Name read(Scanner scanner) {
  if (!scanner.hasNext()) return null;
  String last = scanner.next();
  String first = scanner.next();
  return new Name(last, first);
 }

 private String first, last;
}