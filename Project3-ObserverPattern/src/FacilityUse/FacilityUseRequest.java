package FacilityUse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Facility.Facility;
import FacilityMaintanence.FacilityMaintanence;
import Subject.FacilityUseSubject;
import ObserverPattern.FacilityMaintanenceObserver;
import ObserverPattern.FacilityUseObserver;

public class FacilityUseRequest implements FacilityUseSubject, FacilityUse
{
	private List<FacilityUseObserver> observers = new ArrayList<FacilityUseObserver>();
    
    private String clientName;
    private String usingPurpose;
    private Date startTime;
    private Date endTime;
    private Facility facility;
    
    @Override
    public void addObserver(FacilityUseObserver fuo)
    {
    	observers.add(fuo);
    }
    
    @Override
    public void update() 
    {
		for(FacilityUseObserver observer : observers) 
		{
		    observer.update(startTime, endTime, facility, clientName, usingPurpose);
		}
    }
    
    @Override
    public void removeObserver(FacilityUseObserver fuo)
    {
    	observers.remove(fuo);
    }

    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }

    public void setUsingPurpose(String usingPurpose)
    {
        this.usingPurpose = usingPurpose;
    }

    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    public void  setEndTime(Date endTime)
    {
        this.endTime = endTime;
    }
    
    public void setFacility(Facility facility)
    {
    	this.facility = facility;
    }

    public String getClientName()
    {
        return clientName;
    }

    public String getUsingPurpose()
    {
        return usingPurpose;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public Date getEndTime()
    {
        return endTime;
    }
    
  //private variables for address
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int zip;

    public void setAddressLine1(String addressLine1)
    {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2)
    {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }

    public String getAddressLine1() 
    {
        return addressLine1;
    }

    public String getAddressLine2() 
    {
        return addressLine2;
    }

    public String getCity() 
    {
        return city;
    }

    public String getState() 
    {
        return state;
    }

    public int getZip() 
    {
        return zip;
    }
}
