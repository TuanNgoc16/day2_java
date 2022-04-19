// 1.6
public class Account {
    String id ;
    String name ;
    int balance ;
    public Account ( String a , String b ) {
        id = a;
        name = b ;

    }
    public Account ( String a , String b , int c) {
        id = a;
        name = b ;
        balance = c ;
     }
    public String getId (){
        return id ;
    }
    public String getName (){
        return name ;
    }
    public int getBalance (){
        return balance ;
    }
    public String toString () {
        return "Employee [ ID = " + id + "Name  " + name   + " Balance " + balance  ;
    }

}
