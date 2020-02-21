
/**
 *This is a square class which i should have just extended to 
 *rectangle
 *
 * @author (Thomas J. Short)
 * @version (02/03/2020)
 */
public class Square extends GeometricObject
{
    // instance variables 
    private double height;
    private int InitialSquareBrackets = 4;
    /**
     * Constructor for objects of class Square
     */
    public Square()
    {
        
    }
    /**
     * 
     * @param height
     */
    public Square(double height) 
    {
        this.height = height;
    }
      /** Return height
     * @return  */
    public double getHeight() 
    {
        return height;
    }

    /** Set a new height
     * @param height */
    public void setHeight(double height) 
    {
      this.height = height;
    }
      /** Return area
     * @return  */
    @Override
    public double getArea() 
    {
       return height * height;
    }

    /** Return perimeter
     * @return  */
    @Override
    public double getPerimeter() 
    {
      return 4 * (height);
    }

    @Override
    public String toString(){
      
        return String.format("%.1fcm - Square, Height %.1fcm",
                getPerimeter(), getHeight());
    }

    @Override
    public int getNumBrackets() {   
      return  InitialSquareBrackets;
    }
    
    
    @Override
    public double getTubeLength() {
        return 0;// need help getting total legth of all instances of this object
    }

    
}
