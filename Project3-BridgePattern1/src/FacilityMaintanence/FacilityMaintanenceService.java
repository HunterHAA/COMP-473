package FacilityMaintanence;

import java.util.Date;
import java.util.List;

import Facility.Facility;


public class FacilityMaintanenceService
{

	//create new request
    public FacilityMaintanence createNewRequest(String usage, Date startTime, int cost, int facilityDownTime, boolean maintenanceStatus)
    {
 
    	FacilityMaintanence newRequest = new FacilityMaintanenceRequest();

        newRequest.setUsage(usage);
        newRequest.setCost(cost);
        newRequest.setStartTime(startTime); 
        newRequest.setFacilityDownTime(facilityDownTime);
        
        return newRequest;
    }

    //add new client request to the server system
    public void addNewRequest(FacilityMaintanence clientRequest, Facility facility)
    {
        facility.addClientRequest(clientRequest);
    }

    public int calculateCost(Facility facility)
    {
        int cost = 0;
        List<FacilityMaintanence> clientRequests = facility.getClientRequests();
        for (int i = 0; i < clientRequests.size(); i++)
        {
            cost += clientRequests.get(i).getCost();
        }

        return cost;
    }

    public int countUsingTime(Facility facility)
    {
        int facilityDownTime = 0;
        List<FacilityMaintanence> clientRequests = facility.getClientRequests();
        for (int i = 0; i < clientRequests.size(); i++)
        {
            if (clientRequests.get(i).getMaintenanceStatus() == false)
            {
                facilityDownTime += clientRequests.get(i).getFacilityDownTime();
            }
        }
        return facilityDownTime;
    }
}
