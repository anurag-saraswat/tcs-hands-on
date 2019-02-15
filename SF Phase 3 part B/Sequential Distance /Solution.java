import java.lang.*;
class Solution{
  
  public static double findSequentialDistance(Point arr[]){
    Point obj1 ,obj ;
    double distance = 0;
  for(int i=0;i<arr.length-1;i++){
    
    obj = arr[i];
    obj1 = arr[i+1];
    distance = distance + Math.sqrt( Math.pow(obj.x-obj1.x,2) + Math.pow(obj.y-obj1.y,2) );
  
  }
  
  return distance;
  }
  
  public static void main(String args[]){
    
    Point e1 = new Point(-3,-4);
    Point e2 = new Point(0,0);
    Point e3 = new Point(4,3);
    Point e4 = new Point(16,-2);
    
    double result = findSequentialDistance(new Point[]{e1,e2,e3,e4});
    System.out.println(result);
  }
  
}
