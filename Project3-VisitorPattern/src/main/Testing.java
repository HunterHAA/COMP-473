package main;

//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Facility.Facilities;
import Facility.Facility;
import FacilityMaintanence.FacilityMaintanence;
import FacilityMaintanence.FacilityMaintanenceRequest;
//import FacilityMaintanence.FacilityMaintanenceService;
import FacilityUse.FacilityUse;
import FacilityUse.FacilityUseRequest;
//import FacilityUse.FacilityUseService;
//import VisitorPattern.Visitor;
import VisitorPattern.FacilityVisit;
import VisitorPattern.FacilityUseVisit;
import VisitorPattern.FacilityMaintanenceVisit;


public class Testing 
{

    public static void main(String[] args) 
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************" + "\n");
        
        FacilityVisit visitor1 = new FacilityVisit();
        FacilityUseVisit visitor2 = new FacilityUseVisit();
        FacilityMaintanenceVisit visitor3 = new FacilityMaintanenceVisit();
        
        Facility facilities = new Facilities(); 
        FacilityMaintanence facilityMaintanenceRequest = new FacilityMaintanenceRequest();
        FacilityUse facilityUseRequest = new FacilityUseRequest();
        
        facilities.accept(visitor1);
        facilityMaintanenceRequest.accept(visitor2);
        facilityUseRequest.accept(visitor3);
        
    }
}