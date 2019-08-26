public abstract class Window implements GUIComponent{
  
  private int height;
  private int width;
  private boolean minimized;
  private boolean visible;
  
  public Window(int width, int height){
    this.width=width;
    this.height=height;
  }
  
  public void display(){
 if(visible==false){
  System.out.println("(Nothing to see here)");
   }
 else{
  if(minimized==false)
   displayNormal();
  else
   System.out.println("[" + toString() + " (minimized)]");
   }
  }
  
  public void setVisible(boolean visible){
    this.visible=visible;
  }
    
 public boolean isVisible(){
  return visible;
 }
  
  public abstract void displayNormal();
  
  public void resize(int x, int y){
    width=x;
   height=y;
  }
  
  public int getHeight(){
    return height;
  }
  public int getWidth(){
    return width;
  }
  
 public void minimize(){
 minimized=true;
 }
 public void restore(){
 minimized=false;
 }
}