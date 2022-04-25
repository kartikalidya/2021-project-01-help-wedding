
package HelpWedding;

/**
 *
 * @author 12S19020 Imelda Siregar
 */
public class OrderItemModel {

    private String orderItemID;
    private String orderID;
    private String serviceID;
    private int quantity;
    private int price;

    public OrderItemModel(String orderitemID, String orderID, String serviceID, int quantity, int price) {
        this.orderItemID = orderitemID;
        this.orderID = orderID;
        this.serviceID = serviceID;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemModel(){
   }

    public String getOrderItemID() {
        return orderItemID;
    }

    public void setOrderItemID(String orderItemID) {
        this.orderItemID = orderItemID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

}
