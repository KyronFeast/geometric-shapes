public abstract class GeometricObject {
  String color = "white";
  private boolean filled;
  final private java.util.Date DATECREATED;

  /** Construct a default geometric object */
  protected GeometricObject() {
    DATECREATED = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value
     * @param color
     * @param filled */
  protected GeometricObject(String color, boolean filled) {
    DATECREATED = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color
     * @return  */
  public String getColor() {
    return color;
  }

  /** Set a new color
     * @param color */
  public void setColor(String color) {
    this.color = color;
  }

  /** *  Return filled.Since filled is boolean,
  the get method is named isFilled
     * @return  */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled
     * @param filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get DATECREATED
     * @return  */
  public java.util.Date getDateCreated() {
    return DATECREATED;
  }

  @Override
  public String toString() {
    return "created on " + DATECREATED + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea
     * @return  */
  public abstract double getArea();
  
  public abstract int getNumBrackets();
  
  public abstract double getTubeLength(); 
  
  /** Abstract method getPerimeter
     * @return  */
  public abstract double getPerimeter();
   
  
}