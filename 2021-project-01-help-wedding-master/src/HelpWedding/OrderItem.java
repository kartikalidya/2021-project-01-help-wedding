
package HelpWedding;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author 12S19020 Imelda Siregar
 */
public class OrderItem {
    
    public DB dbCon;

    public LinkedList<OrderItemModel> getAllOrderItem() throws SQLException{
        this.dbCon = new DB();
        String sql = "SELECT * FROM orderItem";
        LinkedList<OrderItemModel> orderItem = this.dbCon.getAllDataOrderItem(sql);
        return orderItem;
    }
    public void insertItem(int lastItemID) throws SQLException{
       Scanner scan = new Scanner(System.in);
       String orderItemID = "ITM" + String.format("%04d",lastItemID  +1);
       String orderID;
       String serviceID;
       int quantity;
       
       System.out.println("Order ID: ");
       orderID = scan.nextLine();
       System.out.println("Service ID: ");
       serviceID = scan.nextLine();
       System.out.println("Quantity: ");
       quantity = Integer.parseInt(scan.nextLine());

        this.dbCon = new DB();
        String sqlPrice = "Select * FROM Service where serviceID= '"+ serviceID +"'";
        ServicesModel service = this.dbCon.getOneService(sqlPrice);
        Integer price = quantity * service.getServicePrice();
        String sql = "INSERT INTO orderItem VALUES ('"+ orderItemID +" ','"+orderID +"','"+serviceID+"','"+quantity +"','"+price+"')";
        this.dbCon.insertItem(sql);
    }
    
}
