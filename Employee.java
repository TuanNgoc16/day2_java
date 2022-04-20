//1.4
public class Employee {
    int id;
    String firstName ;
    String lastName ;
    int salary ;
    public Employee (int a, String b, String c, int d ){
        id = a;
        firstName = b ;
        lastName = c ;
        salary = d ;
    }
    public int getID ( ) {
        return  id;
    }
    public String getfirstName ( ) {
        return  firstName;
    }
  public String getlastName ( ) {
        return  lastName;
    }
    public int getSalary ( ) {
        return  salary;
    }
    public int getAnnalSalary () {
        return  salary * 12 ;
    }
    public String toString () {
        return "Employee [ ID = " + id + "Name  " + firstName  + lastName + "," + " Salary " + salary  ;
    }

}
