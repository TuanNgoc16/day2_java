public class testInvoiceitem {
    public static void main (String [] agrs ) {
        InvoiceItem a2 = new InvoiceItem("M1" ,"N2", 3, 1.2);
        System.out.println("Id : " + a2.getID());
        System.out.println("Desc :" + a2.getDesc());
        System.out.println("Qty  :" + a2.getQty());
        System.out.println("UnitPrice :" + a2.getUnitPrice());
        System.out.println("UnitPrice : " + a2.setUnitPrice());
        System.out.println("Total  :" + a2.getTotal());
        System.out.println("toString  : " + a2.toString());

    }
}
