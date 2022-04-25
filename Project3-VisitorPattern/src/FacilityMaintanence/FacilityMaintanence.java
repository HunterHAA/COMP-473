package FacilityMaintanence;

import java.util.Date;

import VisitorPattern.Visitor;

public interface FacilityMaintanence 
{
    void setUsage(String usage);
    
    void setCost(int cost);

    void setStartTime(Date startTime);

    void setFacilityDownTime(int facilityDownTime);

    void setMaintenanceStatus(boolean maintenanceStatus);

    String getUsage();

    Date getStartTime();

    int getCost();

    int getFacilityDownTime();

    boolean getMaintenanceStatus();
    
    public void accept(Visitor visitor);
}
