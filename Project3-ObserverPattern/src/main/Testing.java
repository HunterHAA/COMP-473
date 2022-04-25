package main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Facility.Facilities;
import Facility.Facility;
import FacilityMaintanence.FacilityMaintanence;
import FacilityMaintanence.FacilityMaintanenceRequest;
import FacilityMaintanence.FacilityMaintanenceService;
import FacilityUse.FacilityUse;
import FacilityUse.FacilityUseRequest;
import FacilityUse.FacilityUseService;

public class Testing 
{

    public static void main(String[] args) 
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        
        Facility facility = new Facilities();
        FacilityUse facilityUse = new FacilityUseRequest();

        FacilityMaintanenceService requestForService = new FacilityMaintanenceService();

        FacilityUseService reservationForService = new FacilityUseService();

        List<FacilityMaintanence> clientRequests = new ArrayList<>();
        List<FacilityUse> clientReservations = new ArrayList<>();

        //unreal data for testing
        System.out.println("The following output is faked data to test the observer pattern for the facility maintanence service.\n");
        facility.setClientName("Faker");
        facility.setFacilityCapacity(50);
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

        FacilityMaintanence maintanenceRequest = new FacilityMaintanenceRequest();

        maintanenceRequest.setMaintenanceStatus(true);
        maintanenceRequest.setFacilityDownTime(20);
        maintanenceRequest.setCost(50);
        maintanenceRequest.setUsage("Maintanence");
        maintanenceRequest.setStartTime(Calendar.getInstance().getTime());

        requestForService.addNewRequest(maintanenceRequest,facility);

        //call the assign facility for use method from ClientReservationService
        reservationForService.update(Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),
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
        
        System.out.println("The assigned duration of using time at the facility is: " + "\n" + requestForService.countUsingTime(facility) + "\n");
        
        if (maintanenceRequest.getMaintenanceStatus() == false)
		{
    		System.out.println("The current facility status is: \nDuring Maintenance!\n");
		}
    	else if (maintanenceRequest.getMaintenanceStatus()== true)
    		System.out.println("The current facility status is: \nMaintenance is completed!	\n");
        
        ////////////////////////////////////////////////////////////
        System.out.println("\n=================================================================\n");
        System.out.println("The following output is faked data to test the observer pattern for the facility using service.\n");
        
        facilityUse.setClientName("John");
        facilityUse.setUsingPurpose("Study");

        System.out.println("Client Name: ");
        System.out.println(facilityUse.getClientName());
        System.out.println();
        
        System.out.println("The using purpose is : ");
        System.out.println(facilityUse.getUsingPurpose());
        System.out.println();
        
        System.out.println("This facility will be used from : " + Calendar.getInstance().getTime() + " to " + Calendar.getInstance().getTime() + ".\n");
        
        System.out.println("The address of the facility: ");
        System.out.println(facility.getFacilityAddress().getAddressLine1());
        System.out.println(facility.getFacilityAddress().getAddressLine2());
        System.out.println(facility.getFacilityAddress().getCity());
        System.out.println(facility.getFacilityAddress().getState());
        System.out.println(facility.getFacilityAddress().getZip());
        System.out.println();

    }
}