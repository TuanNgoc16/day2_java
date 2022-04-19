public class product {
    String name;
    float price;
    int quantity;
    int id;
    public product (){
        name = "Banh My ";
        price = (float) 10.12;
        quantity = 5 ;
        id = 1;
    }
    public product (String a, float b, int c, int d) {
        name = a ;
        price = b;
        quantity = c;
        id = d;
    }
    public String getName (){
        return  name;
    }
    public float getprice (){
        return  price;
    }
    public int getquantity (){
        return  quantity;
    }public int getId (){
        return  id;
    }

}
