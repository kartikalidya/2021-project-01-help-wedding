package HelpWedding;

/**\
 * @author 12S19014 Kartika L.R. Sianipar
 */

public class ServicesModel {
    private String serviceName;
    private String serviceID;
    private int servicePrice;
    private String Detail;

    public ServicesModel(String serviceName, String serviceID, int servicePrice, String Detail) {
        this.serviceName = serviceName;
        this.serviceID = serviceID;
        this.servicePrice = servicePrice;
        this.Detail = Detail;
    }

    public ServicesModel() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public int getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(int servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String Detail) {
        this.Detail = Detail;
    }
    
}
