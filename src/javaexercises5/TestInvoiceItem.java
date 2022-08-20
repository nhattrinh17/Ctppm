package javaexercises5;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(invoiceItem1);

        invoiceItem1.setQuantity(999);
        invoiceItem1.setUnitPrice(0.99);
        System.out.println(invoiceItem1);
        System.out.println("id is: " + invoiceItem1.getId());
        System.out.println("desc is: " + invoiceItem1.getDesc());
        System.out.println("quantily is: " + invoiceItem1.getQuantity());
        System.out.println("unitPrice is: " + invoiceItem1.getUnitPrice());

        System.out.println("The total is: " + invoiceItem1.getTotal());
    }
}
