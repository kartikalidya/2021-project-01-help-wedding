package HelpWedding;

import java.sql.SQLException;

/**
 * @author 12S19016 Tiar Saroha Simamora
 */

public class Vendor{
    
    public DB dbCon;
    
    public boolean Login (String username ,String password) throws SQLException{
        this.dbCon = new DB();
        String sql = "SELECT * FROM Vendor WHERE Username='" + username + "' and Password='" + password + "'";
        VendorModel vendor = this.dbCon.getOneRowVendor(sql);
        if(vendor != null){
            return true;
        }
        return false;
    }
}
    

