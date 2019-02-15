class Solution{
  static void swapValues(int arr[]){
    
    int temp;
    
    if(arr.length%2 ==0){
      
      for(int i=0;i<arr.length;i=i+2){
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }
    }
    
    else{
      for(int i=0;i<arr.length-1;i=i+2){
        temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    
    //printing array
    
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
      System.out.print(" ");
    }
    System.out.println("");
  }
  }
  

  public static void main(String args[]){
    
    swapValues(new int[]{111,77,88,44,32,11,13,25,44});
  }
  
}
