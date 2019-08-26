import java.util.Scanner;
import java.io.*;
public class ArrayInfo{
  public static void main(String [] args)throws IOException{
    
    Scanner infile = new Scanner(new File("numbers.txt"));
    
    int header = infile.nextInt();
    double [] array = new double[header];
 
    for(int i=0; i<header; i++)
      array[i] = infile.nextDouble();
      
    printing(array, header);
    
    System.out.println("The first element of the array is " + array[0]);
    System.out.println("The last element of the array is " + array[array.length - 1]
                     + " and is at position " + (array.length-1));
    System.out.println("The middle element of the array is " + 
                       array[(array.length-1)/2] + " and is at position " + 
                       ((array.length-1)/2));
    
    double large = max(array);
    int maxPos = maxPosition(array);
    System.out.println("The largest element of the array is " + large + 
                       " and is at position " + maxPos);
    
    double small = min(array);
    int minPos = minPosition(array);
    System.out.println("The smallest element of the array is " + small + 
                       " and is at position " + minPos);
  }

  public static void printing(double [] arr, int head)throws IOException{
    System.out.print("The array: {");
    for (int i = 0; i<arr.length; i++){
      if(i!=0)
        System.out.print(", ");
      System.out.print(arr[i]);
    }
    System.out.println("} contains " + head + " elements");
  }
  
  public static double max(double[] arr){
    double largest = arr[0];
    for(int i = 1; i < arr.length; i++)
      if(arr[i] > largest) largest = arr[i];
    return largest;
  }
  
    public static int maxPosition(double[] arr){
    double largest = arr[0];
    int index=0;
    for(int i=1; i < arr.length; i++)
      if(arr[i] > largest) {
      largest = arr[i];
      index=i;
    }
    return index;
  }

  
  public static double min(double[] arr){
    double smallest = arr[0];
    for(int i=1; i<arr.length; i++)
      if(arr[i] < smallest) smallest = arr[i];
    return smallest;
  }
  
  public static int minPosition(double[] arr){
    double smallest =arr[0];
    int index=0;
    for(int i=1; i < arr.length; i++)
    {
      if(arr[i] < smallest){
        smallest=arr[i];
      index = i;}
    }
    return index;  
  }
}