package FacilityUse;

import java.util.Date;
import java.util.List;

import Facility.Facility;
import FacilityMaintanence.FacilityMaintanenceRequest;

public class FacilityUseService
{
    //checks the facility status
    public boolean capacityStatus(Facility facility)
    {
        if(facility.getCurrentFacilityCapacity() > 0)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }

    //add a selected time interval of the facility for client to use.
    public void addFacilityToUse(Date startDate, Date endDate, Facility facility, String clientName, String usingPurpose)
    {
        if (capacityStatus(facility) == false)
        {
        	FacilityUse clientReservation = new FacilityUseRequest();

            clientReservation.setClientName(clientName);
            clientReservation.setUsingPurpose(usingPurpose);
            clientReservation.setStartTime(startDate);
            clientReservation.setEndTime(endDate);
            
            //calculate the current capacity is available for using.
            facility.addClientReservation(clientReservation);
            int currentCapacity = facility.getCurrentFacilityCapacity();
            currentCapacity = currentCapacity - 1;
            facility.setCurrentFacilityCapacity(currentCapacity);
        }
    }

    //deassigning a facility for use
    public void deassigningFacility(Facility facility)
    {
        List<FacilityUse> clientReservations = null;
        facility.setClientReservations(clientReservations);
        facility.setCurrentFacilityCapacity(facility.getFacilityCapacity());
    }

    //returns a number times that the facility had been used
    public int getUsage(Facility facility)
    {
        return facility.getCurrentFacilityCapacity();
    }
}