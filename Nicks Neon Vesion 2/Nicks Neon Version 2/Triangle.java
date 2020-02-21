/**
 * This is a class for triangle out of our book intro to java 
 * @author (Thomas J. Short)
 * @version (02/20/2020)
 * @chapter (chapter 11)
 */ 
public class Triangle extends GeometricObject {
   int initialTriangleBrackets = 3;  
// data fields
  private double sideA, sideB, sideC;

  // constructors
  public Triangle() {
    this(1.0, 1.0, 1.0);
  }

  public Triangle(double sideA, double sideB, double sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  // instance methods
  @Override
  public double getArea() {
    double s = (sideA + sideB + sideC) / 2.0;
    return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
  }

  @Override
  public double getPerimeter() {
    return sideA + sideB + sideC;
  }

  // get side A

  public double getSideA() {
    return sideA;
  }
  /** Set sideA
     * @param sideA */
  public void setSideA(double sideA) {
    this.sideA = sideA;
	}
  // get side B
 
  public double getSideB() {
    return sideB;
  }
  /** Set sideB
     * @param sideA */
  public void setSideB(double sideA) {
    this.sideA = sideB;
	}

  // get side C

  public double getSideC() {
    return sideC;
  }
  /** Set sideA
     * @param sideA */
  public void setSideC(double sideA) {
    this.sideA = sideC;
	}

  // overrides
  @Override
  public String toString() {
      return String.format("%.1fcm - Triangle, %.1fcm x %.1fcm x %.1fcm", getPerimeter(),
                getSideA(), getSideB(), getSideC());
     
  }

    @Override
    public int getNumBrackets() {
       return initialTriangleBrackets;  
    }

    @Override
    public double getTubeLength() {
      return 0;   
    }
}