public class Solution{
  
  public static Employee employeeWithSecondLowestAge(Employee arr[]){
    Employee largest=arr[0],s_largest=arr[0],obj;
    
    for(int i=1;i<arr.length;i++){
      obj = arr[i];
      if(obj.age>largest.age){
        s_largest = largest;
        largest = arr[i];
        
      }
    }
    
    return s_largest;
  }
  
  public static void main(String args[]){
    
    Employee e1 = new Employee(1,"aaa",22);
    Employee e2 = new Employee(2,"bbb",33 );
    Employee e3 = new Employee(3,"ccc",55 );
    Employee e4 = new Employee(4,"ddd",44 );
    
    Employee result = employeeWithSecondLowestAge(new Employee[]{e1,e2,e3,e4});
    System.out.println(result.id+" "+result.name+" "+result.age);
    
  }
  
  
}
