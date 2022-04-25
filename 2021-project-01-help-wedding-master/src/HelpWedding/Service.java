package HelpWedding;

import java.sql.SQLException;
import java.util.LinkedList;

/**
 * @author 12S19014 Kartika Lidya Sianipar
 */


public class Service {
    
    public DB dbCon;

    public LinkedList<ServicesModel> getAllService() throws SQLException{
        this.dbCon = new DB();
        String sql = "SELECT * FROM Service";
        LinkedList<ServicesModel> service = this.dbCon.getAllDataService(sql);
        return service;
    }
}
