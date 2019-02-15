import java.util.Scanner; 
public class Solution{
  
  public static int studentCountWithSameCityAndAge(Student e1, Student e2, Student e3){

    if((e1.city.equals(e2.city) && e1.city.equals(e3.city)) && (e1.age == e2.age && e1.age == e3.age) ){return 3;}
    else if((e1.city.equals(e2.city) && e1.age == e2.age)||(e1.city.equals(e3.city) && e1.age == e3.age)||(e3.city.equals(e2.city) && e3.age == e2.age))
    {return 2;}
    else{return 0 ;}
    
  }
  public static void main (String args[]){
    
    /*  Step 1 
    Student e1 = new Student("aaa","mumbai",15);
    Student e2 = new Student("bbb","mumbai",15);
    Student e3 = new Student("ccc","mumbai",17);
    */
    
    Scanner sc = new Scanner(System.in);
    
    String y = sc.nextLine();
    String z = sc.nextLine();
    double x = sc.nextDouble();sc.nextLine();
    Student e1 = new Student(y,z,x);
    
    y = sc.nextLine();
    z = sc.nextLine();
    x = sc.nextDouble();sc.nextLine();
    Student e2 = new Student(y,z,x);
    
    y = sc.nextLine();
    z = sc.nextLine();
    x = sc.nextDouble();sc.nextLine();
    Student e3 = new Student(y,z,x);
    
    
    int result = studentCountWithSameCityAndAge(e1, e2, e3);
    System.out.println(result);
  } 
}
