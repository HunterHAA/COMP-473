package bridge.VehicleTypes;

import bridge.EngineTypes.FancyEngines;

public class ShelbyMustangGT500 extends FancyVehicles
{
    public ShelbyMustangGT500(FancyEngines engine)
    {
        this.engine = engine;
    }

    @Override
    public void driving() 
    {
    	int horsepower = engine.run();
        System.out.println("\nThe Shelby Mustang GT500 with the horsepower of " + horsepower + " is on the way to race."); 
	}
}
