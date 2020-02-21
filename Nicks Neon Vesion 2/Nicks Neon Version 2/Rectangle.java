
public class Rectangle extends GeometricObject {
  private double width;
  private double height;
  private int initialRectangleBrackets = 4; 
  
  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width
     * @return  */
  
  public double getWidth() {
    return width;
  }

  /** Set a new width
     * @param width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height
     * @return  */

  public double getHeight() {
    return height;
  }

  /** Set a new height
     * @param height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }

   @Override
    public String toString(){
      
         return String.format("%.1f cm - rectangle, %.1f cm x %.1f cm ", getPerimeter(),getWidth(),
         getHeight()); 

    }

    @Override
    public int getNumBrackets() {
        return initialRectangleBrackets;
    }

    @Override
    public double getTubeLength() {
      return 0 ;
    }
    
}
