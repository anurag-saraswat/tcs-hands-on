
public class Solution{
  
  public static Employee getEmployeeWithMaxAge(Employee e1, Employee e2, Employee e3){
    
    return e1.age>e2.age ? (e1.age>e3.age ? e1:e3):(e2.age>e3.age?e2:e3) ;
    
  }
  
  public static void main (String args[]){
    
    Employee e1 = new Employee(22,"aaa",1);
    Employee e2 = new Employee(33,"bbb",2);
    Employee e3 = new Employee(44,"ccc",3);
    
    Employee result  = getEmployeeWithMaxAge(e1, e2, e3);
    System.out.println(result.id + " " + result.name + " " + result.age);
    
  }
}