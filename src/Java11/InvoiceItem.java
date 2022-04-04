package Java11;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    public String getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public int getQty(){
        return qty;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice*qty;
    }

    public String toString(){
        return "InvoiceItem [id = " + getId() + ", qty = " + getQty() + ", unitPrice = " + getUnitPrice() +"]";
    }

    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("one", "first", 41, 2000);
        System.out.println(i1.toString());
    }
}
