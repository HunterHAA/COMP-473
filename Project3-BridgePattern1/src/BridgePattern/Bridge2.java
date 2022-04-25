package BridgePattern;

import java.util.Date;
import Facility.Facility;
import FacilityMaintanence.FacilityMaintanence;
import FacilityUse.FacilityUse;


public abstract class Bridge2 
{
	private int cost;
    private String usage;
    private Date startTime;
    private int facilityDownTime;
    private boolean maintenanceStatus;
    
    //set methods
    public void setCost(int cost)
    {
        this.cost = cost;
    }
    
    public void setUsage(String usage)
    {
        this.usage = usage;
    }
    
    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    //set down time for maintenance 
    public void setFacilityDownTime(int facilityDownTime)
    {
        this.facilityDownTime = facilityDownTime;
    }

    public void setMaintenanceStatus(boolean maintenanceStatus)
    {
        this.maintenanceStatus = maintenanceStatus;
    }
    
    //get methods
    public int getCost()
    {
        return cost;
    }
    
    public String getUsage()
    {
        return usage;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public int getFacilityDownTime()
    {
        return facilityDownTime;
    }

    public boolean getMaintenanceStatus()
    {
        return maintenanceStatus;
    }
    
	public abstract void facilityMaintanenceBridge();
}
