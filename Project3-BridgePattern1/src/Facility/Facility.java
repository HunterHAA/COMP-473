package Facility;

import java.util.List;

import FacilityMaintanence.FacilityMaintanence;
import FacilityUse.FacilityUse;

public interface Facility 
{	
    //set methods
    void setClientName(String clientName);
    
    void setFacilityCapacity(int facilityCapacity);

    void setCurrentFacilityCapacity(int currentFacilityCapacity);
    
    void setFacilities(List<Facility> facilities);

    void setClientRequests(List<FacilityMaintanence> clientRequests);

    void setClientReservations(List<FacilityUse> clientReservations);

    void setFacilityAddress(FacilityUse facilityAddress);  
    
    //get methods
    String getClientName();

    int getFacilityCapacity();

    int getCurrentFacilityCapacity();
    
    List<Facility> getFacilities();

    List<FacilityMaintanence> getClientRequests();

    List<FacilityUse> getClientReservations();

    FacilityUse getFacilityAddress();

	//add methods
    void addFacility(Facility facility);

    void addClientRequest(FacilityMaintanence clientRequest);

    void addClientReservation(FacilityUse clientReservation);

}
