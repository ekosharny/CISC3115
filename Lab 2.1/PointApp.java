import java.util.Scanner;
import java.io.*;

public class PointApp{
  public static void main(String[] args)throws IOException{
    
    Scanner infile = new Scanner(new File("points.txt"));
    
    Point point1 = Point.read(infile);
    Point point2 = Point.read(infile);
    
    System.out.println("p1: " + point1 + " (quadrant "  + point1.quadrant() + ")" + 
                       " / p2: " + point2 + " (quadrant " + point2.quadrant() + ") \n" +
                       "p1+p2: " + point1.add(point2) + " (quadrant " + 
                       (point1.add(point2)).quadrant() + ") \n" + 
                       "The distance between " + point1 + " and " + point2 + " is " +
                       point1.distance(point2) + "\n");
    
    Point point3 = Point.read(infile);
    Point point4 = Point.read(infile);
    
    System.out.println("p1: " + point3 + " (quadrant "  + point3.quadrant() + ")" + 
                       " / p2: " + point4 + " (quadrant " + point4.quadrant() + ") \n" +
                       "p1+p2: " + point3.add(point4) + " (quadrant " + 
                       (point3.add(point4)).quadrant() + ") \n" + 
                       "p1 and p2 are reflections across the x-axis \n" +
                       "p1 and p2 are equidistant from the origin \n" +
                       "The distance between " + point3 + " and " + point4 + " is " +
                       point3.distance(point4) + " \n");
    
    Point point5 = Point.read(infile);
    Point point6 = Point.read(infile);
    
    System.out.println("p1: " + point5 + " (quadrant "  + point5.quadrant() + ")" + 
                       " / p2: " + point6 + " (quadrant " + point6.quadrant() + ") \n" +
                       "p1+p2: " + point5.add(point6) + " (quadrant " + 
                       (point5.add(point6)).quadrant() + ") \n" + 
                       "p1 and p2 are reflections across the y-axis \n" +
                       "p1 and p2 are equidistant from the origin \n" +
                       "The distance between " + point5 + " and " + point6 + " is " +
                       point5.distance(point6) + "\n");  
    
    Point point7 = Point.read(infile);
    Point point8 = Point.read(infile);
    
    System.out.println("p1: " + point7 + " (quadrant "  + point7.quadrant() + ")" + 
                       " / p2: " + point8 + " (quadrant " + point8.quadrant() + ") \n" +
                       "p1+p2: " + point7.add(point8) + " (quadrant " + 
                       (point7.add(point8)).quadrant() + ") \n" + 
                       "p1 and p2 are reflections through the origin \n" +
                       "p1 and p2 are equidistant from the origin \n" +
                       "The distance between " + point7 + " and " + point8 + " is " +
                       point7.distance(point8) + "\n");
    
    Point point9 = Point.read(infile);
    Point point10 = Point.read(infile);
    
    System.out.println("p1: " + point9 + " (quadrant "  + point9.quadrant() + ")" + 
                       " / p2: " + point10 + " (quadrant " + point10.quadrant() + ") \n" +
                       "p1+p2: " + point9.add(point10) + " (quadrant " + 
                       (point9.add(point10)).quadrant() + ") \n" + 
                       "p1 and p2 are reflections across the x-axis \n" +
                       "p1 and p2 are reflections across the y-axis \n" +
                       "p1 and p2 are reflections through the origin \n" +
                       "p1 and p2 are equidistant from the origin \n" +
                       "The distance between " + point9 + " and " + point10 + " is " +
                       point9.distance(point10) + "\n");
    
    Point point11 = Point.read(infile);
    Point point12 = Point.read(infile);
    
    System.out.println("p1: " + point11 + " (quadrant "  + point11.quadrant() + ")" + 
                       " / p2: " + point12 + " (quadrant " + point12.quadrant() + ") \n" +
                       "p1+p2: " + point11.add(point12) + " (quadrant " + 
                       (point11.add(point12)).quadrant() + ") \n" + 
                       "p1 and p2 are equidistant from the origin \n" +
                       "The distance between " + point11 + " and " + point12 + " is " +
                       point11.distance(point12) + " \n");
    
    Point point13 = Point.read(infile);
    Point point14 = Point.read(infile);
    
    System.out.println("p1: " + point13 + " (quadrant "  + point13.quadrant() + ")" + 
                       " / p2: " + point14 + " (quadrant " + point14.quadrant() + ") \n" +
                       "p1+p2: " + point13.add(point14) + " (quadrant " + 
                       (point13.add(point14)).quadrant() + ") \n" + 
                       "The distance between " + point13 + " and " + point14 + " is " +
                       point13.distance(point14) + " \n");
    
    infile.close();
    
  }
}