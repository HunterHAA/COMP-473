package main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Facility.*;
import FacilityMaintanence.*;
import FacilityUse.*;
import BridgePattern.*;

public class Testing 
{

    public static void main(String[] args) 
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
              
        Bridge2 facilityMaintanenceBridge = new FacilityMaintanenceBridge(new FacilityMaintanenceRequest());
        facilityMaintanenceBridge.facilityMaintanenceBridge(); 
        
        Bridge3 facilityUseBridge = new FacilityUseBridge(new FacilityUseRequest());
        facilityUseBridge.facilityUseBridge();
        
    }
}