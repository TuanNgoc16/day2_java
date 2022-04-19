//1.4
public class testEmployee {
    public static void main (String [] agrs ) {
        Employee a1 = new Employee(1, "Pham ", "Tuan ngoc", 2);
       System.out.println(" Id : " + a1.getID());
       System.out.println("FirstName :" + a1.getfirstName());
       System.out.println("LastName : " + a1.getlastName());
       System.out.println("Salary  :" + a1.getSalary());
        System.out.println("AnnalSalary  : " + a1.getAnnalSalary());

    }
}
