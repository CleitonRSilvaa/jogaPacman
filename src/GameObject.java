
public abstract class GameObject {

  private int x ;
  private int y ;
  private int ScreenSize;
  
  public GameObject() {
  }

  public GameObject(int x, int y) {
    if ( x >=0 || y >=0 ){
      this.x = x;
      this.y = y;
    } 
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) { 
    if(x>=0)this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    if(y>=0)this.y = y;
  }

  public int getScreenSize() {
    return this.ScreenSize;
  }

  public void setScreenSize(int screenSize) {
    if(screenSize>0 ) ScreenSize = screenSize;
  }

  
}
