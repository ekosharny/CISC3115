import java.util.Scanner;
import java.io.*;

public class User{
  private String username;
  private String password;
  private String hint;
  
  public User(String username, String password, String hint){
    this.username = username;
    this.password = password;
    this.hint = hint;
  }
  
  public String getUsername(){return username;}
  public String getHint(){return hint;}
  
  public boolean verifyPassword(String x){
    return password.equals(x);
  }
  
  public String toString(){return "User " + username;}
  
  public static User read(Scanner scanner){
    if(!scanner.hasNext())return null;
    String username = scanner.next();
    String password = scanner.next();
    String hint = scanner.next();
    return new User(username, password, hint);
  }
  
  
  public static void main(String[] args)throws IOException{
    Scanner infile = new Scanner(new File("users.txt"));
     
  }
}