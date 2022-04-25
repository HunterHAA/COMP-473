package FacilityMaintanence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Subject.FacilityMaintanenceSubject;
import ObserverPattern.FacilityMaintanenceObserver;

public class FacilityMaintanenceRequest implements FacilityMaintanenceSubject, FacilityMaintanence
{
	private List<FacilityMaintanenceObserver> observers = new ArrayList<FacilityMaintanenceObserver>();
	
    private int cost;
    private String usage;
    private Date startTime;
    private int facilityDownTime;
    private boolean maintenanceStatus;
    
    @Override
    public void addObserver(FacilityMaintanenceObserver fmo)
    {
    	observers.add(fmo);
    }
    
    @Override
    public void update() 
    {
		for(FacilityMaintanenceObserver observer : observers) 
		{
		    observer.update(usage, startTime, cost, facilityDownTime, maintenanceStatus);
		}
    }
    
    @Override
    public void removeObserver(FacilityMaintanenceObserver fmo)
    {
    	observers.remove(fmo);
    }
    
    //set methods
    public void setCost(int cost)
    {
    	System.out.println("\nUPDATE: The new cost for facility maintainanence is: " + cost + ".\n");
        this.cost = cost;
        update();
    }
    
    public void setUsage(String usage)
    {	
    	System.out.println("\nUPDATE: The new usage for facility maintainanence is: " + usage + ".\n");
        this.usage = usage;
        update();
    }
    
    public void setStartTime(Date startTime)
    {
    	System.out.println("\nUPDATE: The new start time for facility maintainanence is: " + startTime + ".\n");
        this.startTime = startTime;
        update();
    }

    //set down time for maintenance 
    public void setFacilityDownTime(int facilityDownTime)
    {
    	System.out.println("\nUPDATE: The new down time for facility maintainanence is: " + facilityDownTime + ".\n");
        this.facilityDownTime = facilityDownTime;
        update();
    }

    public void setMaintenanceStatus(boolean maintenanceStatus)
    {
    	if (maintenanceStatus == false)
		{
    		System.out.println("\nUPDATE: The current facility status is: During Maintenance!\n");
		}
    	else if (maintenanceStatus== true)
    		System.out.println("\nUPDATE: The current facility status is: Completed!\n");
        this.maintenanceStatus = maintenanceStatus;
        update();
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
}