//1.5
 public class InvoiceItem {
    String id ;
    String desc;
    int qty ;
    double unitPrice ;
    public InvoiceItem (String a, String b, int c, double d ){
        id = a;
        desc = b ;
        qty = c ;
        unitPrice = d ;
    }
    public void setQty ( int a) {
        a = qty ;
    }
    public String getID ( ) {
        return  id;
    }
    public String getDesc ( ) {
        return  desc;
    }
    public int getQty ( ) {
        return  qty;
    }
    public double getUnitPrice ( ) {
        return unitPrice;
    }
    public double setUnitPrice ( ) {
        return unitPrice;
    }
    public double getTotal ( ) {
        return unitPrice * qty;
    }
    public String toString () {
        return "InvoiceItem [ id " + id + " Desc " + desc + " qty " +qty + " UnitPrice " + unitPrice ;
    }

}
