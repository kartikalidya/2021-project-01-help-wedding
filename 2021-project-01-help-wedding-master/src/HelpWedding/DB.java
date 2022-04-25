
package HelpWedding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agnes lumbantobing
 * @author imelda siregar
 * @author kartika sianipar
 * @author tiar simamora
 */

public class DB {
    private Connection con;
    private Statement statement;
    private String strConnect = "jdbc:sqlite:C:\\Users\\asus\\Documents\\GitHub\\2021-project-01-help-wedding\\src\\HelpWedding\\HelpWedding.db";
      public DB(){
         try {
               Class.forName("org.sqlite.JDBC");
               this.con = DriverManager.getConnection(this.strConnect);
               this.statement = this.con.createStatement();
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Connection to SQLite failed." +e.getMessage());
            }
      }
      public void insertData(String sql){
        try {
            this.statement.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error !");
        }
      }
      public LinkedList<OrdersModel>  getAllDataOrders(String sql) throws SQLException{
          LinkedList<OrdersModel> orders = new LinkedList<>();
          ResultSet resultSet = this.statement.executeQuery(sql);
          while(resultSet.next()){
              java.sql.Date OrderDate = resultSet.getDate("orderDate");
              java.sql.Date PaymentDate = resultSet.getDate("PaymentDate");
              OrdersModel order = new  OrdersModel();
              order.setOrderDate(OrderDate);
              order.setPaymentDate(PaymentDate);
              order.setCustomerName(resultSet.getString("CustomerName"));
              order.setPaymentType(resultSet.getString("PaymentType"));
              order.setOrderID(resultSet.getString("OrderID"));
              order.setVendorID(resultSet.getString("vendorID"));
              order.setAddress(resultSet.getString("orderAddress"));
              order.setTotalPayment(resultSet.getInt("TotalPayment"));
              orders.add(order);
          }
          return orders;
      }
      public void insertItem(String sql){
        try {
            this.statement.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("sql error");
        }
    }
      public LinkedList<OrderItemModel> getAllDataOrderItem(String sql) throws SQLException{
        LinkedList<OrderItemModel> orderItem = new LinkedList<>();
        ResultSet resultSet = this.statement.executeQuery(sql);
        while(resultSet.next()){
            OrderItemModel item = new  OrderItemModel();
            item.setOrderItemID(resultSet.getString("orderItemID"));
            item.setOrderID(resultSet.getString("orderID"));
            item.setServiceID(resultSet.getString("serviceID"));
            item.setQuantity(resultSet.getInt("quantity"));
            item.setPrice(resultSet.getInt("price"));
            orderItem.add(item);
        }
        return orderItem;
    }

    //totalprice
    public OrderItemModel getOneItem(String sql) throws SQLException{
        OrderItemModel item = null;
        ResultSet resultSet = this.statement.executeQuery(sql);
        while(resultSet.next()){
            item = new OrderItemModel();
            item.setOrderItemID(resultSet.getString("orderItemID"));
            item.setOrderID(resultSet.getString("orderID"));
            item.setServiceID(resultSet.getString("serviceID"));
            item.setQuantity(resultSet.getInt("quantity"));
            item.setPrice(resultSet.getInt("price"));
        }
        return item;
    }
    
    public LinkedList<ServicesModel>  getAllDataService(String sql) throws SQLException{
        LinkedList<ServicesModel> services = new LinkedList<>();
        ResultSet resultSet = this.statement.executeQuery(sql);
        while(resultSet.next()){
            ServicesModel service = new  ServicesModel();
            service.setServiceID(resultSet.getString("serviceID"));
            service.setServiceName(resultSet.getString("serviceName"));
            service.setServicePrice(resultSet.getInt("servicePrice"));
            service.setDetail(resultSet.getString("detail"));
            services.add(service);
        }
        return services;
    }

    public ServicesModel getOneService(String sql) throws SQLException{
        ServicesModel service = null;
        ResultSet resultSet = this.statement.executeQuery(sql);
        while(resultSet.next()){
           service = new ServicesModel();
           service.setServiceID(resultSet.getString("serviceID"));
           service.setServiceName(resultSet.getString("serviceName"));
           service.setServicePrice(resultSet.getInt("servicePrice"));
           service.setDetail(resultSet.getString("detail"));
        }
        return service;
    }
    public VendorModel getOneRowVendor (String sql) throws SQLException{
        VendorModel vendor = null;
        ResultSet resultSet = this.statement.executeQuery(sql);
          while(resultSet.next()){
            vendor = new VendorModel();
            vendor.setVendorID(resultSet.getString("VendorID"));
            vendor.setVendorID(resultSet.getString("Username"));
            vendor.setVendorID(resultSet.getString("Password"));

          }
        return vendor;
    }

    public OrdersModel getOneOrder(String sql) throws SQLException{
        OrdersModel order = null;
        ResultSet resultSet = this.statement.executeQuery(sql);
        while(resultSet.next()){
            order = new OrdersModel();
             java.sql.Date OrderDate = resultSet.getDate("orderDate");
              java.sql.Date PaymentDate = resultSet.getDate("PaymentDate");
              order.setOrderDate(OrderDate);
              order.setPaymentDate(PaymentDate);
              order.setCustomerName(resultSet.getString("CustomerName"));
              order.setPaymentType(resultSet.getString("PaymentType"));
              order.setOrderID(resultSet.getString("OrderID"));
              order.setVendorID(resultSet.getString("vendorID"));
              order.setAddress(resultSet.getString("orderAddress"));
              order.setTotalPayment(resultSet.getInt("TotalPayment"));
        }
        return order;

    }
}

