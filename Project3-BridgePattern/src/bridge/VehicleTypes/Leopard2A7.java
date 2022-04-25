package bridge.VehicleTypes;

import bridge.EngineTypes.FancyEngines;

public class Leopard2A7 extends FancyVehicles
{
    public Leopard2A7(FancyEngines engine)
    {
        this.engine = engine;
    }

    @Override
    public void driving() 
    {
    	int horsepower = engine.run();
        System.out.println("\nThe Leopard2A7 with the horsepower of " + horsepower + " is on the way to hunting."); 
	}
}
