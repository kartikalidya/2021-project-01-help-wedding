package HelpWedding;


/**
 * @author 12S19016 Tiar Saroha Simamora
 */

public class VendorModel {
    private String vendorID;
    private String username;
    private String password;

public VendorModel (){
    
}
    public VendorModel(String vendorID, String username, String password) {
        this.vendorID = vendorID;
        this.username = username;
        this.password = password;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}