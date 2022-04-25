
package HelpWedding;

import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Agnes Sagita Lumban Tobing
 */
public class Orders {

    public DB dbCon;

    public LinkedList<OrdersModel> getAllOrders() throws SQLException{
        this.dbCon = new DB();
        String sql = "SELECT * FROM Orders";
        LinkedList<OrdersModel> orders = this.dbCon.getAllDataOrders(sql);
        return orders;
    }
    public void insertData(int lastId, String orderDate, String paymentDate){
       Scanner scan = new Scanner(System.in);
       String vendorID;
       String orderAddress;
       String customerName;
       String paymentType;
       int totalPayment;
       Date datePayment = new Date(paymentDate);
       Date dateOrder = new Date(orderDate); 
       System.out.println("Vendor ID: ");
       vendorID = scan.nextLine();
       System.out.println("orderAddress: ");
       orderAddress = scan.nextLine();
       System.out.println("customer Name: ");
       customerName = scan.nextLine();
       System.out.println("Payment Type: ");
       paymentType = scan.nextLine();
       System.out.println("Total Payment: ");
       totalPayment =Integer.parseInt(scan.nextLine());
       
        this.dbCon = new DB();
        
        long timePayment = datePayment.getTime();
        long timeOrder = dateOrder.getTime();
        String orderID = "ORD" + String.format("%04d",lastId  +1);
        String sql = "INSERT INTO Orders VALUES ('"+ orderID +" ', '"+vendorID+"','"+timeOrder +"','"+orderAddress+"','"+customerName +"','"+paymentType+"','"+totalPayment+"','"+timePayment +"')";
        this.dbCon.insertData(sql);
    }
    
}
