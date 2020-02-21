import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program allows the user to enter specified information
 * about an object and it will calculate the outside dimension
 * add up the total length of material needed
 * @author (Thomas J. Short)
 * @version (2/3/2020)
 * @course (CIS 261)
 * @semester (winter 2020)
 */
public class Materials
{
   
    public static void main(String[] args)
    {
        // declare variables to count shapes
        int squaresCounter = 0;
        int circlesCounter = 0;
        int rectanglesCounter = 0;
        int trianglesCounter = 0;
        
        // create 4 shape counting variable
        ArrayList<GeometricObject> shapesList = new ArrayList<>();
        System.out.println("Welcome to Nick's neons");
        String userstring = " ";
        Scanner input;
        // declare instance variable
        double total = 0;
        
        while(userstring.contains("q") != true)
        {
            
            System.out.print(" press r for rectangle\n press s for square\n " + 
            "press c for cirlce\n press t for triangle\n You may press q to exit and calculate total\n");
            input = new Scanner(System.in);
            userstring = input.nextLine();
            userstring = userstring.toLowerCase();
            for (int countshapes = 0; countshapes < userstring.length(); countshapes++)
            {
                // convert to character
                char letterPressed = userstring.toLowerCase().charAt(countshapes);
                if (letterPressed == 'r')
                {
                    
                    System.out.print("Enter the width");
                    double width = input.nextDouble();
               
                    System.out.print("Enter the height");
                    double height = input.nextDouble();
                    
                    
                    // construct a rectangle
                    Rectangle rectangle = new Rectangle(width, height);
                   
                     System.out.printf("The perimeter of a %.1fcm x %.1fcm rectangle is: %.1fcm\n",
                             rectangle.getWidth(), rectangle.getHeight(),rectangle.getPerimeter());
                               total += rectangle.getPerimeter();
                               shapesList.add(rectangle);
                    
                   
                             
                }
                else if (letterPressed == 's')
                {
                    System.out.print("Enter the height");
                    double height = input.nextDouble();
                    // construct a new square object
                    Square square = new Square(height);
                    
                    System.out.printf("The perimeter of a square with a height of %.1fcm is: %.1fcm\n", 
                            square.getHeight(),square.getPerimeter() );
                    // get total length of square
                    total += square.getPerimeter();
                    // add shape to shapes list
                    shapesList.add(square);
                    
                }
                else if (letterPressed == 'c')
                {
                    
                    System.out.print("Enter the radius of the circle");
                    double radius = input.nextDouble();
                    
                    // create circle object with user paremeters
                    Circle circle = new Circle(radius);
                  
                    
                    // print circumference
                    System.out.printf("The circumference of the circle with a radius of %.1fcm is: %.1fcm\n",
                          circle.getRadius(),   circle.getPerimeter());
                    // total of all circle circumferences
                    total += circle.getPerimeter();
                    shapesList.add(circle);
                    
                }
                else if (letterPressed == 't')
                {
                    // get side a and add its dimensions to list
                    System.out.print("Enter side A");
                    double sideA = input.nextDouble();
                    
                    // get side b 
                    System.out.print("Enter side B");
                    double sideB = input.nextDouble();
                    
                    // get side c
                    System.out.print("Enter side B");
                    double sideC = input.nextDouble();
                    
                    // create triangle objust baseed on user input
                    Triangle triangle = new Triangle(sideA, sideB, sideC);
                    
                    // print the perimeter
                    System.out.printf("The perimeter of a triangle with a %.1fcm sideA %.1fcm sideB %.1fcm sideC is %.1fcm \n",
                    triangle.getSideA(), triangle.getSideB(), triangle.getSideC(), triangle.getPerimeter());
                    
                    total += triangle.getPerimeter();
                    shapesList.add(triangle);
                }
                // check for invalid characters
                else if (letterPressed != 'q')
                {
                   System.out.println(letterPressed + " is an ivalid character");
                } 
                
                  
                
            }// end for loop
            
           
        }// end while loop
        System.out.println("");
        System.out.println("Your Shapes and Dimension are:");
        System.out.println("------------------------------");
        
        for (GeometricObject x: shapesList)
        {
             System.out.println(x.toString());
                   
             // add to variable count
             if(x instanceof Circle)
             {
                 circlesCounter++;
             }
             if(x instanceof Rectangle)
             {
                 rectanglesCounter++;
             }
             if(x instanceof Triangle)
             {
                 trianglesCounter++;
             }
             if(x instanceof Square)
             {
                 squaresCounter++;
             }
                   
        }// end for loop
        // print total material needed
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("Shapes needed");
        System.out.println("-------------");
         
        if (circlesCounter == 1)
        {
            System.out.println(circlesCounter + " Circle"  );
        }
        else if (circlesCounter > 1)
        {
            System.out.println(circlesCounter + " Circles" );
        }
        if (squaresCounter == 1)
        {
            System.out.println(squaresCounter  + " Square" );
        }
        else if (squaresCounter > 1)
        {
            System.out.println(squaresCounter  + " Squares" ); 
        }
        if (rectanglesCounter == 1)
        { 
            System.out.println(rectanglesCounter + " Rectangle");
        }
        else if (rectanglesCounter > 1)
        {
            System.out.println(rectanglesCounter + " Rectangles");
        }
        if (trianglesCounter == 1)
        { 
            System.out.println(trianglesCounter + " Triangle");
        }
        else if (trianglesCounter > 1)
        { 
            System.out.println(trianglesCounter + " Triangles");
        }
        // print the total length
        System.out.println("-------------");
        System.out.println("");
        System.out.printf("Total length of material needed is: %.1f centimeters\n", total);
    }// end main method 
}// end of class
