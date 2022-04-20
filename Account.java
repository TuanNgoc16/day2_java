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
        public int credit ( int amount ){
            balance += amount;
            return balance;
        }
        public int debit ( int amount ) {
            if ( amount <= balance) {
            balance -=  amount;

            }
            else {
                System.out.println("Amount exceeded ");
            }
            return balance;
        }
        public int transferTo ( Account another , int amount){
            if ( amount <= balance) {
                another.balance += amount;
                balance -= amount;

            }
            else {
                System.out.println("Amount exceeded ");
            }
            return balance;
        }

        public String toString () {
            return "Employee [ ID = " + id + "Name  " + name   + " Balance " + balance  ;
        }

    }
