package VisitorPattern;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Facility.Facilities;
import Facility.Facility;
import FacilityMaintanence.FacilityMaintanence;
import FacilityMaintanence.FacilityMaintanenceRequest;
import FacilityMaintanence.FacilityMaintanenceService;
import FacilityUse.FacilityUse;
import FacilityUse.FacilityUseRequest;
import FacilityUse.FacilityUseService;

public class FacilityVisit implements Visitor 
{
	public void visitFacility(Facilities facilities)
	{
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
        
        System.out.println("\n" + "The testing data for Facility is faked!" + "\n");
        System.out.println("=====================================================" + "\n");
	}

	public void visitFacilityMaintanence(FacilityMaintanenceRequest facilityMaintanenceRequest)
	{
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
        
        System.out.println("\n" + "The testing data for Facility is faked!" + "\n");
        System.out.println("=====================================================" + "\n");
	}
	
	public void visitFacilityUse(FacilityUseRequest facilityUseRequest)
	{
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
        
        System.out.println("\n" + "The testing data for Facility is faked!" + "\n");
        System.out.println("=====================================================" + "\n");
	}
}
