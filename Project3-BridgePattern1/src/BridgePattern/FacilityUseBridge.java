package BridgePattern;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Facility.Facilities;
import Facility.Facility;
import FacilityMaintanence.FacilityMaintanence;
import FacilityMaintanence.FacilityMaintanenceRequest;
import FacilityMaintanence.FacilityMaintanenceService;
import FacilityUse.FacilityUse;
import FacilityUse.FacilityUseRequest;
import FacilityUse.FacilityUseService;

public class FacilityUseBridge extends Bridge3
{
	 public FacilityUseBridge(FacilityUseRequest facilityUseRequest) {
		// TODO Auto-generated constructor stub
	}

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

    //de-assigning a facility for use
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
    
    public void facilityUseBridge()
    {
    	System.out.println("\n" + "Bridge3" + "\n");
    	System.out.println("=====================================================" + "\n");
        Facility facility = new Facilities();

        FacilityMaintanenceService requestForService = new FacilityMaintanenceService();

        FacilityUseService reservationForService = new FacilityUseService();

        List<FacilityMaintanence> clientRequests = new ArrayList<>();
        List<FacilityUse> clientReservations = new ArrayList<>();

        //unreal data for testing
        facility.setClientName("Faker");
        facility.setFacilityCapacity(10);
        facility.setCurrentFacilityCapacity(facility.getFacilityCapacity());
        facility.setClientRequests(clientRequests);
        facility.setClientReservations(clientReservations);

        FacilityUse facilityAddress = new FacilityUseRequest();

        facilityAddress.setAddressLine1("1234 GreenTree Dr,");
        facilityAddress.setAddressLine2("apt 001");
        facilityAddress.setCity("Apple");
        facilityAddress.setState("XD");
        facilityAddress.setZip(12345);

        facility.setFacilityAddress(facilityAddress);

        FacilityMaintanence clientRequest = new FacilityMaintanenceRequest();

        clientRequest.setMaintenanceStatus(false);
        clientRequest.setFacilityDownTime(10);
        clientRequest.setCost(60);
        clientRequest.setUsage("meeting");
        clientRequest.setStartTime(Calendar.getInstance().getTime());

        requestForService.addNewRequest(clientRequest,facility);

        //call the assign facility for use method from ClientReservationService
        reservationForService.addFacilityToUse(Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),
               facility, "", "");

        System.out.println("Client Name: ");
        System.out.println(facility.getClientName());
        System.out.println();
        
        System.out.println("The limit of the facility: ");
        System.out.println(facility.getFacilityCapacity());
        System.out.println();
        
        System.out.println("The curent unassigned capacity for the facility : ");
        System.out.println(facility.getCurrentFacilityCapacity());
        System.out.println();
        
        System.out.println("The address of the facility: ");
        System.out.println(facility.getFacilityAddress().getAddressLine1());
        System.out.println(facility.getFacilityAddress().getAddressLine2());
        System.out.println(facility.getFacilityAddress().getCity());
        System.out.println(facility.getFacilityAddress().getState());
        System.out.println(facility.getFacilityAddress().getZip());
        System.out.println();
        
        System.out.println("The total cost for using the facility: ");
        System.out.println(requestForService.calculateCost(facility));
        System.out.println();
        
        System.out.println("The assigned duration of using time at the facility: ");
        System.out.println(requestForService.countUsingTime(facility));
    }
}
