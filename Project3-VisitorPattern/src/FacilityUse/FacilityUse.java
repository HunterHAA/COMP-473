package FacilityUse;

import java.util.Date;

import VisitorPattern.Visitor;

public interface FacilityUse 
{
    void setAddressLine1(String addressLine1);

    void setAddressLine2(String addressLine2);

    void setCity(String city);

    void setState(String state);

    void setZip(int zip);

    String getAddressLine1();

    String getAddressLine2();

    String getCity();

    String getState();

    int getZip();
    
	//set methods
    void setClientName(String clientName);

    void setUsingPurpose(String usingPurpose);

    void setStartTime(Date startTime);

    void setEndTime(Date endTime);

    //get methods
    String getClientName();

    String getUsingPurpose();

    Date getStartTime();

    Date getEndTime();
    
    public void accept(Visitor visitor);
}
