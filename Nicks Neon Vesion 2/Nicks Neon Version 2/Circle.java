/**
 * This is a class for circle out of intro to java 
 * @author (Thomas J. Short)
 * @version (02/20/2020)
 * @chapter (chapter 11)
 */ 
public class Circle extends GeometricObject {
     
// instance variables
     private double radius;
     private int initialCircleBrackets = 2;
  // no arg constructor
  public Circle() {
  }
  // constructor with radius parameter
  public Circle(double radius) {
    this.radius = radius;
  }
  
    
  public Circle(double radius, 
      String color, boolean filled) {
    this.radius = radius;
    
    setColor(color);
    setFilled(filled);
  }

  /** Return radius
     * @return 
  */
  public double getRadius() {
    return radius;
  }

  /** 
   Set a new radius
     * @param radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   Return area */
     @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }
  
  /** 
   Return diameter
     * @return  */
  public double getDiameter() {
    return 2 * radius;
  }
  
  /** 
   Return perimeter */
     @Override
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }


     @Override
    public String toString()
    {
    return String.format("%.1fcm - circle, diameter %.1fcm ",
            getPerimeter(), getDiameter()); 
               
    }

    @Override
    public int getNumBrackets() {
        return initialCircleBrackets;
    }

    @Override
    public double getTubeLength() {
        return 0; 
    }

}
