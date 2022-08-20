package javaexercises5;

public class InvoiceItem {
    private String id;
    private String desc;
    private int quantity;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int quantity, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.quantity * this.unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id=" + this.id + ", desc=" + this.desc + 
        ", qty=" + this.quantity + ", unitPrice=" + this.unitPrice + "]" ;
    }
}
