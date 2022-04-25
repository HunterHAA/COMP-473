package bridge.Driving;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bridge.EngineTypes.*;
import bridge.VehicleTypes.*;


public class Driving {

    public static void main(String[] args) 
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
        System.out.println();
        
        FancyVehicles Leopard2A7 = new Leopard2A7(new Leopard2A7Engine());
        Leopard2A7.driving();
        
        FancyVehicles ShelbyMustangGT500 = new ShelbyMustangGT500(new Predator());
        ShelbyMustangGT500.driving();

    }
}
