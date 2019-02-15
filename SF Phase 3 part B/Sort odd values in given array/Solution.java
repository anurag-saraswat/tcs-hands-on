import java.util.Arrays; 
public class Solution{
  
  static void sortOddValues(int arr[]){
    
    //finding count of odd elements
   int count=0;
    
    for(int i=0;i<arr.length;i++){
      
      if(arr[i]%2 != 0){
        count ++;
      }
    }
  
   int arrnew[] = new int[count] ;
    
    //Extracting element from orignal array and added make new array
    int j =0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2 != 0){
        arrnew[j] = arr[i];
        j++;
      }
    }
    
    //sorting new array
    Arrays.sort(arrnew);
 
    //printing array
    for(int i=0;i<arrnew.length;i++){
      System.out.print(arrnew[i]);
      System.out.print(" ");
    }
    
    System.out.println("");
  }
  
  public static void main(String args[]){
    
    
    sortOddValues(new int[]{111,77,88,44,32,11,13,25,44});
    
  }
  
}

        
