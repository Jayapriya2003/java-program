public class Employee{
int EmpId;
String EmpName;
int EmpSalary;
int EmpAge;

//constructor
public Employee()
{
EmpId=30;
EmpName="jaya";
EmpSalary=5000;
EmpAge=21;
}
//main class
public static void main(String args[]){
Employee mystudent=new Employee();
System.out.println("EmployeeId: "+ mystudent.EmpId);
System.out.println("EmployeeName: "+ mystudent.EmpName);
System.out.println("EmployeeSalary: "+ mystudent.EmpSalary);
System.out.println("EmployeeAge: "+ mystudent.EmpAge);
}
}