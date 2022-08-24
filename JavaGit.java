public class JavaGit {  
//instance variables of the class  
int id;  
String name;  
  
JavaGit(){  
System.out.println("this a default constructor");  
}  
  
JavaGit(int i, String n){  
id = i;  
name = n;  
}  
  
public static void main(String[] args) {  
//object creation  
JavaGit s = new JavaGit();  
System.out.println("\nDefault Constructor values: \n");  
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
  
System.out.println("\nParameterized Constructor values: \n");  
JavaGit m = new Javagit(10, "David");  
System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
}  
}