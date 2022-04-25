
package HelpWedding;

import java.sql.Date;

/**
 *
 * @author Agnes Sagita Lumban Tobing 12S19013
 */
public class OrdersModel {
   private String OrderID;
   private String vendorID;
   private Date  orderDate;
   private String address;
   private String CustomerName;
   private String PaymentType;
   private int TotalPayment;
   private Date paymentDate;

   public OrdersModel(){
   }
   
    public OrdersModel(String OrderID, String vendorID, Date orderDate, String address, String CustomerName, String PaymentType, int TotalPayment, Date paymentDate) {
        this.OrderID = OrderID;
        this.vendorID = vendorID;
        this.orderDate = orderDate;
        this.address = address;
        this.CustomerName = CustomerName;
        this.PaymentType = PaymentType;
        this.TotalPayment = TotalPayment;
        this.paymentDate = paymentDate;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    public int getTotalPayment() {
        return TotalPayment;
    }

    public void setTotalPayment(int TotalPayment) {
        this.TotalPayment = TotalPayment;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
   
   
}
