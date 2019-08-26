import java.util.*;
import java.io.*;

public class AuthenticatorApp{
  public static void main(String[] args) throws Exception{
    Authenticator authenticator = new Authenticator("users.txt");
    Scanner input = new Scanner(System.in);
    boolean valid = false;
    int count = 0;
    while(valid == false){
      System.out.print("username?: ");
      String username = input.next();
      System.out.print("password?: ");
      String password = input.next();
      try{
        authenticator.authenticate(username, password);
      }
      catch(Exception e){
        System.out.println("***" + e.getMessage());
        count++;
        if(count>=3){
          System.out.println("Too many failed attempts... please try again later");
        }
      }
    }
    if(valid == true)
      System.out.println("Welcome to the System");
  }
}