package Facility;

import java.util.Date;
import java.util.List;

import FacilityMaintanence.FacilityMaintanence;
import FacilityUse.FacilityUse;

public class Facilities implements Facility 
{
	//private variables
	private String clientName;
    private List<Facility> facilities;
    private List<FacilityMaintanence> clientRequests;
    private List<FacilityUse> clientReservations;
    private FacilityUse facilityAddress;
    private int facilityCapacity;
    private int currentFacilityCapacity;
    

    //set methods
    public void setClientName(String clientName) 
    {
        this.clientName = clientName;
    }
    
    public void setFacilities(List<Facility> facilities)
    {
        this.facilities = facilities;
    }

    public void setClientRequests(List<FacilityMaintanence> clientRequests) 
    {
        this.clientRequests = clientRequests;
    }

    public void setClientReservations(List<FacilityUse> clientReservations) 
    {
        this.clientReservations = clientReservations;
    }

    public void setFacilityAddress(FacilityUse facilityAddress) 
    {
        this.facilityAddress = facilityAddress;
    }

    public void setFacilityCapacity(int facilityCapacity) 
    {
        this.facilityCapacity = facilityCapacity;
    }

    public void setCurrentFacilityCapacity(int currentFacilityCapacity) 
    {
        this.currentFacilityCapacity = currentFacilityCapacity;
    }

    //get methods
    public String getClientName() 
    {
        return clientName;
    }
    
    public List<FacilityMaintanence> getClientRequests() 
    {
        return clientRequests;
    }

    public List<FacilityUse> getClientReservations() 
    {
        return clientReservations;
    }

    public List<Facility> getFacilities()
    {
        return facilities;
    }

    public FacilityUse getFacilityAddress() 
    {
        return facilityAddress;
    }

    public int getFacilityCapacity() 
    {
        return facilityCapacity;
    }

    public int getCurrentFacilityCapacity() 
    {
        return currentFacilityCapacity;
    }

    public void addClientRequest(FacilityMaintanence clientRequest) 
    {
        clientRequests.add(clientRequest);
    }

    public void addClientReservation(FacilityUse clientReservation) 
    {
        clientReservations.add(clientReservation);
    }

    public void addFacility(Facility facility)
    {
        facilities.add(facility);
    }
}
