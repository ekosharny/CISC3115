import java.util.Scanner;
import java.io.*;

public class Authenticator{
  private static final int CAPACITY = 100;
  private static User [] banana=new User[CAPACITY];
  private static int size;
  
  public Authenticator(String filename) throws IOException{
    Scanner infile = new Scanner(new File(filename));
    while(infile.hasNext()){
      for(int i=0; i<CAPACITY; i++){
        banana[i] = User.read(infile);
      }
    }
  }
  
  public static boolean authenticate(String username, String password) throws Exception{
    boolean searchUser=false;
    boolean searchPass=false;
    for(int i=0; i<banana.length; i++){
      if(username.equals(banana[i].getUsername()) == true){
        searchUser=true;
        if(banana[i].verifyPassword(password)==true){
          searchPass = true;
          return true;
        }
        else throw new Exception("Invalid password - hint: " + banana[i].getHint());
      }
    }
    if(searchUser == false) throw new Exception("Invalid username");
    return false;
  }
  
}